<%@ include file="topo.jsp"%>
<%@ include file="menu.jsp"%>
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
							<div class="cont">
								<div class="col-4">
									<form id="ContactForm" action="">
										<div class="indent">
											<div class="p1">
												<span class="text">feedback</span>
											</div>
											<label><span class="input"><input type="text"
													value="name" onblur="if(this.value=='') this.value='name'"
													onfocus="if(this.value =='name' ) this.value=''" />
											</span>
											</label> <label><span class="input"><input type="text"
													value="e-mail"
													onblur="if(this.value=='') this.value='e-mail'"
													onfocus="if(this.value =='e-mail' ) this.value=''" />
											</span>
											</label>
											<div class="area">
												<textarea cols="" rows=""
													onblur="if(this.value=='') this.value='message'"
													onfocus="if(this.value =='message' ) this.value=''">message</textarea>
											</div>
											<div class="alignright">
												<a href="#" class="link"
													onclick="document.getElementById('ContactForm').reset()"><span><span>Clear</span>
												</span>
												</a> <a href="#" class="link"
													onclick="document.getElementById('ContactForm').submit()"><span><span>Send</span>
												</span>
												</a>
											</div>
										</div>
									</form>
								</div>
								<div class="col-5">
									<h2>Our Locations</h2>
									<p class="black">
										<strong>Argentina</strong>
									</p>
									Lorem ipsum dolor sit amet, consectetuer adipiscing elit.
									Praesent vestibulum molestie lacus. Aenean nonummy hendrerit
									mauris. Phasellus porta. Fusce suscipit varius mi. Cum sociis
									natoque penatibus et magnis dis parturient montes, nascetur
									ridiculus mus. Nulla dui. Fusce feugiat malesuada odio.
									<p class="black">
										<strong>Denmark</strong>
									</p>
									Morbi nunc odio, gravida at, cursus nec, luctus a, lorem.
									Maecenas tristique orci ac sem. Duis ultricies pharetra magna.
									Donec accumsan malesuada orci. Donec sit amet eros. Lorem ipsum
									dolor sit amet, consectetuer adipiscing elit. Mauris fermentum
									dictum magna.
									<p class="black">
										<strong>Finland</strong>
									</p>
									Quisque nulla. Vestibulum libero nisl, porta vel, scelerisque
									eget, malesuada at, neque. Vivamus eget nibh. Etiam cursus leo
									vel metus. Nulla facilisi. Aenean nec eros. Vestibulum ante
									ipsum primis in faucibus orci luctus et ultrices posuere
									cubilia Curae; Suspendisse sollicitudin velit sed leo.
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
</div>
<%@ include file="bottom.jsp"%>
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