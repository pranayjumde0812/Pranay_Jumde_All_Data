<%@ page import="java.sql.*" %><%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 09-09-2023
  Time: 03:20 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="Error.jsp" %>
<html>
<head>
    <title>Main Page</title>
</head>
<body>

<%

    Connection con;
    Statement st;

        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded successfully");

        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "1311");
        System.out.println("Connection successfully");
        st = con.createStatement();

        String query = "select * from mydb.student";

        ResultSet resultSet = st.executeQuery(query);

        System.out.println(resultSet);

        while (resultSet.next()) {
%>

<table border="1">
    <tr>
        <td>Name</td>
        <td>Mobile Number</td>
    </tr>
    <tr>
        <td><%=resultSet.getString("name") %>
        </td>
        <td><%=resultSet.getString("mobile_number") %>
        </td>
    </tr>
</table>
<%
        }


%>
</body>
</html>
