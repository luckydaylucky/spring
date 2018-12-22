<%--
  Created by IntelliJ IDEA.
  User: MR.z
  Date: 2018/11/26
  Time: 21:26
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach items="${list}" var="Person" varStatus="st">
        ${Person}<br/>
        ${Person.name}<br/>
        ${Person.age}<br/>
        ${st.index}<br/>
        ${st.count}<br/>
        <hr/>
    </c:forEach>



</body>
</html>
