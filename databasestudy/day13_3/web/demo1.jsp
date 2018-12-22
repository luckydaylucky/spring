<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %><%--
  Created by IntelliJ IDEA.
  User: MR.z
  Date: 2018/11/25
  Time: 22:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Date date = new Date();
    SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ");
    String str = sim.format(date);
%>
<%=str%>

</body>
</html>
