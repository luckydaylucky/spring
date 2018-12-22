package com.itheima.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @Author: MR.z
 * @Date: 2018/12/13 10:37
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans.xml")
public class JdbcTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;
//    插入数据
    @Test
    public void test(){
        this.jdbcTemplate.update("insert into counnts values (23,'李四',2000)");
    }

//    根据id查询数据
    @Test
    public void testId(){
        String sql = "select * from counnts where id = ?";
        String s = jdbcTemplate.queryForObject(sql, String.class, 3);
        System.out.println(s);
    }

//    根据id查询
    @Test
    public void testId1(){
        String sql = "select * from counnts where id = ?";
        Account account = (Account) jdbcTemplate.queryForList(sql, new rowMapperAccount(), 3);
        System.out.println(account);
    }

    class rowMapperAccount implements RowMapper<Account>{

        public Account mapRow(ResultSet resultSet, int i) throws SQLException {
//            创建账户对象
            Account account = new Account();
//            给账户对象赋值
            account.setId(resultSet.getInt("id"));
            account.setUsername(resultSet.getString("username"));
            account.setMoney(resultSet.getInt("money"));

            return account;
        }
    }

//    全查询案例
    @Test
    public void testQuerry(){
        List<Account> query = jdbcTemplate.query("select * from counnts;", new rowMapperAccount());
        for (Account a : query ) {
            System.out.println(a.getUsername());
        }
    }
}
