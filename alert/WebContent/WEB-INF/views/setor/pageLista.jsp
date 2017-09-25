<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href='<c:url value="css/bootstrap.min.css" />' rel="stylesheet" type="text/css">
<link rel="shortcut icon" href="img/favicon.ico" type="image/x-icon" />

<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
<style>
body {
	background-image: url("img/fundo.jpg");
	background-attachment: fixed;
}
</style>

<title>Aletr 1.0</title>
</head>
<body>


	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="/alert/Menu"> <img alt="logo"
					src="img/web_alert.png" width="90"></a>
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<form class="navbar-form navbar-right">
					<a href="/alert/Menu" class="btn btn-info" role="button">Menu</a> <a
						href="/alert/listarContatos" class="btn btn-info" role="button">Contatos</a>
						<c:if test="${usuarioLogado.NOME_CONTATO == 'admin'}">
					<a href="/alert/listarAutenticacao" class="btn btn-info"
						role="button">Remetente</a>
						</c:if>
					 <a href="/alert/sair"
						class="btn btn-info" role="button">Sair</a>
				</form>
			</div>
		</div>
	</nav>
	<!-- fim  -->


	<div class="container-fluid">
		<div class="container well">
			<form class="form">
				<div class="row">
					<div class="col-lg-6">
						<div class="form-group">
							<a href="/alert/cadastroSetor" class="btn btn-primary"
								role="button">Novo Setor</a>
						</div>
					</div>
					
				</div>
			</form>
		</div>
	</div>
	<!-- fim  -->

	<br>

	<div class="container-fluid">

		<div class="container well" align="left">
			<h4>Setores</h4>
			<hr>


			<table class="table table-bordered">
				<tr bgcolor="grey">
					<th>Código</th>
					<th>Nome do Setor</th>
					<th>Nome do Setor reduzido</th>
					<th>Status</th>
					<th>Operações</th>
				</tr>

				<c:forEach items="${setor}" var="s">
					<tr>
						<td>${s.cod_setor }</td>
						<td>${s.nom_setor }</td>
						<td>${s.nom_setor_reduzido }</td>
						<td>${s.ind_ativo }</td>
						<td><a class="btn btn-info btn-xs"
							href="/alert/alterarSetor?cod_setor=${s.cod_setor}">Editar</a> <a
							class="btn btn-danger btn-xs"
							href="/alert/removeSetor?cod_setor=${s.cod_setor}">Altera
								Status</a></td>

					</tr>
				</c:forEach>

			</table>
		</div>
	</div>

	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="js/bootstrap.min.js"></script>


</body>
</html>