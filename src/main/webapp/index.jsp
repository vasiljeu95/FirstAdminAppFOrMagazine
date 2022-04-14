<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <h1>Feedback messages</h1>

    <table>
        <c:forEach var="feedback" items="${feedback}">
            </div>
                <h5>${feedback.name}, ${feedback.email}, ${feedback.phone}</h5>
            </div>
        </c:forEach>
    </table>
</body>
</html>