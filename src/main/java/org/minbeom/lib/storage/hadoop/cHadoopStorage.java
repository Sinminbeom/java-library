package org.minbeom.lib.storage.hadoop;

import org.minbeom.lib.storage.IStorage;
import org.minbeom.lib.storage.IStorageClient;

public class cHadoopStorage implements IStorage {

    private IStorageClient storageClient;

    public cHadoopStorage() {
    }

    @Override
    public void Connect() {

    }

    @Override
    public void Disconnect() {

    }

    @Override
    public void Upload(String srcPath, String dstPath) {
//        storageClient.Upload(new Path(srcPath), new Path(dstPath));
        storageClient.Upload(srcPath, dstPath);
    }

    @Override
    public void Download() {

    }

    @Override
    public void setStorageClient(IStorageClient storageClient) {
        this.storageClient = storageClient;
    }

}
