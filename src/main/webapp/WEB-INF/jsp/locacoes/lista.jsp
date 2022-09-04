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


    <h3>Classe: Loca��o</h3>
    <table class="table table-striped table-hover table-bordered">
        <thead>
        <tr>
            <th>C�digo</th>
            <th>Descri��o</th>
            <th>Data</th>
            <th>Web</th>
            <th>Cliente</th>
            <th>Veiculo</th>
            <th>A��es</th>

        </tr>
        </thead>
        <tbody>
        <c:forEach var="locacao" items="${listagem}">

            <tr>
                <td>${locacao.codigo}</td>
                <td>${locacao.descricao}</td>
                <td>${locacao.data}</td>
                <td>${locacao.web}</td>
                <td>${locacao.cliente.nome}</td>
                <td>${locacao.veiculos.size()}</td>
                <td><a href="/locacoes/${locacao.codigo}/excluir">Excluir</a></td>


            </tr>

        </c:forEach>
        </tbody>
    </table>


</div>
</body>
</html>