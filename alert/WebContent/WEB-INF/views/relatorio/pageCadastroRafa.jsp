<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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

			<h4>Preencha o formulário para cadastro:</h4>
			<hr>

			<form class="form" role="form" action="addRelatorio" method="post">

				<div class="row">
					<div class="col-sm-4">
						<div class="form-group" >
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
						<div class="form-group">
							<label>Tipo:</label><br> <select id="selectstatus"
								class="form-control" name="ind_anexo">

								<option value="T" selected="selected">Texto</option>
								<option value="S">Anexo</option>
							</select>
						</div>

					</div>


				</div>
				<!--Fim Primeiro Row -->

				<div class="row">

					<div class="col-sm-4">
						<div class="form-group">
							<label>Nome Relatorio:</label><br> <input
								class="form-control" type="text" name="rel_nome" />
						</div>

					</div>

					<div class="col-sm-4">
						<div class="form-group">
							<label>Assunto:</label><br> <input class="form-control"
								type="text" name="rel_assunto" />
						</div>

					</div>

					<div class="col-sm-4">

						<div class="form-group">
							<label>Titulo:</label><br> <input class="form-control"
								type="text" name="rel_titulo" />
						</div>

					</div>

				</div>
				<!--Fim Segundo Row -->




				<div class="row">

					<div class="col-sm-12">
						<div class="form-group">
							<label>Introdução</label><br>
							<textarea class="form-control" name="rel_introducao" rows="4"></textarea>
						</div>
					</div>


					<div id="divtexto" class="col-sm-12">
						<div class="form-group">
							<label>Texto:</label><br>
							<textarea class="form-control" name="rel_texto" rows="4"></textarea>
						</div>
					</div>

					<div class="col-sm-12">
						<div class="form-group">
							<label>Observação:</label><br>
							<textarea class="form-control" name="rel_rodape" rows="4"></textarea>
						</div>
					</div>
					<div class="col-sm-12">
						<div class="form-group">
							<label>Descreva brevemente o que se deseja:</label><br>
							<textarea class="form-control" name="rel_descricao" rows="5"></textarea>
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
					
					<div class="col-sm-6">
					<div class="form-group">
									<select  name="agenda">
										<option value="P">Período</option>
										<option value="A">Anualmente</option>
										<option value="M">Mensalmente</option>
										<option value="S">Semanalmente</option>
									</select>
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