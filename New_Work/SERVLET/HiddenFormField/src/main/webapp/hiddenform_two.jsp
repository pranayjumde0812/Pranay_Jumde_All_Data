<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 18-09-2023
  Time: 12:17 am
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP 2</title>
</head>
<body>
<%
    String uname = request.getParameter("username");
%>

<h1>Welcome <%=uname%>, to 2nd Jsp Page</h1>
</body>
</html>
