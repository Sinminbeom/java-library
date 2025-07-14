package org.minbeom.lib.db.mysql;

import org.minbeom.lib.db.IDBClient;
import org.minbeom.lib.db.IDBInfoFactory;

public class cMysqlDBInfoFactory implements IDBInfoFactory {
    @Override
    public IDBClient createDBClient(String url, String user, String password) {
        IDBClient dbClient = new cMysqlDBClient(url, user, password);
        return dbClient;
    }
}
