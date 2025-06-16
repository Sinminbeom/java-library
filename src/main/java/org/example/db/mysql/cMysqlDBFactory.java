package org.example.db.mysql;

import org.example.db.IDB;
import org.example.db.IDBFactory;
import org.example.db.IDBInfoFactory;

public class cMysqlDBFactory implements IDBFactory {
    private IDBInfoFactory dbInfoFactory;

    public cMysqlDBFactory(IDBInfoFactory dbInfoFactory) {
        this.dbInfoFactory = dbInfoFactory;
    }

    @Override
    public IDB createDB(String url, String user, String password) {
        IDB db = new cMysqlDB();
        db.setDBClient(dbInfoFactory.createDBClient(url, user, password));
        return db;
    }
}
