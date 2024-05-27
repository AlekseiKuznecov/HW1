<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Log in with your account</title>
</head>

<body>
<sec:authorize access="isAuthenticated()">
    <% response.sendRedirect("/"); %>
</sec:authorize>
<div>
    <form method="POST" action="/login">
        <h2>Вход в систему</h2>
        <div>
            <input name="username" type="text" placeholder="Username"
                   autofocus="true"/>
            <input id="password" name="password" type="password" placeholder="Password"/>
            <div class="password-vision" style="position: absolute; top: 53px; left: 330px;" onClick="showPassword()">
                <p id="vision">◎</p>
            </div>
            <button type="submit">Log In</button>
            <h4><a id="reg" href="/registration">Зарегистрироваться</a> </h4>
        </div>
    </form>
</div>
<script>
    function showPassword() {
        let input = document.getElementById("password");
        let vision = document.getElementById("vision");
        let state = input.type;

        if (state === "password") {
            input.type = "text";
            vision.textContent = '◉'
        }
        if (state === "text") {
            vision.textContent = '◎'
            input.type = "password";
        }
    }
</script>
</body>
</html>
