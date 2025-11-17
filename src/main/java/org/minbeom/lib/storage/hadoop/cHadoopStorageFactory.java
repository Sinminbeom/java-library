package org.minbeom.lib.storage.hadoop;

import org.minbeom.lib.storage.IStorage;
import org.minbeom.lib.storage.IStorageFactory;
import org.minbeom.lib.storage.IStorageInfoFactory;

public class cHadoopStorageFactory implements IStorageFactory {
    private IStorageInfoFactory storageInfoFactory;

    public cHadoopStorageFactory(IStorageInfoFactory storageInfoFactory) {
        this.storageInfoFactory = storageInfoFactory;
    }

    @Override
    public IStorage createStorage() {
        IStorage storage = new cHadoopStorage();
        storage.setStorageClient(storageInfoFactory.createStorageClient());
        return storage;
    }
}
