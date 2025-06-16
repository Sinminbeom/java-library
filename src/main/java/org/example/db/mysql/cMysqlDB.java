package org.example.db.mysql;

import org.example.db.IDB;
import org.example.db.IDBClient;
import org.example.db.IDBRow;

import java.util.List;

public class cMysqlDB implements IDB {

    IDBClient dbClient;

    @Override
    public void Connect() {
        dbClient.Connect();
    }

    @Override
    public void Close() {
        dbClient.Close();
    }

    @Override
    public List<IDBRow> ExecuteQuery(String query) {
        return dbClient.ExecuteQuery(query);
    }

    @Override
    public boolean IsConnect() {
        return dbClient.IsConnect();
    }

    @Override
    public void setDBClient(IDBClient dbClient) {
        this.dbClient = dbClient;
    }
}
