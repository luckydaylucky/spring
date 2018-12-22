<%@ page import="com.itheima.domain.Person" %><%--
  Created by IntelliJ IDEA.
  User: MR.z
  Date: 2018/11/24
  Time: 15:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%
        Person p = new Person("志平",38);
        request.setAttribute("p",p);
    %>
${p}

</body>
</html>
