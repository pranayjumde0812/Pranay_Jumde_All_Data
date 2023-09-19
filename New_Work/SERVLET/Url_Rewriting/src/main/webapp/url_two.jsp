<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 17-09-2023
  Time: 11:45 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Url Rewriting page one</title>
</head>
<body>
<%
  String uname = request.getParameter("username");
%>

<h1>Welcome back <%=uname%>, To our website...</h1>
</body>
</html>
