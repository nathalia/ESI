<%@page import="main.br.usp.esi.service.UsuarioService"%>
<%@page import="main.br.usp.esi.service.impl.UsuarioServiceImpl"%>
<%@page import="main.br.usp.esi.service.UsuarioService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<f:view>
	<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="style.css" rel="stylesheet" type="text/css" />
<link href="faq.css" rel="stylesheet" type="text/css" />
<link href="layout.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery-1.4.2.js"></script>
<script type="text/javascript" src="js/imagepreloader.js"></script>
<script type="text/javascript" src="js/jquery.DOMWINDOW.js"></script>
<script type="text/javascript">
	preloadImages([ 'images/link-left-bg-hover.png',
			'images/link-right-bg-hover.png', 'images/link-tail-bg-hover.png',
			'images/link-1-hover.jpg', ]);
</script>
<script type="text/javascript" src="js/jquery.nivo.slider.pack.js"></script>
<script type="text/javascript" src="js/jquery.easing.1.2.js"></script>
<script type="text/javascript" src="js/script.js"></script>
</head>
<!--[if lt IE 7]>
	<link href="ie_style.css" rel="stylesheet" type="text/css" />
   <script type="text/javascript" src="js/ie_png.js"></script>
   <script type="text/javascript">
       ie_png.fix('.png, .main-box-left, .main-box-right, .main-box-top-tail, .main-box-top-right, .main-box-top-left, .main-box-bottom, .main-box-bottom-right, .main-box-bottom-left, .link, .policy strong');
   </script>
<![endif]-->
<%
	String mensagem = "";
	String usuario = request.getParameter("usuario");
	//UsuarioService usuarioService = new UsuarioServiceImpl();
	String senha = request.getParameter("senha");
	if (usuario != null && senha != null) {
		if (usuario.isEmpty() || senha.isEmpty()) {
			mensagem = "Preencha os campos corretamente.";
		} else {
			if (usuario.equals("admin") && senha.equals("admin")) {//usuarioService.autenticarUsuario(usuario, senha)){
				response.sendRedirect("logado/index.jsp");
			} else {
				mensagem = "Login incorreto. " + usuario + " " + senha;
			}
		}
	}
%>
<body id="page1">
	<div class="bg-top-centre">
		<div class="bg-top">
			<!--header -->
			<div id="header">
				<div class="main">
					<div class="wrapper">
						<div class="data">Monday, April 05, 2000 12:00</div>
						<div class="help">
							<a href="#loginWindow" class="loginWindow">Login</a>
						</div>
						<div class="erro">
							<%
								out.print(mensagem);
							%>
						</div>
						<div id="loginWindow" style="display: none;">
							<a href="#" class="closeDOMWindow"
								style="float: right; margin-top: -8px;"> <img
								src="images/close.gif" /> </a>
							<form id="form-login" method="post" name="form-login"
								action="index.jsp">

								<div class="item-form">
									<label>Usuário</label> <span class="input"> <input
										type="text" name="usuario" id="usuario" />
										 </span>
								</div>
								<div class="item-form">
									<label>Senha</label> <span class="input"> <input
										type="password" name="senha" id="senha" /> </span>
								</div>
								<div class="item-form"
									style="margin-top: 5px; margin-right: 5px;">
									<!-- <a href="#" class="right">
										<img src="images/button-form-1.jpg" alt="">
									</a> -->
									<input type="submit" value="Enviar" />
								</div>
							</form>
						</div>
						<script type="text/javascript">
							$('.loginWindow').click(function() {
								$.openDOMWindow({
									windowSourceID : '#loginWindow',
									height : 138,
									width : 230,
									overlay : 0,
									positionType : 'anchoredSingleWindow',
									windowPadding : 20,
									overlay : 0,
									overlayColor : null,
									windowBGColor : null,
									windowBGImage : 'images/form-login-bg.png',
									overlayOpacity : '0',
									borderSize : '0',
									anchoredSelector : '.loginWindow',
									positionLeft : 0,
									positionTop : 18
								});
								return false;
							});
						</script>
					</div>
					<div class="wrapper">
						<div class="logo">
							<a href="index.html"><img src="images/logo.jpg" alt="" /> </a>
						</div>
						<!-- se estiver logado -->
						<!-- <div class="exils">
							<ul>
								<li><a href="index.html" class="first"><img
										src="images/icon1.gif" alt="" />
								</a>
								</li>
								<li><a href="#"><img src="images/icon2.gif" alt="" />
								</a>
								</li>
								<li><a href="index-5.html"><img src="images/icon3.gif"
										alt="" />
								</a>
								</li>
							</ul>
						</div> -->
					</div>
				
	</div>
</body>
	</html>
</f:view>