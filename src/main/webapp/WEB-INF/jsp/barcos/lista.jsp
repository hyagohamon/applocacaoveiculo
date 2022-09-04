<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <meta charset="ISO-8859-1">
    <title>AppLoca��o</title>
</head>
<body>
<c:import url="../menu.jsp"></c:import>

<div class="container mt-3">

    <p>Projeto de Loca��o de Veiculos</p>


    <h3>Classe: Barco</h3>
    <table class="table table-striped table-hover table-bordered">
        <thead>
        <tr>
            <th>C�digo</th>
            <th>Marca</th>
            <th>Modelo</th>
            <th>Ano</th>
            <th>Valor</th>
            <th>Deck</th>
            <th>Categoria</th>
            <th>A��es</th>
        </tr>
        </thead>
        <tbody>

        <c:forEach var="barco" items="${listagem}">
            <tr>
                <td>${barco.codigo}</td>
                <td>${barco.marca}</td>
                <td>${barco.modelo}</td>
                <td> ${barco.ano}</td>
                <td>${barco.valor}</td>
                <td>${barco.qtdDeck}</td>
                <td>${barco.categoria}</td>
                <td><a href="/barcos/${barco.codigo}/excluir">Excluir</a></td>
            </tr>
        </c:forEach>

        </tbody>
    </table>
</div>
</body>
</html>