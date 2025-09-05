<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Registration Form</title>
</head>
<body>
<h2>Registration Form</h2>
<form method="post" action="registration">
    Name: <input type="text" name="name" required><br><br>
    Email: <input type="email" name="email" required><br><br>
    Password: <input type="password" name="password" required><br><br>

    Hobbies:
    <input type="checkbox" name="hobby" value="Reading">Reading
    <input type="checkbox" name="hobby" value="Music">Music
    <input type="checkbox" name="hobby" value="Sports">Sports
    <br><br>

    Country:
    <select name="country">
        <option value="VN">Vietnam</option>
        <option value="US">USA</option>
        <option value="JP">Japan</option>
    </select><br><br>

    Short Bio:<br>
    <textarea name="shortBio" rows="4" cols="40"></textarea><br><br>

    <input type="submit" value="Register">
</form>
</body>
</html>
