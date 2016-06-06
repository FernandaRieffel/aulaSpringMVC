<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Cadastrar Clientes</h2>

<form action="adicionar-clientes.html" method="post">
	Nome: <input type="text" name="nome"/><br/>
	Endereço: <input type="text" name="endereco"/><br/>
	Bairro: <input type="text" name="bairro"/><br/>
	Cidade: <input type="text" name="cidade"/><br/>
	
	<input type="submit" name="cadastrar" value="Cadastrar"/>
</form>

<h3>Lista de Clientes</h3>

<table border="1">
	<tr>
		<th>Código</th>
		<th>Nome</th>
		<th>Endereço</th>
		<th>Bairro</th>
		<th>Cidade</th>
	</tr>
<c:forEach items="${clientes}" var="c">	
	<tr>
		<th>${c.codigo}</th>
		<td>${c.nome}</td>
		<td>${c.endereco}</td>
		<td>${c.bairro}</td>
		<td>${c.cidade}</td>
	</tr>
</c:forEach>
	
</table>

</body>
</html>