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
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descrição</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>nome</td>
            <td>String</td>
            <td>nome do cliente</td>
        </tr>
        <tr>
            <td>cpf</td>
            <td>String</td>
            <td>cpf do cliente</td>
        </tr>
        <tr>
            <td>telefone</td>
            <td>String</td>
            <td>telefone do cliente</td>
        </tr>
        </tbody>
    </table>

    <h3>Classe: Locação</h3>
    <table class="table table-striped table-hover table-bordered">
        <thead>
        <tr>
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descrição</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>descricao</td>
            <td>String</td>
            <td>Descrição da locação</td>
        </tr>
        <tr>
            <td>data</td>
            <td>LocalDate</td>
            <td>Data da realização da locação</td>
        </tr>
        <tr>
            <td>web</td>
            <td>boolean</td>
            <td>indica se a locação foi realizada pela web ou não</td>
        </tr>
        </tbody>
    </table>


    <h3>Classe: Carro</h3>
    <table class="table table-striped table-hover table-bordered">
        <thead>
        <tr>
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descrição</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>qntdPortas</td>
            <td>int</td>
            <td>Quantidade de portas</td>
        </tr>
        <tr>
            <td>qntdCavalos</td>
            <td>int</td>
            <td>Quantidade de cavalos</td>
        </tr>
        <tr>
            <td>velocidadeMaxima</td>
            <td>int</td>
            <td>Velocidade máxima</td>
        </tr>
        </tbody>
    </table>

    <h3>Classe: Moto</h3>
    <table class="table table-striped table-hover table-bordered">
        <thead>
        <tr>
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descrição</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>qntdCilindradas</td>
            <td>int</td>
            <td>Quantidade de cilindradas</td>
        </tr>
        <tr>
            <td>qntdMarchas</td>
            <td>int</td>
            <td>Quantidade de marchas</td>
        </tr>
        <tr>
            <td>velocidadeMaxima</td>
            <td>int</td>
            <td>Velocidade máxima</td>
        </tr>
        </tbody>
    </table>

    <h3>Classe: Barco</h3>
    <table class="table table-striped table-hover table-bordered">
        <thead>
        <tr>
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descrição</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>motor</td>
            <td>boolean</td>
            <td> Indica se o barco é a motor ou não</td>
        </tr>
        <tr>
            <td>qtdDeck</td>
            <td>int</td>
            <td>Quantidade de decks</td>
        </tr>
        <tr>
            <td>categoria</td>
            <td>String</td>
            <td>Categoria do barco (pesca, passeio, militar)</td>
        </tr>
        </tbody>
    </table>
</div>
</body>
</html>