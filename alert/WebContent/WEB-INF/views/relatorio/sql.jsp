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

	<div class="container-fluid">

		<div class="container well" align="left">

			<h4>Criar Quary para o Relatório:</h4>
			<hr>

			<form class="form" role="form" action="alterSql" method="post">

				<div class="row">
					<div class="col-sm-4">
						<div class="form-group">
					<input type="text" name="cod_relatorio" value="idRel.cod_relatorio">
					<input type="text" name="cod_setor" value="idRel.cod_setor">		
						</div>
					</div>

					<div class="col-sm-12">
						<div class="form-group">
							<label>Popular Relatório</label><br>
							<textarea class="form-control" name="rel_sql" rows="5"></textarea>
						</div>


					</div>

				</div>
				

				
				<div class="form-group">
					<button type="reset" class="btn btn-default">Limpar</button>
					<button type="submit" class="btn btn-primary" value="Cadastrar">Cadastrar
						Relatório</button>
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