<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
</head>
<body>

<h1>Página Pai Load JQuery</h1>

<input type="button" value="carregar página" onclick="carregar();">

<div id="mostrarPaginaFilha"></div><!-- Local de carregamento da pagina Filha -->
</body>

<script type="text/javascript">
	function carregar(){
		$("#mostrarPaginaFilha").load('paginaFilha.jsp');//load pagina em JQuery
	}
</script>

</html>