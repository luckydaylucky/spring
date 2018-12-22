<%--
  Created by IntelliJ IDEA.
  User: MR.z
  Date: 2018/12/6
  Time: 11:20
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1px" cellspacing="0px" cellpadding="10px" width="50%" align="center">
    <tr>
        <td>序号</td>
        <td>姓名</td>
        <td>年龄</td>
    </tr>
    <c:forEach items="${users}" var="user" varStatus="vs">
        <tr>
            <td>${vs.count}</td>
            <td>${user.name}</td>
            <td>${user.age}</td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
