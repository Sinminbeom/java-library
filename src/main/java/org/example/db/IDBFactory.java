package org.example.db;

public interface IDBFactory {
    IDB createDB(String url, String user, String password);
}
