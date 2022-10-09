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
    <h2>Cadastro de clientes</h2>
    <form method="post" action="clientes/incluir">

        <div class="mb-3 mt-3">
            <label for="nome" id="nome" class="form-label">Nome:</label>
            <input type="text" class="form-control" placeholder="Digite o nome do cliente" name="nome">
        </div>

        <div class="mb-3 mt-3">
            <label for="cpf" id="cpf" class="form-label">CPF:</label>
            <input type="text" class="form-control" placeholder="Digite o cpf do cliente" name="cpf">
        </div>

        <div class="mb-3 mt-3">
            <label for="email" id="email" class="form-label">Email:</label>
            <input type="email" class="form-control" placeholder="Digite o email do cliente" name="email">
        </div>

        <button type="submit" class="btn btn-primary">Cadastrar</button>
    </form>


</div>
</body>
</html>