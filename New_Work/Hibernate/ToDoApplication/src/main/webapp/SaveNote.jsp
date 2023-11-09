<%@ page import="com.todo.todoapplication.entity.Note" %>
<%@ page import="java.util.Date" %>
<%@ page import="org.hibernate.Session" %>
<%@ page import="com.todo.todoapplication.helper.SessionFactoryProvider" %>
<%@ page import="org.hibernate.Transaction" %>
<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 27-10-2023
  Time: 08:19 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    try {
        // Title and content fetch
        String title = request.getParameter("title");
        String content = request.getParameter("content");

        Note note = new Note(title, content, new Date());


        // Hibernate save

        Session s = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction transaction = s.beginTransaction();

        s.save(note);

        transaction.commit();
        s.close();


    } catch (Exception e) {
        e.printStackTrace();
    }
%>

out.println("<h1>Note is added successfully</h1>");
</body>
</html>
