package org.minbeom.lib.storage;

public interface IStorageClient {
    void Connect();
    void Disconnect();
    void Upload(String srcPath, String dstPath);
    void Download(String srcPath, String dstPath);
}
