package org.minbeom.lib.delegate;

public interface Action1<T> extends IDelegate {
    void Invoke(T t);
}