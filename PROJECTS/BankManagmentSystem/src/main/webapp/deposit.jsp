<%@ page import="java.util.Date" %>
<%@ page import="java.time.LocalDate" %><%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 20-09-2023
  Time: 06:09 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Deposit JSP</title>
</head>
<body>
<jsp:useBean id="deposite" class="com.mkpits.bankmanagmentsystem.entity.Transaction" scope="application"/>

<%
    String userId = (String) session.getAttribute("userId");

    LocalDate date = LocalDate.now();
//    System.out.println(date);
    String depositDate = date.toString();
//    System.out.println(depositDate);
%>

<jsp:setProperty name="deposite" property="amount" param="balance"/>
<jsp:setProperty name="deposite" property="userId" value="<%=userId%>"/>
<jsp:setProperty name="deposite" property="transactionDate" value="<%=depositDate%>"/>
<jsp:setProperty name="deposite" property="transactionType" value="Deposite"/>

<%
    int result = deposite.depositMoney();

    if (result == 1) {
        out.println("<h1>Amount added successfully</h1>");
        out.println("<h2> <a href = 'dashboard.jsp' >Goto Dashboard</a> </h2>");
    } else {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("ErrorPage.html");
        requestDispatcher.include(request, response);
    }
%>


</body>
</html>
