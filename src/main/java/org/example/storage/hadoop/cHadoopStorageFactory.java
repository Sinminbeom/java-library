package org.example.storage.hadoop;

import org.example.storage.IStorage;
import org.example.storage.IStorageFactory;
import org.example.storage.IStorageInfoFactory;

public class cHadoopStorageFactory implements IStorageFactory {
    private IStorageInfoFactory storageInfoFactory;

    public cHadoopStorageFactory(IStorageInfoFactory storageInfoFactory) {
        this.storageInfoFactory = storageInfoFactory;
    }

    @Override
    public IStorage createStorage(String url) {
        IStorage storage = new cHadoopStorage();
        storage.setStorageClient(storageInfoFactory.createStorageClient(url));
        return storage;
    }
}
