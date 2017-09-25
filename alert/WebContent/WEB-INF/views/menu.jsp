<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="ftm"%>
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


<title>Aletr 1.0</title>

<style>
body {
	background-image: url("img/fundo.jpg");
	background-attachment: fixed;
}
</style>

</head>
<body>

	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="/alert/Menu"> <img alt="logo"
					src="img/web_alert.png" width="90"></a>
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<form class="navbar-form navbar-right">
					<a href="/alert/listarSetor" class="btn btn-info" role="button">Setores</a>
					<a href="/alert/listarContatos" class="btn btn-info" role="button">Contatos</a>
					
					<c:if test="${usuarioLogado.NOME_CONTATO == 'admin'}">
					<a href="/alert/listarAutenticacao" class="btn btn-info"
						role="button">Remetente</a>
						</c:if>
						 <a href="/alert/sair"
						class="btn btn-info" role="button">Sair</a>
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
							<a href="/alert/solicitarRelatorio" class="btn btn-primary"
								role="button">Novo Alerta</a>
						</div>
					</div>

				</div>
			</form>
		</div>
	</div>
	<!-- fim  -->

	<br>

	<div class="container-fluid">

		<div class="container well" align="left">
			<h4>Alertas</h4>
			<hr>
			
			<table class="table table-bordered">
				<tr bgcolor="gray">
					<th>Nome Setor</th>
					<th>Nome do Relatório</th>
					<th>Titulo</th>
					<th>Assunto</th>
					<th>Data de Criação</th>
					<th>Data de Alteração</th>
					<th>Ativo</th>					
					<th>Operações</th>

				</tr>

				<c:forEach items="${Rellist}" var="r">
					<tr>

					
						<td>${r.nom_setor}</td>
						<td>${r.rel_nome}</td>
						<td>${r.rel_titulo}</td>
						<td>${r.rel_assunto}</td>
						<td><ftm:formatDate  type="both" dateStyle="short" timeStyle="short" value="${r.dat_criacao.time}" /></td>
						<td><ftm:formatDate type="both" dateStyle="short" timeStyle="short" value="${r.dat_alteracao.time}"/></td>
						<td>${r.ind_ativo }</td>
						<td>
	
						
	<c:if test="${usuarioLogado.NOME_CONTATO == 'admin'}">
		<a class="btn btn-info btn-xs" href="#" data-toggle="modal" 
		data-target="#MySql${r.cod_setor}${r.cod_relatorio}"><span
			class="glyphicon glyphicon-list-alt" aria-hidden="true"></span> SQL</a>	
	</c:if>
	
							
	<a class="btn btn-warning btn-xs" href="#" data-toggle="modal" 
		data-target="#MyExecucao${r.cod_setor}${r.cod_relatorio}"><span
								class="glyphicon glyphicon-time" aria-hidden="true"></span></a>
								
	<a class="btn btn-success btn-xs" href="#" data-toggle="modal" 
		data-target="#MyContato${r.cod_setor}${r.cod_relatorio}" ><span
								class="glyphicon glyphicon-user" aria-hidden="true"></span></a>	
	
	<a class="btn btn-danger btn-xs" href="/alert/removeRelatorio?cod_relatorio=${r.cod_relatorio}&cod_setor=${r.cod_setor}"><span
								class="glyphicon glyphicon-remove" aria-hidden="true"></span></a>
								
	<a class="btn btn-danger btn-xs" href="/alert/Status?cod_relatorio=${r.cod_relatorio}&cod_setor=${r.cod_setor}">Operando</a>			
					
			</tr>
			
			<!-- SQL -->

					<div class="modal fade" id="MySql${r.cod_setor}${r.cod_relatorio}"
						tabindex="-2" role="dialog" aria-labelledby="myModalLabel">
						<div class="modal-dialog modal-lg" role="document">
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal"
										aria-label="Close">
										<span aria-hidden="true">&times;</span>
									</button>

									<div class="row">
										<div class="col-sm-2">
											<h4 class="modal-title" id="myModalLabel">Código SQL</h4>
										</div>
										<div class="col-sm-10">
											<div class="row">
												<div class="col-sm-5">
													<h4>Exemplo Simples</h4>
													<code>
														Select coluna1, coluna2, colunaN ...<br> from
														tabela1, tabela2,tabelaN ...<br> where Condições ...
													</code>
												</div>
												<div class="col-sm-7">
													<h4>Exemplo Complexo</h4>
													<code>
														Select colunaA, colunaB, colunaN ... from(<br> Select
														nvl(coluna1,0) as colunaA, decode(coluna2,'S',1,0) as
														colunaB , lpad(colN,6,0) as colunaN<br> from tab1,
														tab2,tabN<br> where condições... )
													</code>
												</div>
											</div>
										</div>
									</div>
								</div>

								<div class="modal-body">

									<form class="form" role="form" action="alterSql" method="post">

										<div class="row">
											<div class="col-sm-12">
												<div class="form-group">
													<input type="hidden" name="cod_relatorio"
														value="${r.cod_relatorio}"> <input type="hidden"
														name="cod_setor" value="${r.cod_setor}">
												</div>
											</div>

											<div class="col-sm-12">
												<div class="form-group">
													<textarea required class="form-control" name="rel_sql"
														rows="15">${r.rel_sql}</textarea>
												</div>
											</div>
										</div>

										<div class="form-group">
											<button type="reset" class="btn btn-default">Retornar Conteudo</button>
											<button type="submit" class="btn btn-primary"
												value="Cadastrar">Cadastrar SQL</button>
										</div>
									</form>

								</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-default"
										data-dismiss="modal">Fechar</button>
								</div>
							</div>
						</div>
					</div>




					<!-- Contatos -->
			
			<div class="modal fade" id="MyContato${r.cod_setor}${r.cod_relatorio}" 
			tabindex="-2" role="dialog" aria-labelledby="myModalLabel">
					  <div class="modal-dialog modal-lg" role="document">
						<div class="modal-content">
						  <div class="modal-header">
							<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
							<h4 class="modal-title" id="myModalLabel">Relação de Destinatários</h4>
						  </div>
						  <div class="modal-body">
																		
							<form class="form" role="form" action="cadRC" method="post">

										<div class="row">
											<div class="col-sm-12">
												<div class="form-group">
													<input  type="hidden" name="COD_RELATORIO"
														value="${r.cod_relatorio}"> 
														<input type="hidden"
														name="COD_SETOR" value="${r.cod_setor}">
												</div>
											</div>

											<div class="col-sm-12">											
												<div class="form-group">
												
												<select multiple class="form-control"name="COD_CONTATO">
												
												<c:forEach items="${user}" var="cr">
												
												<option value="${cr.COD_CONTATO}"> ${cr.NOME_CONTATO}</option>
												
												</c:forEach>
												
												</select>
												
												
												</div>
												
												
											</div>
										</div>

										<div class="form-group">
											<button type="reset" class="btn btn-default">Limpar</button>
											<button type="submit" class="btn btn-primary"
												value="Cadastrar">Cadastrar Contato ao relatório</button>
										</div>
									</form>
			
							  </div>
						  <div class="modal-footer">
							<button type="button" class="btn btn-default" data-dismiss="modal">Fechar</button>
						
						  </div>
						</div>
					  </div>
					</div>	
					
				<!-- Execucao -->	
					
					<div class="modal fade" id="MyExecucao${r.cod_setor}${r.cod_relatorio}" 
							tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
					  <div class="modal-dialog modal-lg" role="document">
						<div class="modal-content">
						  <div class="modal-header">
							<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
							<h4 class="modal-title" id="myModalLabel">Regra de Execução</h4>
							${r.exc_sab}
							<c:if test="${r.exc_sab == 'S'}" >active</c:if>
						  </div>
						  <div class="modal-body">
						  
						  
						  <form class="form" role="form" action="alterHoras" method="post">

					<div class="row">
						  <div class="col-sm-12">
						    <div class="form-group">
						
						      <div class="btn-group" data-toggle="buttons">
						                
						        <label>Dias da Senama</label><br> 
						        <label class="btn btn-primary <c:if test="${r.exc_dom == 'S'}" >active</c:if>">
						        <input type="checkbox" autocomplete="off" name="exc_dom" <c:if test="${r.exc_dom == 'S'}" >checked</c:if>  value='S'>DOM
								</label>
						        <label  class="btn btn-primary <c:if test="${r.exc_seg == 'S'}" >active</c:if>">
						        <input type="checkbox"  autocomplete="off" name="exc_seg" <c:if test="${r.exc_seg == 'S'}" >checked</c:if>  value='S'>SEG
						        </label> 
						        <label class="btn btn-primary <c:if test="${r.exc_ter == 'S'}" >active</c:if>">
						        <input type="checkbox" autocomplete="off" name="exc_ter" <c:if test="${r.exc_ter == 'S'}" >checked</c:if>  value='S'>TER
						        </label> 
						        <label class="btn btn-primary <c:if test="${r.exc_qua == 'S'}" >active</c:if>">
						        <input type="checkbox" autocomplete="off" name="exc_qua" <c:if test="${r.exc_qua == 'S'}" >checked</c:if>   value='S'>QUA
						        </label>
						        <label class="btn btn-primary <c:if test="${r.exc_qui == 'S'}" >active</c:if>"> 
						        <input type="checkbox" autocomplete="off" name="exc_qui"  <c:if test="${r.exc_qui == 'S'}" >checked</c:if>  value='S'>QUI
						        </label> 
						        <label class="btn btn-primary <c:if test="${r.exc_sex == 'S'}" >active</c:if>">
						        <input type="checkbox" autocomplete="off" name="exc_sex" <c:if test="${r.exc_sex == 'S'}" >checked</c:if>  value='S'>SEX
						        </label>
						        <label class="btn btn-primary <c:if test="${r.exc_sab == 'S'}" >active</c:if>">
						        <input type="checkbox" autocomplete="off" name="exc_sab" <c:if test="${r.exc_sab == 'S'}" >checked</c:if>  value='S' >SAB
						        </label>        
							 </div>

							<BR> <BR>

							<div class="btn-group" data-toggle="buttons">
								<label>Horário Disponiveis</label><br> 
								<label	class="btn btn-primary <c:if test="${r.exc_hr_00 == 'S'}" >active</c:if>">
								<input type="checkbox"	autocomplete="off" name="exc_hr_00" <c:if test="${r.exc_hr_00 == 'S'}" >checked</c:if>  value='S'>00
								</label> 
								<label class="btn btn-primary <c:if test="${r.exc_hr_01 == 'S'}" >active</c:if>">
								<input type="checkbox" autocomplete="off" name="exc_hr_01" <c:if test="${r.exc_hr_01 == 'S'}" >checked</c:if> value='S'>01
								</label> 
								<label class="btn btn-primary <c:if test="${r.exc_hr_02 == 'S'}" >active</c:if>">
								<input type="checkbox" autocomplete="off" name="exc_hr_02" <c:if test="${r.exc_hr_02 == 'S'}" >checked</c:if>  value='S'>02
								</label>
								<label class="btn btn-primary <c:if test="${r.exc_hr_03 == 'S'}" >active</c:if>">
								<input type="checkbox" autocomplete="off" name="exc_hr_03" <c:if test="${r.exc_hr_03 == 'S'}" >checked</c:if>  value='S'>03
								</label>
								<label class="btn btn-primary <c:if test="${r.exc_hr_04 == 'S'}" >active</c:if>"> <input type="checkbox"
									autocomplete="off" name="exc_hr_04"  <c:if test="${r.exc_hr_04 == 'S'}" >checked</c:if> value='S'>04
								</label> 
								<label class="btn btn-primary <c:if test="${r.exc_hr_05 == 'S'}" >active</c:if>"> <input type="checkbox"
									autocomplete="off" name="exc_hr_05"  <c:if test="${r.exc_hr_05 == 'S'}" >checked</c:if> value='S'>05
								</label>
								 <label class="btn btn-primary <c:if test="${r.exc_hr_06 == 'S'}" >active</c:if>"> <input type="checkbox"
									autocomplete="off" name="exc_hr_06" <c:if test="${r.exc_hr_06 == 'S'}" >checked</c:if>  value='S'>06
								</label> 
								<label class="btn btn-primary <c:if test="${r.exc_hr_07 == 'S'}" >active</c:if>"> <input type="checkbox"
									autocomplete="off" name="exc_hr_07" <c:if test="${r.exc_hr_07 == 'S'}" >checked</c:if>  value='S'>07
								</label>
								 <label class="btn btn-primary <c:if test="${r.exc_hr_08 == 'S'}" >active</c:if>"> <input type="checkbox"
									autocomplete="off" name="exc_hr_08" <c:if test="${r.exc_hr_08 == 'S'}" >checked</c:if>  value='S'>08
								</label> 
								<label class="btn btn-primary <c:if test="${r.exc_hr_09 == 'S'}" >active</c:if>"> <input type="checkbox"
									autocomplete="off" name="exc_hr_09" <c:if test="${r.exc_hr_09 == 'S'}" >checked</c:if>  value='S'>09
								</label> 
								<label class="btn btn-primary <c:if test="${r.exc_hr_10 == 'S'}" >active</c:if>"> <input type="checkbox"
									autocomplete="off" name="exc_hr_10" <c:if test="${r.exc_hr_10 == 'S'}" >checked</c:if>  value='S'>10
								</label> 
								<label class="btn btn-primary <c:if test="${r.exc_hr_11 == 'S'}" >active</c:if>"> <input type="checkbox"
									autocomplete="off" name="exc_hr_11" <c:if test="${r.exc_hr_11 == 'S'}" >checked</c:if>  value='S'>11
								</label>
								 <label class="btn btn-primary <c:if test="${r.exc_hr_12 == 'S'}" >active</c:if>"> <input type="checkbox"
									autocomplete="off" name="exc_hr_12" <c:if test="${r.exc_hr_12 == 'S'}" >checked</c:if>  value='S'>12
								</label>
								 <label class="btn btn-primary <c:if test="${r.exc_hr_13 == 'S'}" >active</c:if>"> <input type="checkbox"
									autocomplete="off" name="exc_hr_13" <c:if test="${r.exc_hr_13 == 'S'}" >checked</c:if>  value='S'>13
								</label>
								 <label class="btn btn-primary <c:if test="${r.exc_hr_14 == 'S'}" >active</c:if>"> <input type="checkbox"
									autocomplete="off" name="exc_hr_14"<c:if test="${r.exc_hr_14 == 'S'}" >checked</c:if>  value='S'>14
								</label> 
								<label class="btn btn-primary <c:if test="${r.exc_hr_15 == 'S'}" >active</c:if>"> <input type="checkbox"
									autocomplete="off" name="exc_hr_15"<c:if test="${r.exc_hr_15 == 'S'}" >checked</c:if>  value='S'>15
								</label> 
								<label class="btn btn-primary <c:if test="${r.exc_hr_16 == 'S'}" >active</c:if>"> <input type="checkbox"
									autocomplete="off" name="exc_hr_16" <c:if test="${r.exc_hr_16 == 'S'}" >checked</c:if>  value='S'>16
								</label>
								 <label class="btn btn-primary <c:if test="${r.exc_hr_17 == 'S'}" >active</c:if>"> <input type="checkbox"
									autocomplete="off" name="exc_hr_17" <c:if test="${r.exc_hr_17 == 'S'}" >checked</c:if>  value='S'>17
								</label> 
								<label class="btn btn-primary <c:if test="${r.exc_hr_18 == 'S'}" >active</c:if>"> <input type="checkbox"
									autocomplete="off" name="exc_hr_18" <c:if test="${r.exc_hr_18 == 'S'}" >checked</c:if>  value='S'>18
								</label> 
								<label class="btn btn-primary <c:if test="${r.exc_hr_19 == 'S'}" >active</c:if>"> <input type="checkbox"
									autocomplete="off" name="exc_hr_19" <c:if test="${r.exc_hr_19 == 'S'}" >checked</c:if>  value='S'>19
								</label> 
								<label class="btn btn-primary <c:if test="${r.exc_hr_20 == 'S'}" >active</c:if>"> <input type="checkbox"
									autocomplete="off" name="exc_hr_20" <c:if test="${r.exc_hr_20 == 'S'}" >checked</c:if>  value='S'>20
								</label>
								 <label class="btn btn-primary <c:if test="${r.exc_hr_21 == 'S'}" >active</c:if>"> <input type="checkbox"
									autocomplete="off" name="exc_hr_21" <c:if test="${r.exc_hr_21 == 'S'}" >checked</c:if>  value='S'>21
								</label>
								 <label class="btn btn-primary <c:if test="${r.exc_hr_22 == 'S'}" >active</c:if>"> <input type="checkbox"
									autocomplete="off" name="exc_hr_22"  <c:if test="${r.exc_hr_22 == 'S'}" >checked</c:if> value='S'>22
								</label> 
								<label class="btn btn-primary <c:if test="${r.exc_hr_23 == 'S'}" >active</c:if>"> <input type="checkbox"
									autocomplete="off" name="exc_hr_23" <c:if test="${r.exc_hr_23 == 'S'}" >checked</c:if>  value='S'>23
								</label>
								<input type="hidden" name="cod_setor" value="${r.cod_setor}">
								<input type="hidden" name="cod_relatorio" value="${r.cod_relatorio}">
							</div>



						</div>

						<div class="form-group">
							<button type="reset" class="btn btn-default">Limpar</button>
							<button type="submit" class="btn btn-primary" value="Cadastrar">Alterar Agenda</button>
						</div>
					</div>
				</div>
			</form>
							
							
							
							
							
						  </div>
						  <div class="modal-footer">
							<button type="button" class="btn btn-default" data-dismiss="modal">Fechar</button>
							
						  </div>
						</div>
					  </div>
					</div>	
			
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