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
								<option value="${usuarioLogado.COD_CONTATO}">${usuarioLogado.NOME_CONTATO}</option>
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
						Relatório</button>
					<a href="/alert/Menu" class="btn btn-info" role="button">Voltar</a>

				</div>
			</form>
		</div>
	</div>


	<div class="container-fluid">
		<div class="container well" align="left">
			<form class="form" role="form" action="" method="post">
			<div id="regraanualmente">
					<div class="row">
						<div id="divperiodo" class="col-sm-12">
							<div class="form-group">
								<label>Anualmente</label><br> <br>
								<div class="row">
									<div class="col-sm-12">
										<label>Meses</label><br> <br>
										<table class="table">
											<tr>
												<th class="text-center">Janeiro</th>
												<th class="text-center">Fevereiro</th>
												<th class="text-center">Março</th>
												<th class="text-center">Abril</th>
												<th class="text-center">Maio</th>
												<th class="text-center">Junho</th>
												<th class="text-center">Julho</th>
												<th class="text-center">Agosto</th>
												<th class="text-center">Setembro</th>
												<th class="text-center">Outubro</th>
												<th class="text-center">Novembro</th>
												<th class="text-center">Dezembro</th>
											</tr>
											<tr>
												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center"><input type="checkbox"></td>


											</tr>
										</table>



									</div>
								</div>
							</div>
						</div>
					</div>

					<div class="row">
						<div class="col-sm-12">
							<div class="form-group">

								<div class="row">
									<div class="col-sm-6">
										<label>Dia</label><br> <br>
										<table class="table">
											<tr>
												<th class="text-center">01</th>
												<th class="text-center">02</th>
												<th class="text-center">03</th>
												<th class="text-center">04</th>
												<th class="text-center">05</th>
												<th class="text-center">06</th>
												<th class="text-center">07</th>
												<th class="text-center">08</th>
											</tr>
											<tr>
												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center"><input type="checkbox"></td>

											</tr>
										</table>

										<table class="table">
											<tr>
												<th class="text-center">09</th>
												<th class="text-center">10</th>
												<th class="text-center">11</th>
												<th class="text-center">12</th>
												<th class="text-center">13</th>
												<th class="text-center">14</th>
												<th class="text-center">15</th>
												<th class="text-center">16</th>
											</tr>
											<tr>
												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center"><input type="checkbox"></td>

											</tr>
										</table>

										<table class="table">
											<tr>
												<th class="text-center">17</th>
												<th class="text-center">18</th>
												<th class="text-center">19</th>
												<th class="text-center">20</th>
												<th class="text-center">21</th>
												<th class="text-center">22</th>
												<th class="text-center">23</th>
												<th class="text-center">24</th>
											</tr>
											<tr>
												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center"><input type="checkbox"></td>

											</tr>
										</table>

										<table class="table">
											<tr>
												<th class="text-center">25</th>
												<th class="text-center">26</th>
												<th class="text-center">27</th>
												<th class="text-center">28</th>
												<th class="text-center">29</th>
												<th class="text-center">30</th>
												<th class="text-center">31</th>
												<th class="text-center">&nbsp;</th>
											</tr>
											<tr>
												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center">&nbsp;</td>

											</tr>
										</table>






									</div>

									<div class="col-sm-6">
										<label>Horário</label><br> <br>
										<table class="table">
											<tr>
												<th class="text-center">00</th>
												<th class="text-center">01</th>
												<th class="text-center">02</th>
												<th class="text-center">03</th>
												<th class="text-center">04</th>
												<th class="text-center">05</th>
												<th class="text-center">06</th>
												<th class="text-center">07</th>
											</tr>
											<tr>
												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center"><input type="checkbox"></td>
											</tr>
										</table>

										<table class="table">
											<tr>
												<th class="text-center">08</th>
												<th class="text-center">09</th>
												<th class="text-center">10</th>
												<th class="text-center">11</th>
												<th class="text-center">12</th>
												<th class="text-center">13</th>
												<th class="text-center">14</th>
												<th class="text-center">15</th>
											</tr>
											<tr>
												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center"><input type="checkbox"></td>
											</tr>
										</table>

										<table class="table">
											<tr>
												<th class="text-center">16</th>
												<th class="text-center">17</th>
												<th class="text-center">18</th>
												<th class="text-center">19</th>
												<th class="text-center">20</th>
												<th class="text-center">21</th>
												<th class="text-center">22</th>
												<th class="text-center">23</th>
											</tr>
											<tr>

												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center"><input type="checkbox"></td>
												<td class="text-center"><input type="checkbox"></td>

											</tr>
										</table>
									</div>
								</div>
							</div>
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