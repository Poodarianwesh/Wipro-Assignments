<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Display Info</title>
</head>
<body>
    <h2>Received Details:</h2>
    <p>Name: <%= request.getParameter("username") %></p>
    <p>Password: <%= request.getParameter("password") %></p>
</body>
</html>
