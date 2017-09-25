<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href='<c:url value="css/bootstrap.min.css" />' rel="stylesheet"	type="text/css">
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
				<a class="navbar-brand" href="/alert/Menu"><img alt="logo"src="img/web_alert.png" width="90"></a>
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<form class="navbar-form navbar-right">
					<a href="/alert/listarSetor" class="btn btn-info" role="button">Voltar</a>
					<a href="/alert/sair" class="btn btn-info" role="button">Sair</a>
				</form>
			</div>
		</div>
	</nav>
	<!-- fim  -->


	<div class="container-fluid">

		<div class="container well" align="left">



			<h4>Preencha o formulário para cadastro:</h4>
			<hr>


			<form class="form" role="form" action="addSetor" method="post">

				<div class="row">
					<div class="col-sm-4">
						<div class="form-group">
							<label>Nome do Setor:</label><br> <input
								class="form-control" type="text" name="nom_setor" maxlength="50">
						</div>
					</div>

					<div class="col-sm-4">
						<div class="form-group">
							<label>Nome do Setor Reduzido:</label><br> <input
								class="form-control" type="text" name="nom_setor_reduzido" maxlength="10">
						</div>


					</div>

					<div class="col-sm-4">
						<div class="form-group">
							<label>Status:</label><br> <select class="form-control"
								name="ind_ativo">
								<option value="S">Ativo</option>
								<option value="N" selected="selected">Inativo</option>
							</select>
						</div>
					</div>
				</div>

				<div class="row">
					<div class="col-sm-6">
						<div class="form-group">
						<input class="form-control"
								type="hidden" name="url_link">
						</div>
					</div>

					<div class="col-sm-6">
						<div class="form-group">
							 <input class="form-control"
								type="hidden" name="url_imagem">
						</div>
					</div>
				</div>

				<div class="form-group">
					<button type="reset" class="btn btn-default">Limpar</button>
					<button type="submit" class="btn btn-primary" value="Cadastrar">Cadastrar
						Setor</button>
					<a href="/alert/listarSetor" class="btn btn-info" role="button">Voltar</a>

				</div>
			</form>
		</div>
	</div>

	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="js/bootstrap.min.js"></script>
	
</body>
</html>