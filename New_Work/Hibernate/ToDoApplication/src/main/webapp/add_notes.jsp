<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 27-10-2023
  Time: 01:02 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <!-- All the css js bootstrap file import here with include tag -->
    <%@include file="all_js_css_file.jsp" %>

    <title>Add Notes</title>
</head>
<body>
<div class="container-fluid  p-0 m-0">

    <%--    This is navbar file import here   --%>
    <%@include file="navbar.jsp" %>

    <br>
    <div class="container text-center">
        <h2>Add your new note here</h2>
    </div>


    <%--    This is add notes form   --%>
    <div class="col-md-6 offset-md-3">
        <form action="SaveNoteServlet" method="post">
            <div class="form-group">
                <label for="title">Note Title</label>
                <input type="text"
                       name="title"
                       class="form-control"
                       id="title"
                       required>

            </div>
            <div class="form-group">
                <label for="content">Note Content</label>
                <textarea id="content"
                          name="content"
                          placeholder="Enter your note content"
                          class="form-control"
                          style="height: 300px"
                          required></textarea>
            </div>
            <div class="container text-center">
                <button type="submit" class="btn btn-primary">Add</button>
                <button type="reset" class="btn btn-warning">Reset</button>
            </div>

        </form>
    </div>

</div>
</body>
</html>
