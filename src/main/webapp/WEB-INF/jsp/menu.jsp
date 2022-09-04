<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>

<nav class="navbar navbar-expand-sm navbar-light bg-light">
    <div class="container-fluid">
        <a class="navbar-brand" href="/">AppVeículo</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#mynavbar">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="mynavbar">
            <c:if test="${not empty loggedUser}">

                <ul class="navbar-nav me-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="/barcos/lista">Barcos</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/carros/lista">Carros</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/motos/lista">Motos</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/clientes/lista">Clientes</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/usuarios/lista">Usuários</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/locacoes/lista">Locações</a>
                    </li>
                </ul>
            </c:if>


        </div>
    </div>
    <form class="d-flex flex-row-reverse">
        <c:if test="${empty loggedUser}">

            <a href="/usuario" class="btn btn-outline-primary me-2">Registrar</a>
            <a href="/login" class="btn btn-outline-primary me-2">Login</a>
        </c:if>

        <c:if test="${not empty loggedUser}">
            <a href="/logout" class="btn btn-outline-danger me-2">Logout ${loggedUser}</a>
        </c:if>

    </form>
</nav>
