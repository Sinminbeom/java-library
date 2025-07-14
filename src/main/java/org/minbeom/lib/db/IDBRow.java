package org.minbeom.lib.db;

public interface IDBRow {
    void Push(String key, Object value);
    Object Get(String key);
    int Size();
}
