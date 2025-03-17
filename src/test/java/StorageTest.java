import org.example.storage.IStorage;
import org.example.storage.IStorageFactory;
import org.example.storage.hadoop.cHadoopStorageFactory;
import org.example.storage.hadoop.cHadoopStorageInfoFactory;
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
