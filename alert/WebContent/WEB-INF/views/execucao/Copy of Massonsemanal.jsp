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
			<form class="form" role="form" action="" method="post">


				<div id="regrasemanalmente">
					<div class="row">
						<div class="col-sm-12">
							<div class="form-group">
								<label>Semanalmente</label><br> <br>
								<div class="row">
									<div class="col-sm-6">
										<label>Dia da Semana</label><br> <br>
										<table class="table">
											<tr>
												<th class="text-center">Domingo</th>
												<th class="text-center">Segunda</th>
												<th class="text-center">Terça</th>
												<th class="text-center">Quarta</th>
												<th class="text-center">Quinta</th>
												<th class="text-center">Sexta</th>
												<th class="text-center">Sábado</th>
											</tr>
											<tr>
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