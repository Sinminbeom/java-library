package org.minbeom.lib.db;

import java.util.List;

public interface IDBClient {
    void Connect();
    void Close();
    boolean IsConnect();
    List<IDBRow> ExecuteQuery(String query);
}
