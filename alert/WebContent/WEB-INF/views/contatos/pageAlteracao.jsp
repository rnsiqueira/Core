<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href=<c:url value="css/bootstrap.min.css" /> rel="stylesheet"	type="text/css">
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
<script type="text/javascript">
	function somente_numero(campo) {
		var digits = "0123456789-() "
		var campo_temp
		for (var i = 0; i < campo.value.length; i++) {
			campo_temp = campo.value.substring(i, i + 1)
			if (digits.indexOf(campo_temp) == -1) {
				campo.value = campo.value.substring(0, i);
			}
		}
	}
</script>
<title>Alert 1.0</title>
</head>
<body>

	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="/alert/Menu"><img alt="logo"
					src="img/web_alert.png" width="90"></a>
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<form class="navbar-form navbar-right">
					<a href="/alert/listarContatos" class="btn btn-info" role="button">Voltar</a>
					<a href="/alert/sair" class="btn btn-info" role="button">Sair</a>
				</form>
			</div>
		</div>
	</nav>
	<!-- fim  -->

	<div class="container-fluid">

		<div class="container well" align="left">


			<h4>Alterar Usuário</h4>
			<hr>


			<form class="form" role="form" action="alterContatos" method="post">

				<div class="row">
					<div class="col-sm-12">
						<div class="form-group">
							<label>Nome:</label><br> <input class="form-control"
								type="text" name="NOME_CONTATO" value="${user.NOME_CONTATO}">
						</div>
					</div>

					<div class="col-sm-12">
						<div class="form-group">
							<label>Email:</label><br> <input type="email"
								class="form-control" name="EMAIL_CONTATO" value="${user.EMAIL_CONTATO}">
						</div>
					</div>
				</div>

				<div class="row">
					<div class="col-sm-3">
						<div class="form-group">
							<label>Senha:</label><br> <input class="form-control"
								type="password" name="SENHA_CONTATO" value="${user.SENHA_CONTATO}" >
						</div>
					</div>

					<div class="col-sm-3">
						<div class="form-group">
							<label>Celular:</label><br> <input class="form-control" value="${user.NROCEL_CONTATO}"
								type="text" name="NROCEL_CONTATO" onkeyup='somente_numero(this)'>
						</div>
					</div>

					<div class="col-sm-3">
						<div class="form-group">
							<label>Privilegio:</label><br> <select class="form-control"
								name="COD_PRIVILEGIO">
								<option value="1">Administrador</option>
								<option value="0">Usuário</option>
							</select>
						</div>
					</div>

					<div class="col-sm-3">
						<div class="form-group">
							<label>Ativo:</label><br> <select class="form-control"
								name="IND_ATIVO">
								<option value="S">Ativo</option>
								<option value="N">Inativo</option>
							</select>
						</div>

					</div>
					
					<input type="hidden" name = "COD_CONTATO" value="${user.COD_CONTATO}"/>

				</div>

				<div class="form-group">
					<button type="reset" class="btn btn-default">Limpar</button>
					<button type="submit" class="btn btn-primary" value="Cadastrar">Alterar
						Contato</button>
					<a href="/alert/listarContatos" class="btn btn-info" role="button">Voltar</a>

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