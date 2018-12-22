package com.itheima.dao;

import com.itheima.domain.Emp;
import com.itheima.domain.EmpDept;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author: MR.z
 * @Date: 2018/12/2 18:28
 * @Version 1.0
 */
public interface EmpDao {

//    返回值list集合展示全部数据
    List<EmpDept> findEmp() throws SQLException;
//返回值int类型根据id删除数据
    int del(int id) throws SQLException;
//没有明确返回值
    void addEmp(Emp emp) throws SQLException;
//根据id查找员工信息
    void queryEmpByid(int id) throws SQLException;
//    更新员工信息
    void updateEmp(Emp emp) throws SQLException;

}
