<nav class="navbar navbar-fixed-top navbar-inverse">
    <div class="container">
        <ul class="nav navbar-nav">
            <sec:ifLoggedIn>
                <li><g:link role="button" controller="game" action="list">Pronostiquer</g:link></li>
                <li><g:link role="button" controller="user" action="list">Classement</g:link></li>
                <li><g:link role="button" controller="rule" action="show">Règlement</g:link></li>
                <li class="dropdown dropdown-inverse">
		    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Statistiques</a>
		    <ul class="dropdown-menu" role="menu">
		        <li><g:link role="button" controller="statistic" action="list" id="-1"><sec:username/></g:link></li>
		        <li><g:link role="button" controller="statistic" action="prono">globales</g:link></li>
		    </ul>
		</li>
                <li><g:link controller="user" action="password" role="button" method="post">Changement mot de passe</g:link></li>
                <li><g:link controller="logout" role="button" method="post">Déconnexion <sec:username/></g:link></li>
            </sec:ifLoggedIn>
            <sec:ifNotLoggedIn>
                <li><g:link controller="login" action="auth">S'identifier</g:link></li>
                <li><g:link controller="registration" action="register">S'inscrire</g:link></li>
            </sec:ifNotLoggedIn>
            <sec:ifAllGranted roles="ROLE_ADMIN">
                <li><g:link role="button" controller="gameHandler" action="create">Nouveau</g:link></li>
            </sec:ifAllGranted>
        </ul>
    </div>
</nav>