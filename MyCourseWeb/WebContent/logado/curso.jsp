<%@ include file="topo.jsp"%>
<%@ include file="menu.jsp"%>
<script type="text/javascript">
function deletar(){
	
}
function alterar(){
	
}
</script>
<div id="content">
	<div class="main-bg-tail-2">
		<div class="main">
			<div class="main-box-top-left">
				<div class="main-box-top-right">
					<div class="main-box-top-tail1"></div>
				</div>
			</div>
			<div class="main-box-left">
				<div class="main-box-right">
					<div class="main-box">
						<div class="indent1">
							<div id="formulario">
								<form id="form-curso" action="">
									<table id="listagem" cellpadding="10">
										<tr>
											<th>ID</th>
											<th>Nome</th>
											<th>Descrição</th>
											<th>Alterar</th>
											<th>Excluir</th>
										</tr>
										<tr>
											<td>1</td>
											<td>Teste</td>
											<td>Descrição Descrição Descrição DescriçãoDescrição Descrição Descrição DescriçãoDescrição Descrição Descrição Descrição</td>
											<td><img src="images/alter.png" onclick="alterar(1);"/></td>
											<td><img src="images/trash.gif" onclick="deletar(1);"/></td>
										</tr>
										<tr>
											<td>1</td>
											<td>Teste</td>
											<td>Descrição Descrição Descrição DescriçãoDescrição Descrição Descrição DescriçãoDescrição Descrição Descrição Descrição</td>
											<td><img src="images/alter.png" onclick="alterar(2);"/></td>
											<td><img src="images/trash.gif" onclick="deletar(2);"/></td>
										</tr>
										<tr>
											<td>1</td>
											<td>Teste</td>
											<td>Descrição Descrição Descrição Descrição</td>
											<td><img src="images/alter.png" onclick="alterar(3);"/></td>
											<td><img src="images/trash.gif" onclick="deletar(3);"/></td>
										</tr>
										<tr>
											<td>1</td>
											<td>Teste</td>
											<td>Descrição Descrição Descrição Descrição</td>
											<td><img src="images/alter.png"/></td>
											<td><img src="images/trash.gif"/></td>
										</tr>
									</table>
								</form>

							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="main-box-bottom-left">
				<div class="main-box-bottom-right">
					<div class="main-box-bottom"></div>
				</div>
			</div>
		</div>
	</div>
</div>

<%@ include file="bottom.jsp"%>
</body>
</html>