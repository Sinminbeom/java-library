package org.minbeom.lib.storage.hadoop;

import org.minbeom.lib.storage.IStorageClient;
import org.minbeom.lib.storage.IStorageInfoFactory;

public class cHadoopStorageInfoFactory implements IStorageInfoFactory {

    @Override
    public IStorageClient createStorageClient(String url) {
        IStorageClient storageClient = new cHadoopStorageClient(url);
        return storageClient;
    }
}
