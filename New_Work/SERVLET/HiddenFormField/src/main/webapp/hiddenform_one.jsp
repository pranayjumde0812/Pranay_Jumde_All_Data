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
    <title>JSP 1</title>
</head>
<body>
<%
    String str = request.getParameter("name");
%>

<h1>Welcome <%=str%>, to 1st Jsp Page</h1>

<form action="hiddenform_two.jsp">
    <input type="hidden" name="username" value="<%=str%>"/>
    <button type="submit">Goto 2nd page</button>
</form>
</body>
</html>
