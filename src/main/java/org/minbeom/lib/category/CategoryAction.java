package org.minbeom.lib.category;

import org.minbeom.lib.delegate.Action;
import org.minbeom.lib.delegate.IDelegate;

public class CategoryAction implements CategoryComponent {

    private final Action action;

    public CategoryAction(Action action) {
        this.action = action;
    }

    public void Invoke() {
        this.action.Invoke();
    }

}
