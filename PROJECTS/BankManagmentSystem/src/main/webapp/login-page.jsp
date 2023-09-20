<%@ page import="java.sql.ResultSet" %><%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 12-09-2023
  Time: 04:56 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
<jsp:useBean id="login" class="com.mkpits.bankmanagmentsystem.entity.AccountUser" scope="application"/>

<jsp:setProperty name="login" property="userId" param="emailId"/>
<jsp:setProperty name="login" property="password" param="password"/>


<%
    String username = "";
    ResultSet resultSet = login.checkLoginUser();

//    System.out.println(username);


//    int a = login.checkLoginUser();

    if (resultSet.next()) {

        username = resultSet.getString(3);
        session.setAttribute("userName", username);
        response.sendRedirect("dashboard.jsp");

    } else {
        response.sendRedirect("ErrorPage.html");
    }

%>
</body>
</html>
