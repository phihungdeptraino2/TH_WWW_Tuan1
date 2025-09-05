<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head><title>Result</title></head>
<body>
<h2>Registration Result</h2>
<p>Name: ${name}</p>
<p>Email: ${email}</p>
<p>Country: ${country}</p>
<p>Short Bio: ${shortBio}</p>

<p>Hobbies:
    <c:forEach var="h" items="${hobbies}">
        ${h}
    </c:forEach>
</p>
</body>
</html>
