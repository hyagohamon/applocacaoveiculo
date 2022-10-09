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
    <h2>Cadastro de motos</h2>
    <form method="post" action="/motos">

        <c:import url="../veiculos/cadastro.jsp"></c:import>

        <div class="mb-3 mt-3">
            <label for="qntdCilindradas" id="qntdCilindradas" class="form-label">Quantidade de cilindradas:</label>
            <input type="text" class="form-control" placeholder="Digite a quantidade de cilindradas da moto" name="qntdCilindradas">
        </div>

        <div class="mb-3 mt-3">
            <label for="velocidadeMaxima" id="velocidadeMaxima" class="form-label">Velocidade máxima:</label>
            <input type="text" class="form-control" placeholder="Digite a velocidade máxima da moto" name="velocidadeMaxima">
        </div>

        <div class="mb-3 mt-3">
            <label for="qntdMarchas" id="qntdMarchas" class="form-label">Quantidade de marchas:</label>
            <input type="text" class="form-control" placeholder="Digite a quantidade de marchas da moto" name="qntdMarchas">
        </div>

        <button type="submit" class="btn btn-primary">Cadastrar</button>
    </form>


</div>
</body>
</html>