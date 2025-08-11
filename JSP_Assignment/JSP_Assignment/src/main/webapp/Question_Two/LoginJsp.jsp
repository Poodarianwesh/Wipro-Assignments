<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%
    String name = request.getParameter("username");
    String pass = request.getParameter("password");

    if ("admin".equals(name) && "wipro".equals(pass)) {
        response.sendRedirect("Success.jsp");
    } else {
        response.sendRedirect("Fail.jsp");
    }
%>
