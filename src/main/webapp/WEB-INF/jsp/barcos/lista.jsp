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
<nav class="navbar navbar-expand-sm navbar-light bg-light">
    <div class="container-fluid">
        <a class="navbar-brand" href="/">AppLocação Veículos</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#mynavbar">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="mynavbar">
            <ul class="navbar-nav me-auto">
                <li class="nav-item">
                    <a class="nav-link" href="/barcos/lista">Barcos</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/carros/lista">Carros</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/motos/lista">Motos</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/clientes/lista">Clientes</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/locacoes/lista">Locações</a>
                </li>
            </ul>
            <form class="d-flex">
                <input class="form-control me-2" type="text" placeholder="Search">
                <button class="btn btn-primary" type="button">Search</button>
            </form>
        </div>
    </div>
</nav>
<div class="container mt-3">

    <p>Projeto de Locação de Veiculos</p>


    <h3>Classe: Barco</h3>
    <table class="table table-striped table-hover table-bordered">
        <thead>
        <tr>
            <th>Código</th>
            <th>Marca</th>
            <th>Modelo</th>
            <th>Ano</th>
            <th>Valor</th>
            <th>Deck</th>
            <th>Categoria</th>
            <th>Ações</th>
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