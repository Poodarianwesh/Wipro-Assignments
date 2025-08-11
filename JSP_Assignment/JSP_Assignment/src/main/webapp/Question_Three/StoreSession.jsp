<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%
    String name = request.getParameter("username");
    String pass = request.getParameter("password");

    session.setAttribute("user", name);
    session.setAttribute("pass", pass);
%>

<!DOCTYPE html>
<html>
<head>
    <title>Session Stored</title>
</head>
<body>
    <h2>User Data Saved in Session</h2>
    <p>Click the link below to view the saved session data:</p>
    <a href="DisplaySession.jsp">Go to Display Page</a>
</body>
</html>
