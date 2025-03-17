package org.example;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.fs.FSDataInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World!");

        String hdfsUri = "hdfs://localhost:9000";
        String filePath = "/fdfdfd.txt";

        Configuration conf = new Configuration();
        conf.set("fs.defaultFS", hdfsUri);



        try {
            FileSystem fs = FileSystem.get(new URI(hdfsUri), conf);
            Path path = new Path(filePath);
            if (fs.exists(path)) {
                FSDataInputStream inputStream = fs.open(path);
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
                reader.close();
                fs.close();
            } else {
                System.out.println("File does not exist");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}