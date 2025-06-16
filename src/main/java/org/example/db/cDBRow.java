package org.example.db;

import java.util.HashMap;
import java.util.Map;

public class cDBRow implements IDBRow {
    private Map<String, Object> row = new HashMap<>();

    public void Push(String key, Object value) {
        row.put(key, value);
    }

    public Object Get(String key) {
        return row.get(key);
    }

    public int Size() {
        return row.size();
    }
}
