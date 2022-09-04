<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <meta charset="ISO-8859-1">
    <title>AppLocação</title>
</head>
<body>

<c:import url="../menu.jsp"></c:import>

<div class="container mt-3">

    <p>Projeto de Locação de Veiculos</p>


    <h3>Classe: Moto</h3>
    <table class="table table-striped table-hover table-bordered">
        <thead>

        <tr>
            <th>Código</th>
            <th>Marca</th>
            <th>Modelo</th>
            <th>Valor</th>
            <th>Cilindradas</th>
            <th>Marchas</th>
            <th>Velocidade máxima</th>
            <th>Ações</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="moto" items="${listagem}">
            <tr>
                <td>${moto.codigo}</td>
                <td>${moto.marca}</td>
                <td>${moto.modelo}</td>
                <td>${moto.valor}</td>
                <td>${moto.qntdCilindradas}</td>
                <td>${moto.qntdMarchas}</td>
                <td>${moto.velocidadeMaxima}</td>
                <td><a href="/motos/${moto.codigo}/excluir">Excluir</a></td>

            </tr>
        </c:forEach>

        </tbody>
    </table>


</div>
</body>
</html>