package com.itheima.dao;

import com.itheima.domain.Emp;
import com.itheima.domain.EmpDept;
import com.itheima.utils.JDBCUTIls;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

/**
 * @Author: MR.z
 * @Date: 2018/12/2 18:42
 * @Version 1.0
 */
public class EmpImpl implements EmpDao {
    DataSource dataSource = JDBCUTIls.dataSource;
    QueryRunner qr = new QueryRunner(dataSource);
    @Override
    public List<EmpDept> findEmp() throws SQLException {
        String sql = "select uid,uname,sex,tel,email,address,d.dname from emp e,dept d where e.did=d.did";
        List<EmpDept> query = qr.query(sql, new BeanListHandler<EmpDept>(EmpDept.class));
        return query;
    }

    @Override
    public int del(int id) throws SQLException {
        int count = qr.update("delete from emp where uid = ?",id);
        return count;
    }
//增加员工信息
    @Override
    public void addEmp(Emp emp) throws SQLException {
        qr.update("insert into emp values (null,?,?,?,?,?,?)",emp.getUname(),emp.getSex(),emp.getTel(),emp.getEmail(),emp.getAddress(),emp.getDid());
    }
//根据id查找员工信息
    @Override
    public void queryEmpByid(int id) throws SQLException {
        Emp query = qr.query("select *from emp where uid = ?", new BeanHandler<Emp>(Emp.class));
    }
//    更新员工信息
    @Override
    public void updateEmp(Emp emp) throws SQLException {
        int update = qr.update("update emp set uname = ?,sex = ?,tel = ?,email = ? address = ?,did = ? where eid = ?", emp.getUname(), emp.getSex(), emp.getTel(), emp.getAddress(), emp.getEmail(), emp.getUid(), emp.getDid());

    }

}
