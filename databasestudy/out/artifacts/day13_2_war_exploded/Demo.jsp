<%--
  Created by IntelliJ IDEA.
  User: MR.z
  Date: 2018/11/24
  Time: 21:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%
    request.setAttribute("name","黄蓉");

    %>
<%=request.getAttribute("name")%>;


</body>
</html>
