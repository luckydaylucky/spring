package com.itheima.four;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

public class JdbcTest {
    @Test
    public void addQuerry(){
        QueryRunner qr = new QueryRunner(Jdbctuils.getDataSource());
        String sql = "insert into product values (null,'电脑','5000')";
    }
    @Test
    public void update() throws SQLException {
        QueryRunner qr = new QueryRunner(Jdbctuils.getDataSource());
        qr.update("update product set pname = '洗衣机' where pid = 1");
    }

    @Test
    public void delete(){
        QueryRunner qr = new QueryRunner(Jdbctuils.getDataSource());
        try {
            qr.update("delete from product where pid=1");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void demo() throws SQLException {
        QueryRunner qr = new QueryRunner(Jdbctuils.getDataSource());

       String sql = "select *from product where pid = ?";
       qr.query(sql,new BeanHandler<Product>(Product.class));
//       System.out.println(Product);
    }




}
