package org.minbeom.lib.delegate;

public interface Func<R> extends IDelegate {
    R Invoke();
}
