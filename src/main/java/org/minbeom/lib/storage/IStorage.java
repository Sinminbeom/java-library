
package org.minbeom.lib.storage;

public interface IStorage {
    void Connect();
    void Disconnect();
    void Upload(String srcPath, String dstPath);
    void Download();
    void setStorageClient(IStorageClient storageClient);
}
