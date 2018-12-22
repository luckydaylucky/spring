package com.itheima.service;

import com.itheima.domain.Emp;
import com.itheima.domain.EmpDept;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author: MR.z
 * @Date: 2018/12/2 18:59
 * @Version 1.0
 */
public interface ServiceEmp {

//    全查询
    List<EmpDept> serviceEmp() throws SQLException;
//删除数据
    int servdel(int id) throws SQLException;
//    增加
    void servAdd(Emp emp) throws SQLException;
//   根据id查找信息
    void servQuerry(int id) throws SQLException;

//    查找修改
    void servUpdate(Emp emp) throws SQLException;
}
