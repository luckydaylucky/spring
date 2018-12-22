package com.itheima.upload;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.attribute.FileTime;
import java.util.List;

/**
 * @Author: MR.z
 * @Date: 2018/12/3 10:15
 * @Version 1.0
 */
@WebServlet("/UploadServlet")
public class UploadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
//创建磁盘工厂对象
        DiskFileItemFactory dfif = new DiskFileItemFactory();
//        创建核心解析类
        ServletFileUpload FileUpload = new ServletFileUpload(dfif);
//        判断creatue对象

            List<FileItem> list = FileUpload.parseRequest(request);
            for (FileItem Item:list)
                if (Item.isFormField()) {
                    String fieldName = Item.getFieldName();
                    String string = Item.getString("UTF-8");
                    System.out.println(fieldName + " " + string);
                } else {
                    String fieldName = Item.getName();
                    InputStream in = Item.getInputStream();
                    FileOutputStream fos = new FileOutputStream("E:/dowload"+fieldName);
                    int len;
                    byte[] arr = new byte[1024<<2];
                    while ((len=in.read(arr))!=-1){
                        fos.write(arr,0,len);
                    }
                    in.close();
                    fos.close();
                }
        } catch (FileUploadException e) {
            e.printStackTrace();
        }
//        核心解析对象requerst

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
