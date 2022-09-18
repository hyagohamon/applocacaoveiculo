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
    <h2>Cadastro de carros</h2>
    <form method="post" action="/carros">

        <c:import url="../veiculos/cadastro.jsp"></c:import>

        <div class="mb-3 mt-3">
            <label for="qntdPortas" id="qntdPortas" class="form-label">Quantidade de Portas:</label>
            <input type="text" class="form-control" placeholder="Digite a quantidade de portas do veículo" name="qntdPortas">
        </div>

        <div class="mb-3 mt-3">
            <label for="qntdCavalos" id="qntdCavalos" class="form-label">Quantidade de cavalos:</label>
            <input type="text" class="form-control" placeholder="Digite a quantiade de cavalos do veículo" name="qntdCavalos">
        </div>

        <div class="mb-3 mt-3">
            <label for="velocidadeMaxima" id="velocidadeMaxima" class="form-label">Velocidade máxima:</label>
            <input type="text" class="form-control" placeholder="Digite a velocidade máxima do veículo" name="velocidadeMaxima">
        </div>


        <button type="submit" class="btn btn-primary">Cadastrar</button>
    </form>


</div>
</body>
</html>