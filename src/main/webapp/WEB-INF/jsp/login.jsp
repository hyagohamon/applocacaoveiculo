<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
    <meta charset="ISO-8859-1">
    <title>Login</title>
</head>
<body>
<c:import url="menu.jsp"></c:import>
<div class="container mt-3">

    <c:if test="${msg!=null}">
        <div class="alert alert-danger alert-dismissible fade show" role="alert">
                ${msg}.
            <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
        </div>
    </c:if>


    <form method="post" action="/login">
        <div class="mb-3 mt-3">
            <label for="email" id="email" class="form-label">Email:</label>
            <input type="email" class="form-control" placeholder="Digite seu email" name="email">
        </div>
        <div class="mb-3">
            <label for="password" class="form-label">Password:</label>
            <input type="password" id="password" class="form-control" placeholder="Digite sua senha" name="password">
        </div>

        <button type="submit" class="btn btn-primary">Entrar</button>
    </form>


</div>
</body>
</html>