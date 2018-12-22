<%--
  Created by IntelliJ IDEA.
  User: MR.z
  Date: 2018/11/24
  Time: 18:51
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="css/bootstrap.css" rel="stylesheet">
  <script src="js/jquery-1.11.3.js"></script>
  <script src="js/bootstrap.js"></script>
  <style>
    table,th,h1 {
      text-align: center;
    }
  </style>
</head>
<body>
  <table class="table table-bordered">
    <caption><h1>显示联系人</h1></caption>
    <tr class="warning">
      <th>编号</th>
      <th>姓名</th>
      <th>性别</th>
      <th>年龄</th>
      <th>籍贯</th>
      <th>QQ</th>
      <th>邮箱</th>
      <th>操作</th>
    </tr>

    <c:forEach items="${list}" var="contact" varStatus="st">
      <tr>
        <td>${contact.id}</td>
        <td>${contact.name}</td>
        <td>${contact.sex}</td>
        <td>${contact.age}</td>
        <td>${contact.qq}</td>
        <td>${contact.address}</td>
        <td>${contact.email}</td>
        <td><a href="#" class="btn btn-primary">删除</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="#" class="btn btn-primary">修改</a></td>
      </tr>
    </c:forEach>
    <tr>
      <td colspan="8">
        <a href="#" class="btn btn-primary">添加联系人</a>
      </td>
    </tr>
  </table>




</body>
</html>
