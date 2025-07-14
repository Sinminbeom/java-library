package org.minbeom.lib.db;

public interface IDBFactory {
    IDB createDB(String url, String user, String password);
}
