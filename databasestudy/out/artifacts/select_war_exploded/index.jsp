<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
    h1,tr{
      text-align: center;
    }
  </style>

</head>
<body>
<table class="table table-bordered">
  <h1>联系人列表</h1>
  <tr>
    <th>编号</th>
    <th>姓名</th>
    <th>性别</th>
    <th>年龄</th>
    <th>籍贯</th>
    <th>QQ</th>
    <th>邮箱</th>
    <th>操作</th>
  </tr>
  <c:forEach items="${list}" var="Conect" varStatus="st">
  <tr>
    <td>${Conect.id}</td>
    <td>${Conect.name}</td>
    <td>${Conect.sex}</td>
    <td>${Conect.age}</td>
    <td>${Conect.address}</td>
    <td>${Conect.qq}</td>
    <td>${Conect.email}</td>
    <td>
      <a href="ServletContact?id=${Conect.id}" class="btn btn-primary" >删除</a>
      &nbsp;&nbsp;&nbsp;&nbsp;
      <a href="#" class="btn btn-primary">修改</a>
    </td>
  </tr>
</c:forEach>
  <tr>
    <td colspan="8">

      <a href="#" name="增加联系人" class="btn btn-primary">增加联系人</a>
    </td>
  </tr>

</table>



</body>
</html>
