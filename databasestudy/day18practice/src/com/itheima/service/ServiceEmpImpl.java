package com.itheima.service;

import com.itheima.dao.EmpDao;
import com.itheima.dao.EmpImpl;
import com.itheima.domain.Emp;
import com.itheima.domain.EmpDept;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author: MR.z
 * @Date: 2018/12/2 19:00
 * @Version 1.0
 */
public class ServiceEmpImpl implements ServiceEmp {
    EmpDao empDao = new EmpImpl();
    @Override

//    全查询
    public List<EmpDept> serviceEmp() throws SQLException {
        List<EmpDept> emp = empDao.findEmp();
        return emp;
    }

    @Override
//    删除
    public int servdel(int id) throws SQLException {
        int del = empDao.del(id);
        return del;
    }

    @Override
//    增加
    public void servAdd(Emp emp) throws SQLException {
        empDao.addEmp(emp);
    }

    @Override
    public void servQuerry(int id) throws SQLException {
        empDao.queryEmpByid(id);
    }

    @Override
//    修改
    public void servUpdate(Emp emp) throws SQLException {
        empDao.updateEmp(emp);
    }
}
