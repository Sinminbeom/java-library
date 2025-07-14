import org.minbeom.lib.storage.IStorage;
import org.minbeom.lib.storage.IStorageFactory;
import org.minbeom.lib.storage.hadoop.cHadoopStorageFactory;
import org.minbeom.lib.storage.hadoop.cHadoopStorageInfoFactory;
import org.junit.jupiter.api.Test;

public class StorageTest {
    @Test
    public void HadoopStorage() {
        String url = "hdfs://localhost:9000";
        IStorageFactory storageFactory = new cHadoopStorageFactory(new cHadoopStorageInfoFactory());
        IStorage storage = storageFactory.createStorage(url);
        storage.Upload("C:\\Users\\alsqj\\test.txt", "/");
    }
}
