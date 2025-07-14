package org.minbeom.lib.db.mysql;

import org.minbeom.lib.db.IDB;
import org.minbeom.lib.db.IDBFactory;
import org.minbeom.lib.db.IDBInfoFactory;

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
