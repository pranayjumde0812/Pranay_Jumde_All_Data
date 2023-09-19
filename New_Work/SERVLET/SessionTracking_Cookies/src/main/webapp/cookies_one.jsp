<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 17-09-2023
  Time: 10:03 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>First JSP Page</title>
</head>
<body>
<%
    String name = request.getParameter("name");

    // Create a Cookie

    Cookie cookie = new Cookie("username", name);

    response.addCookie(cookie);

%>

<h1> Welcome <%=name%>, to first jsp page of website...</h1>
<h1><a href="cookies_two.jsp">Goto 2nd JSP page</a></h1>
</body>
</html>
