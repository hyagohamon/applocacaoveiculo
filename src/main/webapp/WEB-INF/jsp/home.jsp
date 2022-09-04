<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <meta charset="ISO-8859-1">
    <title>AppLoca��o</title>
</head>
<body>
<c:import url="menu.jsp"></c:import>
<div class="container mt-3">

    <p>Projeto de Loca��o de Ve�culos</p>

    <h3>Classe: Cliente</h3>
    <table class="table table-striped table-hover table-bordered">
        <thead>
        <tr>
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descri��o</th>
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

    <h3>Classe: Loca��o</h3>
    <table class="table table-striped table-hover table-bordered">
        <thead>
        <tr>
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descri��o</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>Descri��o</td>
            <td>String</td>
            <td>Descri��o da loca��o</td>
        </tr>
        <tr>
            <td>data</td>
            <td>LocalDate</td>
            <td>Data da realiza��o da loca��o</td>
        </tr>
        <tr>
            <td>web</td>
            <td>boolean</td>
            <td>indica se a loca��o foi realizada pela WEB ou n�o</td>
        </tr>
        </tbody>
    </table>


    <h3>Classe: Carro</h3>
    <table class="table table-striped table-hover table-bordered">
        <thead>
        <tr>
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descri��o</th>
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
            <td>Velocidade m�xima</td>
        </tr>
        </tbody>
    </table>

    <h3>Classe: Moto</h3>
    <table class="table table-striped table-hover table-bordered">
        <thead>
        <tr>
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descri��o</th>
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
            <td>Velocidade m�xima</td>
        </tr>
        </tbody>
    </table>

    <h3>Classe: Barco</h3>
    <table class="table table-striped table-hover table-bordered">
        <thead>
        <tr>
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descri��o</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>motor</td>
            <td>boolean</td>
            <td> Indica se o barco � a motor ou n�o</td>
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