<%@ page import="java.time.LocalDate" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 20-09-2023
  Time: 06:09 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Withdraw JSP</title>
</head>
<body>
<jsp:useBean id="withdraw" class="com.mkpits.bankmanagmentsystem.entity.Transaction" scope="application"/>

<%
    String userId = (String) session.getAttribute("userId");

//    Date date = new Date();
//    Date dt = new java.sql.Date(date.getTime());

    LocalDate date = LocalDate.now();
    System.out.println(date);
    String withdrawDate = date.toString();
    System.out.println(withdrawDate);
%>
<jsp:setProperty name="withdraw" property="amount" param="balance"/>
<jsp:setProperty name="withdraw" property="userId" value="<%=userId%>"/>
<jsp:setProperty name="withdraw" property="transactionDate" value="<%=withdrawDate%>"/>
<jsp:setProperty name="withdraw" property="transactionType" value="Withdraw"/>

<%
    int result = withdraw.withdrawMoney();

    if (result == 1) {
        out.println("<h1>Amount withdrawn successfully</h1>");
        out.println("<h2> <a href = 'dashboard.jsp' >Goto Dashboard</a> </h2>");
    } else {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("ErrorPage.html");
        requestDispatcher.include(request, response);
    }
%>
</body>
</html>
