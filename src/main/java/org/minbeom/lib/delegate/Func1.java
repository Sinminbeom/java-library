package org.minbeom.lib.delegate;

public interface Func1<T, R> extends IDelegate {
    R Invoke(T t);
}