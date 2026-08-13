<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <title>Từ điển Anh - Việt</title>
</head>
<body>
<h1>Tra từ điển Anh - Việt</h1>

<form method="post" action="${pageContext.request.contextPath}/search">
    <label for="keyword">Nhập từ tiếng Anh:</label>
    <input id="keyword" type="text" name="keyword" value="${keyword}" required>
    <button type="submit">Tìm kiếm</button>
</form>

<c:if test="${not empty keyword}">
    <h2>Kết quả</h2>
    <c:choose>
        <c:when test="${found}">
            <p><strong>${keyword}</strong>: ${meaning}</p>
        </c:when>
        <c:otherwise>
            <p>${message}</p>
        </c:otherwise>
    </c:choose>
</c:if>

<h2>Một số từ có sẵn</h2>
<p>hello, goodbye, thank you, water, food, computer, morning, restaurant, beautiful</p>
</body>
</html>
