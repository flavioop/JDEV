<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DataTable jQuery</title>
	<link rel="stylesheet" href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css">
	 <script type="text/javascript" src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
	 <script src ="//cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>     
</head>

<table id="minhatabela" class="display" cellspancing="0" width="100%">
        <thead>
            <tr>
                <th>Id</th>
                <th>Login</th>
            </tr>
        </thead>
        <tfoot>
            <tr>
                <th>Id</th>
                <th>Login</th>
            </tr>
        </tfoot>
 </table>

<body>
<script type="text/javascript">
$(document).ready(function() {//faz o processamento na hora que abre a tela
    $('#minhatabela').DataTable( {
        "processing": true,
        "serverSide": true,
        "ajax": "carregarDadosDataTable" /*URL de retorno dos dados do servidor (resposta do servidor)*/
    } );
} );
</script>

</body>
</html>