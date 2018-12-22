<%--
  Created by IntelliJ IDEA.
  User: MR.z
  Date: 2018/11/28
  Time: 22:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>get登陆方式</h1>
<form action="Servletlogin" method="get">
请输入用户名<input type="text" name="username" value="请输入用户名"><br/>
请输入密码<input type="password" name="password" value="请输入密码"><br/>
<input type="submit" value="提交"><br/>
</form>
<h1>post登陆方式</h1>
<form action="/Servlet1" method="post">
    请输入用户名<input type="text" name="登陆" value="请输入用户名"><br/>
    请输入密码<input type="password" name="密码"><br/>
    <input type="submit" value="提交"><br/>
</form>

</body>
</html>
