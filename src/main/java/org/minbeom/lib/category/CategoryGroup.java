package org.minbeom.lib.category;

import java.util.HashMap;
import java.util.Map;

public class CategoryGroup implements CategoryComponent {

    private Map<String, CategoryComponent> children = new HashMap<>();

    public void Push(String name, CategoryComponent component) {
        children.put(name, component);
    }

    public CategoryComponent Get(String name) {
        return children.get(name);
    }
    public Map<String, CategoryComponent> getChildren() {
        return children;
    }

}
