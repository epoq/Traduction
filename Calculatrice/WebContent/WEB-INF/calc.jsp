<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Bienvenue sur l'application calculatrice de Yoann G!!!</title>
	</head>
	<body>
		<h1> Entrez ci-dessous votre calcul :</h1>
		<fieldset>
			<form action="Transfert" method="post">
				<label> Premier nombre</label>
				<input name="first" type="text"/>
				<label>Opérande</label>
				<select name="operande">
					<option value="addition"> addition +</option>
					<option value="soustraction">soustraction -</option>
					<option value="multiplication">multiplication X</option>
					<option value="division">division / </option>
				</select>
				<label> Deuxième nombre</label>
				<input  name="second" type="text"/>
				<input type="submit" value="Calculer"/>
				<p> LE RESULTAT EST : ${essai} </p>
			</form>
		</fieldset>
	</body>
</html>