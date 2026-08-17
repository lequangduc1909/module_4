<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Bảng Tính Lương Theo Ca</title>
</head>

<body>

<h1>Bảng Tính Lương Theo Ca</h1>

<form action="${pageContext.request.contextPath}/calculate"
      method="post">

    <div>
        <label>
            Giờ Ca Sáng:
        </label>

        <input type="number"
               name="shiftHours"
               value="0"
               step="0.5"
               min="0">
    </div>

    <br>

    <div>
        <label>
            Giờ Ca Chiều:
        </label>

        <input type="number"
               name="shiftHours"
               value="0"
               step="0.5"
               min="0">
    </div>

    <br>

    <div>
        <label>
            Giờ Ca Tối:
        </label>

        <input type="number"
               name="shiftHours"
               value="0"
               step="0.5"
               min="0">
    </div>

    <br>

    <div>
        <label>
            Mức lương/giờ ($):
        </label>

        <select name="hourlyRate">

            <option value="10">
                10$/giờ
            </option>

            <option value="15">
                15$/giờ
            </option>

            <option value="20">
                20$/giờ
            </option>

        </select>
    </div>

    <br>

    <button type="submit">
        Tính Lương
    </button>

</form>

</body>

</html>