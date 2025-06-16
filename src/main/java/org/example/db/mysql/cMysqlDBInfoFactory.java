package org.example.db.mysql;

import org.example.db.IDBClient;
import org.example.db.IDBInfoFactory;

public class cMysqlDBInfoFactory implements IDBInfoFactory {
    @Override
    public IDBClient createDBClient(String url, String user, String password) {
        IDBClient dbClient = new cMysqlDBClient(url, user, password);
        return dbClient;
    }
}
