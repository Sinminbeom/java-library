package org.example.storage;

public interface IStorageFactory {
    IStorage createStorage(String url);
}
