package org.minbeom.lib.storage;

public interface IStorageInfoFactory {
    IStorageClient createStorageClient(String url);
}
