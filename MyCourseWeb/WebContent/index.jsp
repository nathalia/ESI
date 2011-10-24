<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="style.css" rel="stylesheet" type="text/css" />
<link href="layout.css" rel="stylesheet" type="text/css" />
 <script type="text/javascript" src="js/jquery-1.4.2.js" ></script>
<script type="text/javascript" src="js/imagepreloader.js"></script>
<script type="text/javascript" src="js/jquery.DOMWINDOW.js"></script>
<script type="text/javascript">
	preloadImages([
		'images/link-left-bg-hover.png', 
		'images/link-right-bg-hover.png', 
		'images/link-tail-bg-hover.png', 
		'images/link-1-hover.jpg',]);
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
						<div id="loginWindow" style=" display:none;">
							<a href="#" class="closeDOMWindow" style="float: right; margin-top: -8px;">
								<img src="images/close.gif" />									
							</a>
							<form id="form-login">
								<div class="item-form">
									<label>Usuário</label>
									<span class="input">
										<input name="usuario" />
									</span>
								</div>
								<div class="item-form">
									<label>Senha</label>
									<span class="input">
										<input name="senha" />
									</span>
								</div>
								<div class="item-form" style="margin-top:5px; margin-right: 20px;">
									<a href="#" class="right">
										<img src="images/button-form-1.jpg" alt="">
									</a>
								</div>
							</form>
						</div>
						<script type="text/javascript"> 
						$('.loginWindow').click(function(){ 
						    $.openDOMWindow({ 
						        windowSourceID:'#loginWindow', 
						        height:140,  
						        width:240, 
						        overlay:0, 
						        positionType:'anchoredSingleWindow',  
						        windowPadding:20,  
						        //windowBGColor:'#ccc',
						        windowBGImage: 'images/form-2-bg.jpg',
						        borderSize:'0', 
						        anchoredSelector:'.loginWindow', 
						        positionLeft:0, 
						        positionTop:18 
						    }); 
						    return false; 
						});
						</script>
					</div>
					<div class="wrapper">
						<div class="logo">
							<a href="index.html"><img src="images/logo.jpg" alt="" />
							</a>
						</div>
						<!-- se estiver logado -->
						<div class="exils">
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
						</div>
					</div>
				</div>
				<div class="menu-bg">
					<div class="main">
						<div class="wrapper">
							<div class="menu">
								<ul>
									<li><a href="index.html" class="active"><span><span>Main</span>
										</span>
									</a>
									</li>
									<li><a href="index-1.html"><span><span>About
													Us</span>
										</span>
									</a>
									</li>
									<li><a href="index-2.html"><span><span>Partners</span>
										</span>
									</a>
									</li>
									<li><a href="index-3.html"><span><span>Clients</span>
										</span>
									</a>
									</li>
									<li><a href="index-4.html"><span><span>Support</span>
										</span>
									</a>
									</li>
									<li class="last"><a href="index-5.html"><span><span>Contacts</span>
										</span>
									</a>
									</li>
								</ul>
							</div>
							<form id="form-1" action="">
								<div>
									<label class="left"><span class="input"><input
											name="name" value="Searching..."
											onblur="if(this.value=='') this.value='Searching...'"
											onfocus="if(this.value =='Searching...' ) this.value=''" />
									</span>
									</label> <a class="left" href="#"
										onclick="document.getElementById('form-1').submit()"><img
										src="images/button-form-top.gif" alt="" />
									</a>
								</div>
							</form>
						</div>
					</div>
					<div class="main-bg-tail-1">
						<div class="main">
							<div class="wrapper">
								<div class="slider">
									<div id="slider_box"></div>
									<div id="slider">
										<img src="images/img1.jpg" alt=""
											title="&lt;div class='indent_1'&gt;&lt;span class='text1'&gt;business&lt;/span&gt;&lt;span class='text2'&gt;Planning&lt;/span&gt;&lt;/div&gt;" />
										<img src="images/img2.jpg" alt=""
											title="&lt;div class='indent_1'&gt;&lt;span class='text1'&gt;marketing&lt;/span&gt;&lt;span class='text2'&gt;research&lt;/span&gt;&lt;/div&gt;" />
										<img src="images/img3.jpg" alt=""
											title="&lt;div class='indent_1'&gt;&lt;span class='text1'&gt;providing&lt;/span&gt;&lt;span class='text2'&gt;solutions&lt;/span&gt;&lt;/div&gt;" />
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!--header end-->
			<div id="content">
				<div class="main">
					<div class="main-box-top-left">
						<div class="main-box-top-right">
							<div class="main-box-top-tail"></div>
						</div>
					</div>
					<div class="main-box-left">
						<div class="main-box-right">
							<div class="main-box">
								&nbsp;
								<div class="boxes">
									<div class="wrapper">
										<div class="col-3 margin-right">
											<div class="box-bg-top">
												<div class="box-bg-bottom">
													<div class="icons">
														<img src="images/icon_1.jpg" alt="" />
													</div>
													<h5>
														<strong>customers</strong> support
													</h5>
													<ul class="box-list">
														<li><a href="#">Praesent vestibulum mole </a>
														</li>
														<li><a href="#">Rcusenean nonummy hendr</a>
														</li>
														<li><a href="#">Uasellus portausce susc</a>
														</li>
														<li><a href="#">Cum sociis natoque penatib</a>
														</li>
													</ul>
													<div class="aligncenter">
														<a href="#" class="link"><span><span>Read
																	More</span>
														</span>
														</a>
													</div>
												</div>
											</div>
										</div>
										<div class="col-3 margin-right">
											<div class="box-bg-top">
												<div class="box-bg-bottom">
													<div class="icons">
														<img src="images/icon_2.jpg" alt="" />
													</div>
													<h5>
														<strong>our creative</strong> ideas
													</h5>
													<ul class="box-list">
														<li><a href="#">Sed ut perspiciatis unde om</a>
														</li>
														<li><a href="#">Ois iste natus error sit </a>
														</li>
														<li><a href="#">Woluptatem accusantium </a>
														</li>
														<li><a href="#">Uoloremque laudantium</a>
														</li>
													</ul>
													<div class="aligncenter">
														<a href="#" class="link"><span><span>Read
																	More</span>
														</span>
														</a>
													</div>
												</div>
											</div>
										</div>
										<div class="col-3 margin-right">
											<div class="box-bg-top">
												<div class="box-bg-bottom">
													<div class="icons">
														<img src="images/icon_3.jpg" alt="" />
													</div>
													<h5>
														<strong>complete new</strong> service
													</h5>
													<ul class="box-list">
														<li><a href="#">Perspiciatis unde omnis iste </a>
														</li>
														<li><a href="#">Atus error sit voluptatem </a>
														</li>
														<li><a href="#">Iccusantium doloremque </a>
														</li>
														<li><a href="#">Laudantium, totam rem at</a>
														</li>
													</ul>
													<div class="aligncenter">
														<a href="#" class="link"><span><span>Read
																	More</span>
														</span>
														</a>
													</div>
												</div>
											</div>

										</div>
										<div class="col-3">
											<div class="box-bg-top">
												<div class="box-bg-bottom">
													<div class="icons">
														<img src="images/icon_4.jpg" alt="" />
													</div>
													<h5>
														<strong>professional</strong> research
													</h5>
													<ul class="box-list">
														<li><a href="#">Vestibulum iaculis lacinia </a>
														</li>
														<li><a href="#">Estroin dictum elemen</a>
														</li>
														<li><a href="#">Tum velitusce euismod con</a>
														</li>
														<li><a href="#">Lorem ipsum dolor sit ame</a>
														</li>
													</ul>
													<div class="aligncenter">
														<a href="#" class="link"><span><span>Read
																	More</span>
														</span>
														</a>
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
								<div class="indent1">
									<div class="cont">
										<div class="col-4 col-indent">
											<h2>Did you Know?</h2>
											<ul class="list">
												<li><a href="#">Quisque nullaestibulum libero </a>
												</li>
												<li><a href="#">Jisl, porta vel, scelerisque</a>
												</li>
												<li><a href="#">Wet, malesuada at, neq</a>
												</li>
												<li><a href="#">Vivamus eget nibhtiam cursus </a>
												</li>
												<li><a href="#">leo vel metus Nulla facilisi</a>
												</li>
												<li><a href="#">Mean nec erosVestibulum ante </a>
												</li>
												<li><a href="#">Upsum primis in faucibus orci </a>
												</li>
												<li><a href="#">luctus et ultrices posuere </a>
												</li>
											</ul>
											<form id="form-2" action="">
												<div class="indent">
													<span class="text">newsletter!</span>
													<div>
														<label><span class="input"><input
																name="name" value="" />
														</span>
														</label>
													</div>
													<div class="wrapper">
														<a href="#" class="right"
															onclick="document.getElementById('form-2').submit()"><img
															src="images/button-form-1.jpg" alt="" />
														</a> <a href="#" class="Unsubscribe"
															onclick="document.getElementById('form-2').reset()">Unsubscribe</a>
													</div>
												</div>
											</form>
										</div>
										<div class="col-5">
											<h2 class="bot3">Alternative Financing Sources</h2>
											<div class="wrapper border">
												<a href="#"><img src="images/page1-img.jpg" alt=""
													class="imgindent" />
												</a> <strong class="black">Dis parturient montes,
													nascetur ridiculus mus. usce fe ugiat malesuada odio. Morbi
													nunc odio, gravida at.</strong>
												<p>
													Malesuada orci. Donec sit lorem ipsum dolor sit amet,
													consectetuer Sed ut perspiciatis unde omnis iste natus
													error sit luptatem acc usantium <a href="#" class="color">doloremque
														laudantium</a> totam, rem aperiam, ea que ipsa quae ab illo
													inventore veritatis et quasi architecto beatae sunt
													explicabo. Nemo enim ipsam...
												</p>
												<div class="alignright">
													<a href="#" class="link-1">Read More</a>
												</div>
											</div>
											<h2>Research a Business Opportunity</h2>
											<div class="wrapper">
												<div class="col-1 col-indent">
													<ul class="list-1">
														<li><a href="#"><strong>The Most
																	Creative Ideas</strong>
														</a><br /> iraesent vestibulum molestie lacus. Aene an
															nonummy hendrerit mauris ha</li>
														<li><a href="#"><strong>Program
																	Management</strong>
														</a><br /> wenean nonummy hendrerit mauris hasellus porta.
															Fusce suscipit varius mi</li>
													</ul>
												</div>
												<div class="col-2">
													<ul class="list-1">
														<li><a href="#"><strong>Providing Best
																	Solutions</strong>
														</a><br /> uisque nulla. Vestibulum libero nisl, porta vel,
															scelerisque eget, malesuada at, neq</li>
														<li><a href="#"><strong>Professional
																	Researches</strong>
														</a><br /> estibulum libero nisl, porta vel, scelerisque
															wget, malesuada at, nequeivamus</li>
													</ul>
												</div>
											</div>
										</div>
										<div class="clear"></div>
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
			<!--footer -->
			<div id="footer">
				<div class="extra">
					<div class="bottom">
						<div class="main">
							<div class="indent">
								<div class="wrapper p1">
									<div class="col-1">
										<strong class="white">About Us</strong>
										<ul class="footer-list">
											<li><a href="#">Company Info</a>
											</li>
											<li><a href="#">Services</a>
											</li>
											<li><a href="#">Clients</a>
											</li>
											<li><a href="#">Solutions</a>
											</li>
										</ul>
									</div>
									<div class="col-1">
										<strong class="white">Advice</strong>
										<ul class="footer-list">
											<li><a href="#">FAQs</a>
											</li>
											<li><a href="#">Solutions</a>
											</li>
											<li><a href="#">Contacts</a>
											</li>
										</ul>
									</div>
									<div class="col-2">
										<strong class="white">Join In</strong>
										<ul class="footer-list">
											<li><a href="#">Sign up</a>
											</li>
											<li><a href="#">Forums</a>
											</li>
											<li><a href="#">Promotions</a>
											</li>
										</ul>
									</div>
									<div class="col-3">
										<div class="wrapper">
											<span class="left"><strong class="white">Find
													us on:</strong>
											</span>
											<div class="social">
												<a href="#"><img src="images/facebook.gif" alt="" />
												</a><a href="#"><img src="images/flickr.gif" alt="" />
												</a><a href="#"><img src="images/twitter.gif" alt="" />
												</a><a href="#"><img src="images/rss.gif" alt="" />
												</a>
											</div>
										</div>
									</div>
									<div class="left">
										<div class="policy">
											<strong>Progress</strong> &copy; 2011 &nbsp;|&nbsp; <a
												href="index-6.html">Privacy Policy</a><br /> <a
												href="http://www.templatemonster.com/"
												title="Website template" target="_blank">Best Website
												Templates</a> Design from TemplateMonster.
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!--footer end-->
		</div>
	</div>
	<script type="text/javascript">
		$(window).load(function() {
			$('#slider').nivoSlider({
				effect : 'fold', //Specify sets like: 'fold,fade,sliceDown, sliceDownLeft, sliceUp, sliceUpLeft, sliceUpDown, sliceUpDownLeft' 
				slices : 13,
				animSpeed : 500,
				pauseTime : 6000,
				startSlide : 0, //Set starting Slide (0 index)
				directionNav : false, //Next / Prev
				directionNavHide : false, //Only show on hover
				controlNav : true, //1,2,3...
				controlNavThumbs : false, //Use thumbnails for Control Nav
				controlNavThumbsFromRel : false, //Use image rel for thumbs
				controlNavThumbsSearch : '.jpg', //Replace this with...
				controlNavThumbsReplace : '_thumb.jpg', //...this in thumb Image src
				keyboardNav : true, //Use left / right arrows
				pauseOnHover : true, //Stop animation while hovering
				manualAdvance : false, //Force manual transitions
				captionOpacity : 1, //Universal caption opacity
				beforeChange : function() {
				},
				afterChange : function() {
				},
				slideshowEnd : function() {
				} //Triggers after all slides have been shown
			});
		});
	</script>
</body>
</html>