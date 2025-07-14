import org.minbeom.lib.db.IDB;
import org.minbeom.lib.db.IDBFactory;
import org.minbeom.lib.db.IDBRow;
import org.minbeom.lib.db.mysql.cMysqlDBFactory;
import org.minbeom.lib.db.mysql.cMysqlDBInfoFactory;
import org.junit.jupiter.api.Test;

import java.sql.*;
import java.util.List;

public class DBTest {
    @Test
    public void Mysql() throws SQLException {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1:3308/test?serverTimezone=UTC&useUniCode=yes&characterEncoding=UTF-8";
        String user = "oracle";
        String password = "tlsalsqja12!";

        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection conn = DriverManager.getConnection(url, user, password);
        Statement stmt = conn.createStatement();

        String sql = "select * from user";
        ResultSet rs = stmt.executeQuery(sql);

        ResultSetMetaData metaData = rs.getMetaData();

        int columnCnt = metaData.getColumnCount();

        while(rs.next()) {
            for (int i = 1; i <= columnCnt; i++) {
                String columnName = metaData.getColumnName(i);
                Object object = rs.getObject(columnName);

                System.out.println(columnName + " : " + object);
            }

        }


    }

    @Test
    public void test() {
        String url = "jdbc:mysql://127.0.0.1:3308/test?serverTimezone=UTC&useUniCode=yes&characterEncoding=UTF-8";
        String user = "oracle";
        String password = "tlsalsqja12!";

        String sql = "select * from user";

        IDBFactory dbFactory = new cMysqlDBFactory(new cMysqlDBInfoFactory());
        IDB db = dbFactory.createDB(url, user, password);

        db.Connect();
        List<IDBRow> rows = db.ExecuteQuery(sql);

        for(IDBRow row : rows) {
            Object userId = row.Get("userId");
            Object username = row.Get("username");
            System.out.println(userId + " : " + username);
        }

        db.IsConnect();

        db.Close();

    }
}
