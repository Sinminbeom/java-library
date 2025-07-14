package org.minbeom.lib.storage;

public interface IStorageFactory {
    IStorage createStorage(String url);
}
