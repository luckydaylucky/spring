package com.itheima.a;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;

public class JBUtilsMoney {
    @Test
    public void Money() throws SQLException {
        Connection con = null;
        try {
            con = JButis.getconnection();

            con.setAutoCommit(false);

            QueryRunner qr = new QueryRunner();
            int i = qr.update(con,"update account set money = money + ? where name = ?",+1000,"jack");
            System.out.println("Jack减钱"+i);

            int i1 = qr.update(con,"update account set money = money + ? where name = ?",1000,"rose");

            System.out.println("rose加钱"+i1);


        } catch (Exception e) {
            DbUtils.commitAndCloseQuietly(con);
            DbUtils.rollbackAndCloseQuietly(con);
            e.printStackTrace();
        }


    }
}
