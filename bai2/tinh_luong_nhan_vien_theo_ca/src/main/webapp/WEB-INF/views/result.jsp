<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Kết Quả Tính Lương</title>
</head>

<body>

<h1>Kết Quả Tính Lương</h1>

<p>
    <strong>Mức lương/giờ:</strong>
    ${hourlyRate} $
</p>

<h2>Giờ làm việc theo ca</h2>

<ul>

    <c:forEach var="hours"
               items="${shiftHours}"
               varStatus="status">

        <li>

            <c:choose>

                <c:when test="${status.index == 0}">
                    Ca sáng:
                </c:when>

                <c:when test="${status.index == 1}">
                    Ca chiều:
                </c:when>

                <c:when test="${status.index == 2}">
                    Ca tối:
                </c:when>

            </c:choose>

                ${hours} giờ

        </li>

    </c:forEach>

</ul>

<hr>

<p>
    <strong>Tổng số giờ:</strong>
    ${totalHours} giờ
</p>

<p>
    <strong>Tổng tiền lương:</strong>
    ${totalSalary} $
</p>

<br>

<a href="${pageContext.request.contextPath}/">
    Quay lại trang nhập liệu
</a>

</body>

</html>