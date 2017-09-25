<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href='<c:url value="css/bootstrap.min.css" />' rel="stylesheet"
	type="text/css">
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
		</div>
	</nav>

	<div class="container-fluid">
		<div class="container well">

			<div class="row">
				<div class="col-lg-3">
					<label>Nome Setor:</label>
					<p>lalalala</p>
				</div>

				<div class="col-lg-3">
				<label>Nome do Relatório:</label>
					<p>lalalala</p>
				
				</div>
				<div class="col-lg-3">
				<label>Titulo:</label>
					<p>lalalala</p>
				
				</div>
				<div class="col-lg-3">
				<label>Assunto</label>
					<p>lalalala</p>
				
				</div>
			</div>

		</div>
	</div>
	<!-- fim  -->


	<div class="container-fluid">
		<div class="container well" align="left">
			<form class="form" role="form" action="" method="post">

				<div class="row">
					<div class="col-sm-12">
						<div class="form-group">

							<div class="btn-group" data-toggle="buttons">
								<label>Dias da Senama</label><br> <label
									class="btn btn-primary active"> <input type="checkbox"
									autocomplete="off">SEG
								</label> <label class="btn btn-primary"><input type="checkbox"
									autocomplete="off">TER </label> <label class="btn btn-primary">
									<input type="checkbox" autocomplete="off">QUA
								</label> <label class="btn btn-primary"> <input type="checkbox"
									autocomplete="off">QUI
								</label> <label class="btn btn-primary"> <input type="checkbox"
									autocomplete="off">SEX
								</label> <label class="btn btn-primary"> <input type="checkbox"
									autocomplete="off">SAB
								</label> <label class="btn btn-primary"> <input type="checkbox"
									autocomplete="off">DOM
								</label>
							</div>

							<BR> <BR>

							<div class="btn-group" data-toggle="buttons">
								<label>Horário Disponiveis</label><br> <label
									class="btn btn-primary active"> <input type="checkbox"
									autocomplete="off">00
								</label> <label class="btn btn-primary"> <input type="checkbox"
									autocomplete="off">01
								</label> <label class="btn btn-primary"> <input type="checkbox"
									autocomplete="off">02
								</label> <label class="btn btn-primary"> <input type="checkbox"
									autocomplete="off">03
								</label> <label class="btn btn-primary"> <input type="checkbox"
									autocomplete="off">04
								</label> <label class="btn btn-primary"> <input type="checkbox"
									autocomplete="off">05
								</label> <label class="btn btn-primary"> <input type="checkbox"
									autocomplete="off">06
								</label> <label class="btn btn-primary"> <input type="checkbox"
									autocomplete="off">07
								</label> <label class="btn btn-primary"> <input type="checkbox"
									autocomplete="off">08
								</label> <label class="btn btn-primary"> <input type="checkbox"
									autocomplete="off">09
								</label> <label class="btn btn-primary"> <input type="checkbox"
									autocomplete="off">10
								</label> <label class="btn btn-primary"> <input type="checkbox"
									autocomplete="off">11
								</label> <label class="btn btn-primary"> <input type="checkbox"
									autocomplete="off">12
								</label> <label class="btn btn-primary"> <input type="checkbox"
									autocomplete="off">13
								</label> <label class="btn btn-primary"> <input type="checkbox"
									autocomplete="off">14
								</label> <label class="btn btn-primary"> <input type="checkbox"
									autocomplete="off">15
								</label> <label class="btn btn-primary"> <input type="checkbox"
									autocomplete="off">16
								</label> <label class="btn btn-primary"> <input type="checkbox"
									autocomplete="off">17
								</label> <label class="btn btn-primary"> <input type="checkbox"
									autocomplete="off">18
								</label> <label class="btn btn-primary"> <input type="checkbox"
									autocomplete="off">19
								</label> <label class="btn btn-primary"> <input type="checkbox"
									autocomplete="off">20
								</label> <label class="btn btn-primary"> <input type="checkbox"
									autocomplete="off">21
								</label> <label class="btn btn-primary"> <input type="checkbox"
									autocomplete="off">22
								</label> <label class="btn btn-primary"> <input type="checkbox"
									autocomplete="off">23
								</label>
							</div>



						</div>

						<div class="form-group">
							<button type="reset" class="btn btn-default">Limpar</button>
							<button type="submit" class="btn btn-primary" value="Cadastrar">Cadastrar
								Relatório</button>
							<a href="/alert/Menu" class="btn btn-info" role="button">Voltar</a>

						</div>
					</div>
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