<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <meta charset="ISO-8859-1">
    <title>Login</title>
</head>
<body>
<c:import url="../menu.jsp"></c:import>
<div class="container mt-3">
    <h3>Cadastro de usuário</h3>
    <form method="post" action="/usuarios/incluir">

        <div class="mb-3 mt-3">
            <label for="nome" id="nome" class="form-label">Nome:</label>
            <input type="text" class="form-control" placeholder="Digite seu nome" name="nome">
        </div>
        <div class="mb-3 mt-3">
            <label for="email" id="email" class="form-label">Email:</label>
            <input type="email" class="form-control" placeholder="Digite seu email" name="email">
        </div>
        <div class="mb-3">
            <label for="senha" class="form-label">Senha:</label>
            <input type="password" id="senha" class="form-control" placeholder="Digite sua senha" name="senha">
        </div>

        <button type="submit" class="btn btn-primary">Cadastrar</button>
    </form>


</div>
</body>
</html>