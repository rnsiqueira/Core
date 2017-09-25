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
				<a class="navbar-brand" href="/alert/Menu"><img alt="logo"src="img/web_alert.png" width="90"> </a>
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<form class="navbar-form navbar-right">
					<a href="/alert/Menu" class="btn btn-info" role="button">Menu</a>
					<a href="/alert/listarContatos" class="btn btn-info" role="button">Contatos</a> 
					<a href="/alert/listarSetor" class="btn btn-info" role="button">Setores</a>

					<a href="/alert/sair" class="btn btn-info" role="button">Sair</a>
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
							<a href="/alert/CadastroAutEmail" class="btn btn-primary"
								role="button">Novo Remetente</a>
						</div>
					</div>

					
				</div>
			</form>
		</div>
	</div>
	<!-- fim  -->




	<div class="container-fluid">

		<div class="container well" align="left">
			<h4>Remetente</h4>
			<hr>


			<table class="table table-bordered">
				<tr bgcolor="grey">
					<th>Id</th>
					<th>Email</th>
					<th>Smtp</th>
					<th>Porta</th>
					<th>Operações</th>
				</tr>

				<c:forEach items="${autE}" var="au">
					<tr>
						<td>${au.cod_autenticacao}</td>
						<td>${au.aut_usuario}</td>
						<td>${au.email_host}</td>
						<td>${au.email_porta}</td>
						<td><a class="btn btn-danger btn-xs" href="/alert/removeAutEmail?cod_autenticacao=${au.cod_autenticacao}">Remover</a></td>

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