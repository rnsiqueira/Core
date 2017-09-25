<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
				<a class="navbar-brand" href="#"><img alt="logo"src="img/web_alert.png" width="90">

				</a>

			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<form class="navbar-form navbar-right">
					<a href="/alert/Menu" class="btn btn-info" role="button">Voltar</a>
					<a href="/alert/sair" class="btn btn-info" role="button">Sair</a>
				</form>
			</div>
		</div>
	</nav>


	<!-- fim  -->

	<div class="container-fluid">
		<div class="container well" align="left">
			<div class="row">
				<div class="col-sm-6">
					<h4>Escolha o Alerta</h4>
				</div>
				<div class="col-sm-6">
					<form class="form" role="form" action="" method="post">
						<div class="row">
							<div class="col-sm-12">
								<div class="form-group">
									<select id="selecttipo" class="form-control">
										<option value="datas" selected="selected"></option>
										<option value="P">Período</option>
										<option value="A">Anualmente</option>
										<option value="M">Mensalmente</option>
										<option value="S">Semanalmente</option>
									</select>
								</div>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>

	<div id="conteudo"></div>

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>

	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="js/bootstrap.min.js"></script>

	<script>
		$(document).ready(function() {
			$("#selecttipo").on("change", function(e) {
				if (this.value == "P") {
					var pagina = "/alert/listarContatos";
					$('#conteudo').load(pagina);
				} else if (this.value == "A") {
					var pagina = "/alert/listarSetor";
					$('#conteudo').load(pagina);
				} else if (this.value == "M") {
					var pagina = "/alert/listarContatos";
					$('#conteudo').load(pagina);
				} else if (this.value == "S") {
					var pagina = "/alert/anual";
					$('#conteudo').load(pagina);
				}
			});
		});
	</script>
	
</body>
</html>