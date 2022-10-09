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
<c:set var="ativaBotao" value="">

</c:set>
<c:import url="../menu.jsp"></c:import>
<div class="container mt-3">
    <h2>Cadastro de locações</h2>
    <form method="post" action="/locacoes">


        <div class="mb-3 mt-3">
            <label for="descricao" id="descricao" class="form-label">Descrição:</label>
            <input type="text" class="form-control" placeholder="Digite a descrição da locação" name="descricao">
        </div>

        <div class="mb-3 mt-3">
            <c:if test="${not empty clientes}">

            <label for="cliente" id="cliente" class="form-label">Cliente:</label>

            <select name="cliente" class="form-select">
                <c:forEach items="${clientes}" var="c">
                    <option value="${c.id}">${c.nome}</option>
                </c:forEach>

            </select>
            </c:if>

            <c:if test="${ empty clientes}">
                <div class="alert alert-warning">
                    <strong>Atenção!</strong> Não existem clientes cadastrados.
                </div>

                <c:set var="ativaBotao" value="disabled"></c:set>

            </c:if>
        </div>

        <div class="mb-3 mt-3">
            <c:if test="${not empty veiculos}">
                <label for="veiculos" id="veiculos" class="form-label">Veículos:</label>
                <c:forEach items="${veiculos}" var="v">
                    <div class="form-check">
                        <label class="form-check-label">
                            <input class="form-check-input" name="veiculos" type="checkbox" value="${v.id}" >${v.marca} - ${v.modelo}</label>
                    </div>

                </c:forEach>
            </c:if>

            <c:if test="${ empty veiculos}">
                <div class="alert alert-warning">
                    <strong>Atenção!</strong> Não existem veiculos cadastrados.
                </div>
                <c:set var="ativaBotao" value="disabled"></c:set>

            </c:if>




        </div>


        <button ${ativaBotao} type="submit" class="btn btn-primary">Cadastrar</button>
    </form>


</div>
</body>
</html>