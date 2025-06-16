package org.example.db;

public interface IDBInfoFactory {
    IDBClient createDBClient(String url, String user, String password);
}
