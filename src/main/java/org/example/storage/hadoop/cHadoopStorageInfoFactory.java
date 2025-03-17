package org.example.storage.hadoop;

import org.example.storage.IStorageClient;
import org.example.storage.IStorageInfoFactory;

public class cHadoopStorageInfoFactory implements IStorageInfoFactory {

    @Override
    public IStorageClient createStorageClient(String url) {
        IStorageClient storageClient = new cHadoopStorageClient(url);
        return storageClient;
    }
}
