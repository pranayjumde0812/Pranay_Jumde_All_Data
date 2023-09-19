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
   String str= (String) request.getAttribute("uname");
%>

<h1>Welcome back <%=request.getRequestedSessionId()%>,  2nd Page of website.....</h1>

</body>
</html>
