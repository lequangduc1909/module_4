<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Chuyển đổi USD sang VNĐ</title>
</head>
<body>
<h1>Chuyển đổi USD sang VNĐ</h1>

<form action="${pageContext.request.contextPath}/convert" method="post">
    <p>
        <label>Tỉ giá (VNĐ / USD):</label><br>
        <input type="number" name="rate" step="0.01" min="0" value="${exchangeRate}" required>
    </p>

    <p>
        <label>Số tiền USD:</label><br>
        <input type="number" name="usd" step="0.01" min="0" value="${usdAmount}" required>
    </p>

    <button type="submit">Chuyển đổi</button>
</form>

<% if (request.getAttribute("result") != null) { %>
<p>
    <%= request.getAttribute("usdAmount") %> USD = <%= request.getAttribute("result") %> VNĐ
</p>
<% } %>
</body>
</html>
