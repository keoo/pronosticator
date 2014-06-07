<!DOCTYPE html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <html lang="en" class="no-js"><!--<![endif]-->
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title><g:layoutTitle default="Pronosticator"/></title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <g:layoutHead/>
    <g:javascript library="jquery"/>
    <r:require module="bootstrap"/>
    <r:layoutResources/>
    <script type="text/ecmascript">//<![CDATA[
function animateTitle (t) {
var title = document.getElementsByTagName ("h1")[0];
var spans = title.getElementsByTagName ("span");
for (var i = 0; i < spans.length; i++) {
spans[i].style.transform = "translateY(" + (30+50*Math.sin (t/200 + spans[i].offsetLeft/25)) + "px) " +
                           "rotate(" + (180 * Math.atan (2*Math.cos (t/200 + spans[i].offsetLeft/25)) / Math.PI) + "deg)";
spans[i].style.color = "hsl(" + (t/20 + i*10) + ",100%,50%)";
}
window.requestAnimationFrame (animateTitle);
}
//]]></script>

    <style type="text/css">/*<![CDATA[*/
h1 {
padding-top: 50px;
padding-bottom: 50px;
}
h1 span {
display: table-cell;
}
/*]]>*/
</style>
</head>

<body onload="animateTitle (0)">
<g:render template="/templates/navbar" />

<h1>
<center>  <span>P</span><span>r</span><span>o</span><span>n</span><span>o</span><span>s</span><span>t</span><span>i</span><span>c</span><span>a</span><span>t</span><span>o</span><span>r</span>
</center>
</h1>
<div role="main" class="container">
<div id="grailsLogo" role="banner">

<a href="#"><img src="${resource(dir: 'images', file: 'kitty.png')}"></a>
</div>
<!--    <div id="grailsLogo" role="banner"><a href="#"><img src="${resource(dir: 'images', file: 'logo.png')}"></a></div>-->
    <g:layoutBody/>
</div>
<r:layoutResources/>
</body>
</html>
