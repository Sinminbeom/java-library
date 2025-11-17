package org.minbeom.lib.storage.hadoop;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.minbeom.lib.storage.IStorageClient;

import java.io.IOException;
import java.net.URI;

public class cHadoopStorageClient implements IStorageClient {
    private String url;
    private Configuration conf = new Configuration();
    private FileSystem fs;

    public cHadoopStorageClient(String url) {
        this.url = url;
    }

    @Override
    public void Connect() {
        this.conf.set("fs.defaultFS", this.url);
        try {
            this.fs = FileSystem.get(new URI(this.url), conf);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void Disconnect() {
        try {
            fs.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void Upload(String srcPath, String dstPath) {
        try {
            fs.copyFromLocalFile(new Path(srcPath), new Path(dstPath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void Download(String srcPath, String dstPath) {
        try {
            fs.copyToLocalFile(new Path(srcPath), new Path(dstPath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
