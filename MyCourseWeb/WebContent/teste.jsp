<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="style.css" rel="stylesheet" type="text/css" />
<link href="layout.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.2.6/jquery.min.js"></script>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.5.2/jquery-ui.min.js"></script>
<script type="text/javascript" src="js/imagepreloader.js"></script>
<script type="text/javascript" src="js/jquery.DOMWINDOW.js"></script> 

</head>
<!--[if lt IE 7]>
	<link href="ie_style.css" rel="stylesheet" type="text/css" />
   <script type="text/javascript" src="js/ie_png.js"></script>
   <script type="text/javascript">
       ie_png.fix('.png, .main-box-left, .main-box-right, .main-box-top-tail, .main-box-top-right, .main-box-top-left, .main-box-bottom, .main-box-bottom-right, .main-box-bottom-left, .link, .policy strong');
   </script>
<![endif]-->
<body id="page1">
<p><a href="#example9Content" class="example9DOMWindow">Open DOM Window</a></p> 
<p><a href="#example9aContent" class="example9aDOMWindow">Open DOM Window</a></p> 
<script type="text/javascript"> 
$('.example9DOMWindow').click(function(){ 
    $.openDOMWindow({ 
        windowSourceID:'#example9Content', 
        height:220,  
        width:320, 
        overlay:0, 
        positionType:'anchoredSingleWindow',  
        windowPadding:20,  
        windowBGColor:'#ccc',  
        borderSize:'0', 
        anchoredSelector:'.example9DOMWindow', 
        positionLeft:120, 
        positionTop:-150 
    }); 
    return false; 
}); 
$('.example9aDOMWindow').click(function(){ 
    $.openDOMWindow({ 
        windowSourceID:'#example9Content', 
        height:220,  
        width:320, 
        overlay:0, 
        positionType:'anchoredSingleWindow',  
        windowPadding:20,  
        windowBGColor:'#ccc',  
        borderSize:'0', 
        anchoredSelector:'.example9aDOMWindow', 
        positionLeft:120, 
        positionTop:-150 
    }); 
    return false; 
}); 
</script> 
<div id="example9Content" style=" display:none;"> 
<p>Inline Content</p> 
<p><a href="#" class="closeDOMWindow">close</a></p> 
<p>Consequat ea Investigationes in enim congue. Option velit volutpat quod blandit ex. Congue parum praesent aliquam nam clari. Qui praesent quam sollemnes id vulputate. In imperdiet diam at sequitur et. Minim delenit in dolor dolore typi.</p> 
</div>
</body>
</html>