package com.itheima.get;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;

/**
 * @Author: MR.z
 * @Date: 2018/12/20 22:55
 * @Version 1.0
 */
public class JdkGet {
    @Test
            public void testGet() throws IOException {
//        指定一个url
        String domain = "http://www.baidu.com";
//        打开一个链接
        URL url = new URL(domain);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//        如果是一个get请求，需要设置请求头信息
//        请求方式,必须是大写

        connection.setRequestMethod("GET");
//        发起请求
//        当用户调用getinputstream 其实就是一个请求,并获取一个流输入
        InputStream inputStream = connection.getInputStream();
//        打印数据
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(inputStream, Charset.forName("utf-8"))
        );
        String line = null;
        while ((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }
    }



}
