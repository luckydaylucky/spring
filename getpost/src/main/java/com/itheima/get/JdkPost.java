package com.itheima.get;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @Author: MR.z
 * @Date: 2018/12/20 23:23
 * @Version 1.0
 */
public class JdkPost {
    public static void main(String[] args) throws IOException {
        //指定url路径
        String url = "http://www.itcast.cn";
//        创建url对象
        URL url1 = new URL(url);
//        打开一个链接
        HttpURLConnection connection = (HttpURLConnection) url1.openConnection();
//        指定请求方式
        connection.setRequestMethod("POST");
//        打开输出流
        connection.setDoOutput(true);

//        封装数据
        OutputStream outputStream = connection.getOutputStream();
        outputStream.write("username=张三&password=123".getBytes());
//        获取输入流
        InputStream in = connection.getInputStream();
//        打印数据
        byte[] b = new byte[1024];
        int len;
        while ((len = in.read(b))!=-1){
            System.out.println(new String(b,0,len));
        }
        in.close();
        outputStream.close();
    }
}
