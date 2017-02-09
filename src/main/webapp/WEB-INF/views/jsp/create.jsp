<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>HRD</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">
    <script src="https://code.jquery.com/jquery-3.1.1.min.js" integrity="sha256-hVVnYaiADRTO2PzUGmuLJr8BLUSjGIZsDYGmIJLv2b8=" crossorigin="anonymous"></script>
    <script src="${pageContext.request.contextPath}/resources/js/rest.js"></script>
</head>
<body>
   <div>
        <h2>Create Employee</h2>
        <form  id="createForm">
            <table>
                <tr>
                    <td><label for="firstName">First Name:</label></td>
                    <td><input id="firstName" name="firstName" /></td>
                </tr>
                <tr>
                    <td><label for="lastName">Last Name:</label></td>
                    <td><input id="lastName" name="lastName" /></td>
                </tr>
                <tr>
                    <td><label for="patronymic">Patronymic:</label></td>
                    <td><input id="patronymic" name="patronymic" /></td>
                </tr>
                <tr>
                    <td></td>
                    <td>
                        <input type="reset" value="Reset" />
                        <input type="submit" value="Submit" />
                    </td>
                </tr>
            </table>
        </form>
    </div>
    <div>
        <a href='<c:url value="/"/>'>Back to index</a>
    </div>
</body>
</html>