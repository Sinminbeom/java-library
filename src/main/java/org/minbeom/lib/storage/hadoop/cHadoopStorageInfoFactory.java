package org.minbeom.lib.storage.hadoop;

import org.minbeom.lib.storage.IStorageClient;
import org.minbeom.lib.storage.IStorageInfoFactory;

public class cHadoopStorageInfoFactory implements IStorageInfoFactory {
    private String url;

    public cHadoopStorageInfoFactory(String url) {
        this.url = url;
    }

    @Override
    public IStorageClient createStorageClient() {
        IStorageClient storageClient = new cHadoopStorageClient(this.url);
        return storageClient;
    }
}
