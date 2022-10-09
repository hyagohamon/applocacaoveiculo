<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
    <meta charset="ISO-8859-1">
    <title>AppLocação</title>
</head>
<body>
<c:import url="../menu.jsp"></c:import>

<div class="container mt-3">

    <c:if test="${msg.contains('sucesso')}">
        <div class="alert alert-success alert-dismissible fade show" role="alert">
                ${msg}.
            <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
        </div>
    </c:if>

    <c:if test="${msg.contains('não')}">
        <div class="alert alert-danger alert-dismissible fade show" role="alert">
                ${msg}.
            <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
        </div>
    </c:if>


    <h3>Carros</h3>
    <a href="/carros" class="btn btn-success mb-2 ">Novo</a>

    <table class="table table-striped table-hover table-bordered">
        <thead>
        <tr>
            <th>Id</th>
            <th>Marca</th>
            <th>Modelo</th>
            <th>Ano</th>
            <th>Valor</th>
            <th>Portas</th>
            <th>Cavalos</th>
            <th>Velocidade máxima</th>
            <th>Ações</th>

        </tr>
        </thead>
        <tbody>
        <c:forEach var="carro" items="${listagem}">
            <tr>
                <td>${carro.id}</td>
                <td>${carro.marca}</td>
                <td>${carro.modelo}</td>
                <td>${carro.ano}</td>
                <td>${carro.valor}</td>
                <td>${carro.qntdPortas}</td>
                <td>${carro.qntdCavalos}</td>
                <td>${carro.velocidadeMaxima}</td>
                <td><a href="/carros/${carro.id}/excluir" class="btn btn-danger">Excluir</a></td>

            </tr>
        </c:forEach>


        </tbody>
    </table>


</div>
</body>
</html>