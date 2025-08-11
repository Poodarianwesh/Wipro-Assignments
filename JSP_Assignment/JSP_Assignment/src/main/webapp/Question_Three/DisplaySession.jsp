<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%
    String name = (String) session.getAttribute("user");
    String pass = (String) session.getAttribute("pass");
%>

<!DOCTYPE html>
<html>
<head>
    <title>Display Session</title>
</head>
<body>
    <h2>Session Information</h2>
    <p>Name: <%= name %></p>
    <p>Password: <%= pass %></p>
</body>
</html>
