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


    <h3>Classe: Cliente</h3>
    <table class="table table-striped table-hover table-bordered">
        <thead>
        <tr>
            <th>Nome</th>
            <th>CPF</th>
            <th>Telefone</th>

        </tr>
        </thead>
        <tbody>
        <tr>
            <td>João Silva</td>
            <td>123.456.789-99</td>
            <td>99-981452525</td>

        </tr>
        <tr>
            <td>Pedro Lima da Silva</td>
            <td>123.555.666-99</td>
            <td>99-981452626</td>
        </tr>
        <tr>
            <td>Alcadieno Aquino</td>
            <td>321.123.654.89</td>
            <td>99-984487589</td>

        </tr>
        </tbody>
    </table>


</div>
</body>
</html>