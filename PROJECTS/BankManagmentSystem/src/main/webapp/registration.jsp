<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 12-09-2023
  Time: 04:05 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="ErrorPage.html" %>
<html>
<head>
    <title>Registration Page</title>
</head>
<body>

<jsp:useBean id="userAccount" class="com.mkpits.bankmanagmentsystem.entity.AccountUser" scope="application"/>

<jsp:setProperty name="userAccount" property="userId" param="userId"/>
<jsp:setProperty name="userAccount" property="accountNumber" param="accNum"/>
<jsp:setProperty name="userAccount" property="password" param="password"/>
<jsp:setProperty name="userAccount" property="name" param="name"/>
<jsp:setProperty name="userAccount" property="address" param="address"/>
<jsp:setProperty name="userAccount" property="balance" param="balance"/>

<%
    int res = userAccount.registerUser();

    if (res == 1) {
        out.println("<h2>Successfully inserted</h2>");
    } else {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("registration.html");
        requestDispatcher.include(request, response);
    }
%>
</body>
</html>
