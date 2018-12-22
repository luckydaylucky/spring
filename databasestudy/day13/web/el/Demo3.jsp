<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.itheima.domain.Person" %><%--
  Created by IntelliJ IDEA.
  User: MR.z
  Date: 2018/11/24
  Time: 15:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        List<String> list = new ArrayList<>();
        list.add("雕");
        list.add("莫愁");
        list.add("段正淳");
        request.setAttribute("list",list);

    %>
${list}<br/>
${list[2]}<br/>
<hr/>
<%
    Person p1 = new Person("乔峰",35);
    Person p2 = new Person("虚竹",28);
    Person p3 = new Person("段誉",25);

    List<Person> list2 = new ArrayList<>();
%>



</body>
</html>
