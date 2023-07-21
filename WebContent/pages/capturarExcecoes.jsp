<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Capturando exceções com jquery</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
</head>
<body>
	<h3>Capturando Exceções</h3>
	<input type = "text" value="Valor Informado" id="txtvalor">
	<input type="button" onclick="testarExcecao();" value = "Testar Exceção">
	
	<script type="text/javascript">
		function testarExcecao(){
			valorInformado = ($('#txtvalor').val());
			
			$.ajax({
				method: "POST",					 
				url:"capturarExcecao",//para qual servlet?
				data: { valorParam: valorInformado }
			})
				
			.done(function(response){//resposta Ok
				alert("Sucesso" + response);
			})
			 //fazer algo 
			.fail(function (xhr, status,erroThrown){//resposta erro - algum erro ocorreu
				alert("Error: " + xhr.responseText);
				 //fazer algo se der errado
				
			});
		}
		
	</script>

</body>
</html>