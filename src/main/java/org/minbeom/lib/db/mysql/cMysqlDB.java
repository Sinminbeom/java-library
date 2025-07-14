package org.minbeom.lib.db.mysql;

import org.minbeom.lib.db.IDB;
import org.minbeom.lib.db.IDBClient;
import org.minbeom.lib.db.IDBRow;

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
