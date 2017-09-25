<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt">
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
				<a class="navbar-brand" href="#"><img alt="logo"
					src="img/web_alert.png" width="90"> </a>

			</div>
			<div id="navbar" class="navbar-collapse collapse">

				<form class="navbar-form navbar-right">
					<a href="/alert/Menu" class="btn btn-info" role="button">Voltar</a>
					<a href="/alert/sair" class="btn btn-info" role="button">Sair</a>
				</form>
			</div>
		</div>
	</nav>

	<br>

	<br>

	<div class="container-fluid">

		<div class="container well" align="left">

			<h4>Preencha o formulário para cadastro:</h4>
			<hr>

			<form class="form" role="form" action="addRelatorio" method="post">

				<div class="row">
					<div class="col-sm-4">
						<div class="form-group">
							<label>Setor:</label><br> <select class="form-control"
								name="cod_setor">
								<c:forEach items="${setor}" var="s">
									<option value="${s.cod_setor}">${s.nom_setor}</option>
								</c:forEach>
							</select>
						</div>
					</div>

					<div class="col-sm-4">

						<div class="form-group">
							<label>Usuário:</label><br> <select class="form-control"
								name="cod_contato">
								<c:forEach items="${user}" var="us">
									<option value="${us.COD_CONTATO}">${us.NOME_CONTATO}</option>
								</c:forEach>
							</select>
						</div>
					</div>




					<div class="col-sm-4">
						<div class="btn-group" data-toggle="buttons">
						<label>Enviar Como:</label><br> 
							<label class="btn btn-primary active">
							<input	type="radio" name="ind_anexo" id="option1" autocomplete="off"  value="S">Enviar Anexado
							</label>
							<label class="btn btn-primary">
							 <input type="radio" name="ind_anexo" id="option2" autocomplete="off" checked value="">Enviar no E-Mail
							</label>
						</div>

					</div>






				</div>
				<!--Fim Primeiro Row -->

				<div class="row">

					<div class="col-sm-4">
						<div class="form-group">
							<label>Nome Relatorio:</label><br> <input required
								class="form-control" type="text" name="rel_nome" />
						</div>

					</div>

					<div class="col-sm-4">
						<div class="form-group">
							<label>Assunto:</label><br> <input required class="form-control"
								type="text" name="rel_assunto" />
						</div>

					</div>


					<div class="col-sm-4">

						<div class="form-group">
							<label>Titulo:</label><br> <input required class="form-control"
								type="text" name="rel_titulo" />
						</div>

					</div>

				</div>
				<!--Fim Segundo Row -->




				<div class="row">

					<div class="col-sm-12">
						<div class="form-group">
							<label>Introdução</label><br>
							<textarea required class="form-control" name="rel_introducao" rows="4"></textarea>
						</div>
					</div>

					<div class="col-sm-12">
						<div class="form-group">
							<label>Observação Corpo Email:</label><br>
							<textarea class="form-control" name="rel_rodape" rows="4"></textarea>
						</div>
					</div>

				</div>
				<!--Fim Terceiro Row -->

				<div class="row">

					<div class="col-sm-6">
						<div class="form-group">
							<label>Nome do Desenvolvedor:</label><br> <select
								class="form-control" name="desenvolvedor_nome">
								<c:forEach items="${user}" var="u">
									<option value="${u.NOME_CONTATO}">${u.NOME_CONTATO}</option>
								</c:forEach>
							</select>
						</div>
					</div>
					<div class="col-sm-6">
						<div class="form-group">
							<label>Email do Desenvolvedor:</label><br> <select
								class="form-control" name="desenvolvedor_email">
								<c:forEach items="${user}" var="u">
									<option value="${u.EMAIL_CONTATO}">${u.EMAIL_CONTATO}</option>
								</c:forEach>
							</select>
						</div>
					</div>
				</div>


				<div class="form-group">
					<button type="reset" class="btn btn-default">Limpar</button>
					<button type="submit" class="btn btn-primary" value="Cadastrar">Cadastrar
						Alerta</button>
					<a href="/alert/Menu" class="btn btn-info" role="button">Voltar</a>

				</div>
			</form>
		</div>
	</div>

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>

	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="js/bootstrap.min.js"></script>

</body>
</html>