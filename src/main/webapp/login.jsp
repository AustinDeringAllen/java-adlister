<%@ page import="java.util.Objects" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<%
    request.setAttribute("user",request.getParameter("user_name"));
    request.setAttribute("pass",request.getParameter("password"));
%>

<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="login page" />
    </jsp:include>
</head>
<body>
    <c:choose>
        <c:when test="${user == 'admin' && pass == 'password'}">
            <% response.sendRedirect("/profile.jsp"); %>
        </c:when>
        <c:otherwise>
            <c:if test="${!Objects.isNull(user) || !Objects.isNull(pass)}">
                <p>Incorrect username or password try again</p>
            </c:if>
            <form method="POST" action="/login.jsp">
                <label for="user_name">User Name: </label>
                <input type="text" name="user_name" id="user_name">
                <br>
                <label for="password">Password: </label>
                <input type="password" name="password" id="password">
                <br>
                <input type="submit" value="Log In">
            </form>
        </c:otherwise>
    </c:choose>
</body>
</html>
