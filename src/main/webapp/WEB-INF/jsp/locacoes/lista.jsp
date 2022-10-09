<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
    <title>AppLocação</title>
</head>
<body>
<c:import url="../menu.jsp"></c:import>

<div class="container mt-3">

    <c:if test="${msg != null}">
        <div class="alert alert-success alert-dismissible fade show" role="alert">
            ${msg}.
            <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
        </div>
    </c:if>


    <h3>Locações</h3>
    <a href="/locacoes" class="btn btn-success mb-2 ">Nova</a>

    <table class="table table-striped table-hover table-bordered">
        <thead>
        <tr>
            <th>Id</th>
            <th>Descrição</th>
            <th>Data</th>
            <th>Web</th>
            <th>Cliente</th>
            <th>Veiculo</th>
            <th>Ações</th>

        </tr>
        </thead>
        <tbody>
        <c:forEach var="locacao" items="${listagem}">

            <tr>
                <td>${locacao.id}</td>
                <td>${locacao.descricao}</td>
                <td>${locacao.data}</td>
                <td>${locacao.web}</td>
                <td>${locacao.cliente.nome}</td>
                <td>${locacao.veiculos.size()}</td>
                <td><a href="/locacoes/${locacao.id}/excluir" class="btn btn-danger">Excluir</a></td>


            </tr>

        </c:forEach>
        </tbody>
    </table>


</div>
</body>
</html>