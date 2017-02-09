<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>HRD</title>
</head>
<body>
    <div>
        <h2>CRUD Operations</h2>
        <a href='<c:url value="/create"/>'>
            <div>Create Employee</div>
        </a></br></br>

        <a href='<c:url value="/employee/"/>'>
            <div>Get Employee List</div>
        </a></br></br>

        <a href='<c:url value="/update"/>'>
            <div>Update Employee</div>
        </a></br></br>

        <a href='<c:url value="/delete"/>'>
            <div>Delete Employee</div>
        </a>
    </div>
    <div>
        <h2>Online Users:</h2>
        <ol>
            <c:forEach var="user" items="${users}">
                <li><c:out value="${user}" /></br></li>
            </c:forEach>
        </ol>
    </div>
</body>
</html>