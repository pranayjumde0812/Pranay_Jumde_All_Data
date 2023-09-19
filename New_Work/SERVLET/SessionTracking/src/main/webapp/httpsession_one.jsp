<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 18-09-2023
  Time: 01:16 am
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
  String name = request.getParameter("name");

  HttpSession ses =request.getSession();
  ses.setAttribute("uname",name);
%>

<h1>welcome <%=ses.getId()%> to 1st HTTP Session page</h1>
<h1><a href="httpsession_two.jsp">Go</a></h1>
</body>
</html>
