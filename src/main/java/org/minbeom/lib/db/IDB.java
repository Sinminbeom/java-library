package org.minbeom.lib.db;

import java.util.List;

public interface IDB {
    void Connect();
    void Close();
    List<IDBRow> ExecuteQuery(String query);
    boolean IsConnect();
    void setDBClient(IDBClient dbClient);
}
