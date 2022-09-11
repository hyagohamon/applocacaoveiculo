<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <meta charset="ISO-8859-1">
    <title>AppLocação</title>
</head>
<body>
<c:import url="menu.jsp"></c:import>
<div class="container mt-3">

    <p>${projeto.nome}</p>
    <p>${projeto.descricao}</p>

    <c:forEach var="c" items="${projeto.classes}" >
        <h3>Classe: ${c.nome}</h3>
        <table class="table table-striped table-hover table-bordered">
            <thead>
            <tr>
                <th>Atributo</th>
                <th>Tipo</th>
                <th>Descrição</th>
            </tr>
            </thead>
            <tbody>

            <c:forEach var="a" items="${c.atributos}">
                <tr>
                    <td>${a.nome}</td>
                    <td>${a.tipo}</td>
                    <td>${a.descricao}</td>
                </tr>
            </c:forEach>


            </tbody>
        </table>
    </c:forEach>



</div>
</body>
</html>