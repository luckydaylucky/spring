package com.itheima.a;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.List;

public class JBUtilsTest {
    @Test
    public void add() throws SQLException {
        QueryRunner qr = new QueryRunner(JButis.getdatasoce());
        int cuount = qr.update("insert into product values(?,?,?,?)",14,"微型投影仪",5000,"c003");
        System.out.println(cuount);
    }


    @Test
    public void update() throws SQLException {
        QueryRunner qr = new QueryRunner(JButis.getdatasoce());

        int count = qr.update("update product set pname = ? where pid = ?","电冰箱",2);
        System.out.println(count);
    }

    @Test
    public void delete() throws SQLException {
        QueryRunner qr = new QueryRunner(JButis.getdatasoce());
        int count = qr.update("delete from product where pid = 2");
        System.out.println(count);
    }


    @Test
    public void select() throws SQLException {
        QueryRunner qr = new QueryRunner(JButis.getdatasoce());
        String sql = "select *from product where pid = ?";
        productTest productTest = qr.query(sql,new BeanHandler<productTest>(com.itheima.a.productTest.class),4);
        System.out.println(productTest);
    }

    @Test
    public void selectt() throws SQLException {
        QueryRunner qr  = new QueryRunner(JButis.getdatasoce());

        String sql = "select *from product";
        List<productTest> list = qr.query(sql,new BeanListHandler<productTest>(productTest.class));
        System.out.println(list);
    }

    @Test
    public void selt() throws SQLException {
        QueryRunner qr = new QueryRunner(JButis.getdatasoce());
        String sql = "select *from product";
        List<Object> list = qr.query(sql,new ColumnListHandler<>());
        System.out.println(list);
    }

    @Test
    public void selectte() throws SQLException {
        QueryRunner qr = new QueryRunner(JButis.getdatasoce());
        String sql = "select count(*) product";
        Long count = (Long) qr.query(sql,new ScalarHandler<>());
        System.out.println(count);
    }


}
