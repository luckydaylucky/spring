package com.itheima.get;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.nio.charset.Charset;

/**
 * @Author: MR.z
 * @Date: 2018/12/20 23:34
 * @Version 1.0
 */
public class httpclitTest {
    public static void main(String[] args) throws IOException {
//       指定url
        String url = "http://www.itcast.cn";
//        指定发送方式
        HttpGet httpGet = new HttpGet(url);
//        获取httpclient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
//        执行请求
        CloseableHttpResponse response = httpClient.execute(httpGet);
//        获取网页数据
        int status = response.getStatusLine().getStatusCode();
        if (status==200){
            String html = EntityUtils.toString(response.getEntity(), Charset.forName("utf-8"));
            System.out.println(html);
        }
        httpClient.close();
    }
}
