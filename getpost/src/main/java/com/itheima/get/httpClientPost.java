package com.itheima.get;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: MR.z
 * @Date: 2018/12/20 23:40
 * @Version 1.0
 */
public class httpClientPost {
    public static void main(String[] args) throws IOException {
//        指定url
        String url = "http://www.itcast.cn";
//        指定发送方式post
        HttpPost httpPost = new HttpPost(url);
//        获取httpclient实例,用来请求
        CloseableHttpClient httpClient = HttpClients.createDefault();
//        封装数据
        List<NameValuePair> pairs = new ArrayList<NameValuePair>();
        pairs.add(new BasicNameValuePair("username","张三"));
        pairs.add(new BasicNameValuePair("password","123"));
        HttpEntity entity = new UrlEncodedFormEntity(pairs);
        httpPost.setEntity(entity);

//        执行请求
        CloseableHttpResponse response = httpClient.execute(httpPost);
//        获取数据
        int statusCode = response.getStatusLine().getStatusCode();//获取状态码
        if (statusCode==200){
            String html = EntityUtils.toString(response.getEntity());
            System.out.println(html);
        }
        httpClient.close();
    }
}
