<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Sandwich Condiments</title>
</head>

<body>

<h1>Sandwich Condiments</h1>

<form action="${pageContext.request.contextPath}/save" method="post">

    <label>
        <input type="checkbox"
               name="condiment"
               value="Lettuce">
        Lettuce
    </label>

    <label>
        <input type="checkbox"
               name="condiment"
               value="Tomato">
        Tomato
    </label>

    <label>
        <input type="checkbox"
               name="condiment"
               value="Mustard">
        Mustard
    </label>

    <label>
        <input type="checkbox"
               name="condiment"
               value="Sprouts">
        Sprouts
    </label>

    <hr>

    <button type="submit">Save</button>

</form>

</body>

</html>