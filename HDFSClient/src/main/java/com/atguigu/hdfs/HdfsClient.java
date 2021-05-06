package com.atguigu.hdfs;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.junit.Test;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class HdfsClient {
    @Test
    public void testMkdirs() throws URISyntaxException, IOException, InterruptedException {
        //创建配置文件
        Configuration configuration = new Configuration();
        //获取客户端对象
        FileSystem fs = FileSystem.get(new URI("hdfs://hadoop102:8020"), configuration,"atguigu");
        //操作
        fs.copyFromLocalFile(new Path("d:/sunwukong.txt"), new Path("/xiyou/huaguoshan"));

        //创建一个文件fs.mkdirs(new Path("/xiyou/huaguoshan/"));
        //关闭
        fs.close();

    }



}
