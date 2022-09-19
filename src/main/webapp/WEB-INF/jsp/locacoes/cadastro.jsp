<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <meta charset="ISO-8859-1">
    <title>Login</title>
</head>
<body>
<c:import url="../menu.jsp"></c:import>
<div class="container mt-3">
    <h2>Cadastro de locações</h2>
    <form method="post" action="/locacoes">


        <div class="mb-3 mt-3">
            <label for="descricao" id="descricao" class="form-label">Descrição:</label>
            <input type="text" class="form-control" placeholder="Digite a descrição da locação" name="descricao">
        </div>

        <div class="mb-3 mt-3">
            <label for="cliente" id="cliente" class="form-label">Cliente:</label>

            <select class="form-select">
                <c:forEach items="${clientes}" var="c">
                    <option>${c.nome}</option>
                </c:forEach>

            </select>
        </div>

        <div class="mb-3 mt-3">
            <label for="veiculos" id="veiculos" class="form-label">Veículos:</label>


            <c:forEach items="${veiculos}" var="v">
                <div class="form-check">
                    <input class="form-check-input" type="checkbox" id="check1" name="option1" value="something" >
                    <label class="form-check-label">${v.marca} - ${v.modelo}</label>

                </div>

            </c:forEach>

        </div>


        <button type="submit" class="btn btn-primary">Cadastrar</button>
    </form>


</div>
</body>
</html>