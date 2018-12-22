package com.itheima.study;




import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class practice {
    @Test
    public void add() throws SQLException {
        QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
//        try {
//            qr.update("insert into product values (null,'手机',5000)");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
        int conut = qr.update("insert into product values(null,?,?)", "微型投影仪", 5000);
    }

    @Test
    public void update() throws SQLException {
        QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
        int count = qr.update("update product set pname = '电冰箱' where pid = 1");
        System.out.println(count);
    }

    @Test
    public void delete() {
        QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
//        try {
//            qr.update("delete from product where pid = 2");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
        try {
            int count = qr.update("delete from product where pid = ?", 3);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void select() throws SQLException {
        QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
        String sql = "select * from product where pid = ?";
        Product product = qr.query(sql,new BeanHandler<Product>(Product.class),1);
        System.out.println(product);
    }

    @Test
    public void selectt() throws SQLException {
        QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
        String sql = "select *from product";
        List<Product> list = qr.query(sql, new BeanListHandler<Product>(Product.class));
        System.out.print(list);

    }

//    查询指定内容
    @Test
    public void selll() throws SQLException {
        QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
        String sql = "select pname from product";
        List<Object> listl = qr.query(sql,new ColumnListHandler<>());
        System.out.println(listl);
    }

    @Test
    public void selet() throws SQLException {
        QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
        String sql = "select count(*) from product";
        Long count = (long)qr.query(sql,new ScalarHandler<>());

        System.out.println(count);
    }

    @Test
    public void change() throws ClassNotFoundException, SQLException{
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/day04","root","root");
            con.setAutoCommit(false);
            String sql = "update account set money = money + ? where name = ?";

            PreparedStatement pst = con.prepareStatement(sql);

            pst.setDouble(1,-1000);
            pst.setString(2,"jack");

            int i = pst.executeUpdate();
            System.out.println("jack减钱"+i);


            pst.setDouble(1,+1000);
            pst.setString(2,"rose");

            int i1 = pst.executeUpdate();
            System.out.println("rose"+i1);

            con.commit();
            System.out.println("转账成功交易结束");
            pst.close();
            con.close();
        } catch (Exception e) {

            con.rollback();
            System.out.println("转账失败，交易结束");
            e.printStackTrace();
        }



    }


}





