<%--
  Created by IntelliJ IDEA.
  User: MR.z
  Date: 2018/11/26
  Time: 20:33
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setAttribute("num1",22);
    request.setAttribute("num2",33);
%>
<c:if test="${num1<num2}">
    <h1>num1小于num2</h1>
</c:if>

</body>
</html>
