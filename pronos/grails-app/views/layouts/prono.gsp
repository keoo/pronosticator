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
  <link rel="shortcut icon" href="${resource(dir: 'images', file: 'favicon.ico')}" type="image/x-icon">
  <link rel="apple-touch-icon" href="${resource(dir: 'images', file: 'apple-touch-icon.png')}">
  <link rel="apple-touch-icon" sizes="114x114" href="${resource(dir: 'images', file: 'apple-touch-icon-retina.png')}">
  <link rel="stylesheet" href="${resource(dir: 'css', file: 'main.css')}" type="text/css">
  <link rel="stylesheet" href="${resource(dir: 'css', file: 'mobile.css')}" type="text/css">
  <!-- Bootstrap core CSS -->
  <link rel="stylesheet" href="${resource(dir: 'css', file: 'bootstrap.min.css')}" type="text/css">
  <!-- Bootstrap theme -->
  <link rel="stylesheet" href="${resource(dir: 'css', file: 'bootstrap-theme.min.css')}" type="text/css">
  <!-- Custom styles for this template -->
  <link rel="stylesheet" href="${resource(dir: 'css', file: 'custom.css')}" type="text/css">
  <g:layoutHead/>
  <g:javascript library="application"/>		
  <r:layoutResources />
</head>
  <body>
    <!--		  <div id="grailsLogo" role="banner"><a href="http://grails.org"><img src="${resource(dir: 'images', file: 'grails_logo.png')}" alt="Grails"/></a></div>-->
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
      <div id="grailsLogo" role="banner"><a href="#"><img src="${resource(dir: 'images', file: 'logo.png')}" ></a></div>
      <div class="navbar navbar-fixed-top navbar-inverse">
	<div class="navbar-inner">
          <div class="container">		  <ul>
	      <sec:ifLoggedIn>
		<li> 
		  <g:link  role="button" controller="game" action="list">
		    Pronostiquer
		  </g:link>
		</li>
		<li>
		  <g:link role="button" controller="user" action="list">
		    Classement
		  </g:link>
		</li>
		<li>
		  <g:link controller="logout" role="button" method="post"> Déconnexion <sec:username /> 
		    
		  </g:link>
		</li>
	      </sec:ifLoggedIn>
	      <sec:ifNotLoggedIn>
		<li>
		  <g:link controller="login" action="auth">Login</g:link>
		</li>
		<li>
		  <g:link controller="registration" action="register">S'inscrire</g:link>
		</li>
	      </sec:ifNotLoggedIn>
	      <sec:ifAllGranted roles="ROLE_ADMIN">
		<li> 
		  <g:link  role="button" controller="gameHandler" action="create">
		    Nouveau
		  </g:link>
		</li>
	      </sec:ifAllGranted>
	    </ul>
	  </div>
	</div>
      </div>
    <g:layoutBody/>
    <div class="footer" role="contentinfo"></div>
    <div id="spinner" class="spinner" style="display:none;"><g:message code="spinner.alt" default="Loading&hellip;"/></div>
    <r:layoutResources />
    <a href="#page-body" class="skip"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
    <div id="status" role="complementary">
    </div>
    <div id="page-body" role="main">
    </div>
  </body>
</html>
