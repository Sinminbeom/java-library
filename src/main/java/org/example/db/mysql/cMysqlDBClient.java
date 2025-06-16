package org.example.db.mysql;

import org.example.db.IDBClient;
import org.example.db.IDBRow;
import org.example.db.cDBRow;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class cMysqlDBClient implements IDBClient {
    private String driver = "com.mysql.cj.jdbc.Driver";
    private String url;
    private String user;
    private String password;
    private Connection connection;

    public cMysqlDBClient(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }

    @Override
    public void Connect() {
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException();
        }
    }

    @Override
    public void Close() {
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean IsConnect() {
        try {
            return connection.isValid(5);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<IDBRow> ExecuteQuery(String query) {
        try {
            List<IDBRow> rows = new ArrayList<>();

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            ResultSetMetaData metaData = resultSet.getMetaData();

            int columnCnt = metaData.getColumnCount();

            while(resultSet.next()) {
                IDBRow row = new cDBRow();

                for (int i = 1; i <= columnCnt; i++) {
                    String columnName = metaData.getColumnName(i);
                    Object object = resultSet.getObject(columnName);
                    row.Push(columnName, object);
                }

                rows.add(row);

            }

            return rows;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
