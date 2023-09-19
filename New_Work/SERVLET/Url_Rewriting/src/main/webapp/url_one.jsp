<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 17-09-2023
  Time: 11:41 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Url Rewriting page one</title>
</head>
<body>
<%
  String name = request.getParameter("name");
%>

<h1>Welcome <%=name%>, On first page</h1>
<h1><a href="url_two.jsp?username=<%=name%>">Go</a></h1>
</body>
</html>
