<%@ include file="topo.jsp" %>
<script type="text/javascript">
  $(function() {
    var $h2;
    var $answer;
    $('.answer').hide();
    $('#faq h2').bind(
        'click',
        function()
        {
            if ($h2 && $h2[0] != this) {
                $answer.slideUp();
                $h2.removeClass('open');
            }
            $h2 = $(this);
            $answer = $h2.next();
            $answer.slideDown();
            $h2.addClass('open');
        }
    )
 });
</script>
<%@ include file="menu.jsp" %>
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
							<div id="faq">
								<ul id="faqs">
									<li>
										<h2>Pergunta 1?</h2>
										<div class="answer">
											<p>Lorem Ipsum é simplesmente uma simulação de texto da indústria tipográfica e de impressos, e vem sendo utilizado desde o século XVI, quando um impressor desconhecido pegou uma bandeja de tipos e os embaralhou para fazer um livro de modelos de tipos. Lorem Ipsum sobreviveu não só a cinco séculos, como também ao salto para a editoração eletrônica, permanecendo essencialmente inalterado. Se popularizou na década de 60, quando a Letraset lançou decalques contendo passagens de Lorem Ipsum, e mais recentemente quando passou a ser integrado a softwares de editoração eletrônica como Aldus PageMaker.</p>
										</div></li>
									<li>
										<h2>Pergunta 2?</h2>
										<div class="answer">
											<p>Lorem Ipsum é simplesmente uma simulação de texto da indústria tipográfica e de impressos, e vem sendo utilizado desde o século XVI, quando um impressor desconhecido pegou uma bandeja de tipos e os embaralhou para fazer um livro de modelos de tipos. Lorem Ipsum sobreviveu não só a cinco séculos, como também ao salto para a editoração eletrônica, permanecendo essencialmente inalterado. Se popularizou na década de 60, quando a Letraset lançou decalques contendo passagens de Lorem Ipsum, e mais recentemente quando passou a ser integrado a softwares de editoração eletrônica como Aldus PageMaker.</p>
										</div></li>
								</ul>
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

<%@ include file="bottom.jsp" %>
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