package org.example.db;

public interface IDBRow {
    void Push(String key, Object value);
    Object Get(String key);
    int Size();
}
