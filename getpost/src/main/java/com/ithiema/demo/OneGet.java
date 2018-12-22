package com.ithiema.demo;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * @Author: MR.z
 * @Date: 2018/12/20 23:50
 * @Version 1.0
 */
public class OneGet {
//    指定url
    String url = "https://www.qidian.com";
//    获取httpclient对象
    CloseableHttpClient httpClient = HttpClients.createDefault();
//    获取请求方式
    HttpGet httpGet = new HttpGet(url);
//    执行请求
    CloseableHttpResponse response = httpClient.execute(httpGet);
//    获取网页
    String html = EntityUtils.toString(response.getEntity(),"utf-8");
//    解析网页
    Document document = Jsoup.parse(html);
//    获取24小时热门榜单
    Elements timet = document.select("div[class=rank-list sort-list]");
//    获取榜单的标题
    String h3 = timet.select("h3").text();
//    获取书籍列表
    Elements booklist = timet.select(".book-list li a[href*=book.qidian.com]");
//    获取书籍url
//    for(Element element: booklist){
//        String href = element.attr
//    }

    public OneGet() throws IOException {
    }
}
