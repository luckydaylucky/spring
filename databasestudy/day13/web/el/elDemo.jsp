<%--
  Created by IntelliJ IDEA.
  User: MR.z
  Date: 2018/11/24
  Time: 15:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    pageContext.setAttribute("name","过儿");
    request.setAttribute("name","黄蓉");

%>
<%=request.getAttribute("name")%><br/>
${requestScope.name}<br/>
${applicationScope.name}


</body>
</html>
