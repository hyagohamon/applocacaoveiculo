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


    <h3>Classe: Carro</h3>
    <table class="table table-striped table-hover table-bordered">
        <thead>
        <tr>
            <th>Marca</th>
            <th>Modelo</th>
            <th>Valor</th>
            <th>Portas</th>
            <th>Cavalos</th>
            <th>Velocidade máxima</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>Hyundai</td>
            <td>HB20s</td>
            <td>R$ 65.000</td>
            <td>4</td>
            <td>135</td>
            <td>300</td>
        </tr>
        <tr>
            <td>Toyota</td>
            <td>Corola</td>
            <td>R$ 99.000</td>
            <td>4</td>
            <td>235</td>
            <td>360</td>
        </tr>
        <tr>
            <td>Honda</td>
            <td>Civid</td>
            <td>R$ 120.000</td>
            <td>4</td>
            <td>250</td>
            <td>325</td>
        </tr>
        </tbody>
    </table>


</div>
</body>
</html>