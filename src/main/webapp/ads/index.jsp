<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <ul>
        <c:forEach var="ad" items="${allAds}">
            <li>${ad.title}</li>
        </c:forEach>
    </ul>
</body>
</html>
