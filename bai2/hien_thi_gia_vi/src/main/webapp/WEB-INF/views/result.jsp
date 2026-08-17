<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Selected Condiments</title>
</head>

<body>

<h1>Lựa chọn của bạn</h1>

<c:choose>

    <c:when test="${empty condiments}">
        <p>Bạn chưa chọn gì cả.</p>
    </c:when>

    <c:otherwise>

        <ul>
            <c:forEach var="condiment" items="${condiments}">
                <li>${condiment}</li>
            </c:forEach>
        </ul>

    </c:otherwise>

</c:choose>

<br>

<a href="${pageContext.request.contextPath}/">
    Chọn lại đi
</a>

</body>

</html>