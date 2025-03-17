package org.example.storage;

public interface IStorageInfoFactory {
    IStorageClient createStorageClient(String url);
}
