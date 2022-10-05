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


    <h3>Clientes</h3>

    <a href="/clientes" class="btn btn-success mb-2 ">Novo</a>

    <table class="table table-striped table-hover table-bordered">
        <thead>
        <tr>
            <th>Código</th>
            <th>Nome</th>
            <th>CPF</th>
            <th>E-mail</th>
            <th>Cadastrado por</th>
            <th>Ações</th>

        </tr>
        </thead>
        <tbody>
        <c:forEach var="cliente" items="${listagem}">

            <tr>
                <td>${cliente.codigo}</td>
                <td>${cliente.nome}</td>
                <td>${cliente.cpf}</td>
                <td>${cliente.email}</td>
                <td>${cliente.usuario.nome}</td>
                <td><a href="/clientes/${cliente.codigo}/excluir"  class="btn btn-danger">Excluir</a></td>



            </tr>
        </c:forEach>

        </tbody>
    </table>


</div>
</body>
</html>