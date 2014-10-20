<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd" >
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>D�tail</title>
<link
	href="${pageContext.request.contextPath}/resources/css/bootstrap.css"
	rel="stylesheet">
	

</head>
<body>
	<div class="container">

		<nav class="navbar navbar-inverse">
		<ul class="nav navbar-nav">
			<li class="active"><a href="#"><%=session.getAttribute("user")%></a>
			</li>
			<li><a href="logout">Deconnexion</a></li>
			<li><a href="panier">Panier</a></li>

		</ul>
		<form class="navbar-form pull-right">
			<input type="text" style="width: 150px" class="input-small"
				placeholder="Recherche">
			<button type="submit" class="btn btn-primary btn-xs">
				<span class="glyphicon glyphicon-eye-open"></span> Chercher
			</button>
		</form>
		</nav>
	</div>
	

<div class="container">
    <div class="col-md-12">
        <div class="center-block text-center">
            <h1>D�tail d'un produit </h1>
            <p class="lead">Vue d'une fiche produit (produit s�lectionn� dans la vue pr�c�dente)</p>
        </div>
        <div class="container">
            <div class="menu row">
                <div class="product col-sm-6">
                  <a href="#"><img class="img-responsive" src="${pageContext.request.contextPath}/resources/img/logounis.PNG" height="450" width="180"><i class="btn btn-product fa fa-star"></i></a>
					<hr>
                    <h2>Nom</h2>
                    <p>Description tr�s d�taill�</p>
                    <hr>
                  	<h2 class="text-right">Prix (en euros)</h2>
                    <button class="btn btn-primary btn-lg ">Ajouter au panier </button>
                    <hr>
                   
                  
                  
                    
                </div>
                
            </div>
            <!--/row-->
        </div>
        <!--/container-->
    </div>
    </div>




</body>
</html>