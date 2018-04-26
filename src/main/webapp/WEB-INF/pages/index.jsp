<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Index</title>
</head>
<body>

<h1>Hello, dear client</h1>

<h3>Please, register and choose the sum of credit you want</h3>

<form action="/next" method="post">
    <input type="text" name="userName" placeholder="Name" required>

    <input type="text" name="userSurname" placeholder="Surname" required>

    <input type="text" name="sumOfCredit" placeholder="SumOfCredit" required>

    <select name="selection" required>
        <c:forEach var="i" items="${items}">
            <option  value="${i.name}">
                <c:out value="${i.name}"/>
            </option>
        </c:forEach>
    </select>
    <br/>
    <br/>
<<<<<<< HEAD
    <br/>
=======
>>>>>>> e495f62... created project
    <input type="submit">

</form>


</body>
</html>
