<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 17-09-2023
  Time: 10:13 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Second JSP page</title>
</head>
<body>

<%
//    String name = request.getParameter("name");

    // Getting all the cookies
    // Fetch the cookies

    Cookie[] cookies = request.getCookies();

    boolean f = false;
    String userName = "";

    if (cookies == null) {
        out.println("<h1>This is new user please, goto home page....</h1>");
        return;
    } else {
        for (Cookie uname : cookies) {

            String temp = uname.getName();
            if (temp.equals("username")) {

                f = true;

                userName = uname.getValue();
            }
        }
    }

    if (f) {
        out.println("<h1>Welcome back " + userName + " , to Second JSP page of website.</h1>");
    }

%>

<%--<h1> Welcome <%=name%> to first jsp page</h1>--%>
</body>
</html>
