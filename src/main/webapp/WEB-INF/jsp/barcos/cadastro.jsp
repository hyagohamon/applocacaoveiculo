<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
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
    <h2>Cadastro de barcos</h2>
    <form method="post" action="/barcos">

        <c:import url="../veiculos/cadastro.jsp"></c:import>

        <div class="mb-3 mt-3">
            <label for="nome" id="nome" class="form-label">Motor:</label>
            <div class="form-check">
                <input type="radio" class="form-check-input" id="radio1" name="motor" value="true" checked>Sim
                <label class="form-check-label" for="radio1"></label>
            </div>
            <div class="form-check">
                <input type="radio" class="form-check-input" id="radio2" name="motor" value="false">Não
                <label class="form-check-label" for="radio2"></label>
            </div>
        </div>

        <div class="mb-3 mt-3">
            <label for="qtdDeck" id="qtdDeck" class="form-label">Quantidade de decks:</label>
            <input type="text" class="form-control" placeholder="Digite a quantidade de decks do barco" name="qtdDeck">
        </div>

        <div class="mb-3 mt-3">
            <label for="categoria" id="categoria" class="form-label">Categoria:</label>
            <input type="text" class="form-control" placeholder="Digite a categoria do barco" name="categoria">
        </div>

        <button type="submit" class="btn btn-primary">Cadastrar</button>
    </form>


</div>
</body>
</html>