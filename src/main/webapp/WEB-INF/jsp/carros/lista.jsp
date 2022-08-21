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
<nav class="navbar navbar-expand-sm navbar-light bg-light">
    <div class="container-fluid">
        <a class="navbar-brand" href="/">AppLoca��o Ve�culos</a>
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
                    <a class="nav-link" href="/locacoes/lista">Loca��es</a>
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

    <p>Projeto de Loca��o de Veiculos</p>


    <h3>Classe: Carro</h3>
    <table class="table table-striped table-hover table-bordered">
        <thead>
        <tr>
            <th>C�digo</th>
            <th>Marca</th>
            <th>Modelo</th>
            <th>Valor</th>
            <th>Portas</th>
            <th>Cavalos</th>
            <th>Velocidade m�xima</th>
            <th>A��es</th>

        </tr>
        </thead>
        <tbody>
        <c:forEach var="carro" items="${listagem}">
            <tr>
                <td>${carro.codigo}</td>
                <td>${carro.marca}</td>
                <td>${carro.modelo}</td>
                <td>${carro.valor}</td>
                <td>${carro.qntdPortas}</td>
                <td>${carro.qntdCavalos}</td>
                <td>${carro.velocidadeMaxima}</td>
                <td><a href="/carros/${carro.codigo}/excluir">Excluir</a></td>

            </tr>
        </c:forEach>


        </tbody>
    </table>


</div>
</body>
</html>