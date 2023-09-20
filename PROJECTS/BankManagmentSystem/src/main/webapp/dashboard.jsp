<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 20-09-2023
  Time: 03:21 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dashboard</title>
</head>
<body>
<%
    String userName = (String) session.getAttribute("userName");
%>
<h1> Hello <%=userName%> </h1>
</body>
</html>
