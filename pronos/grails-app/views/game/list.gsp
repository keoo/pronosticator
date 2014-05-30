<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="prono"/>
		      <title>List of matches</title>
		      </head>
		      <body>
<div class="container">
<h2>Prochains matchs</h2>
    <table class="table">
        <tr>
            <td><b><u>Equipe1</u></b></td>
            <td><b><u>Equipe2</u></b></td>
            <td><b><u>Date</u></b></td>
            <td><b><u>Score</u></b></td>
            <td><b><u>Pronostic</u></b></td>
            <td><b><u>Pronostiquer</u></b></td>
        </tr>
        <g:each in="${next}" var="match">
        <tr>
            <td>${match.domicile}</td>
            <td>${match.exterieur}</td>
            <td><g:formatDate format="dd-MM-yyyy" date="${match.starttime}"/></td>
            <g:if test="${ match.bdomicile == -1 }">
              <td> - </td>
            </g:if>
            <g:else>
              <td> ${match.bdomicile}-${match.bexterieur} </td>
            </g:else>
            <g:set var="x" value="${0}"/>
            <g:set var="dom" value="${0}"/>
            <g:set var="ext" value="${0}"/>
            <g:each in="${pronostic}" var="prono">
              <g:if test="${ match.id == prono.game.id}">
                <g:set var="x" value="${1}"/>
                <g:set var="dom" value="${prono.b_domicile}"/>
                <g:set var="ext" value="${prono.b_exterieur}"/>
              </g:if>
            </g:each>
            <g:if test="${ x == 1}">
                <td>${dom}-${ext}</td>
            </g:if>
            <g:else>
                <td><font color="red">manquant</font></td>
            </g:else>
            <g:if test="${ match.bdomicile == -1  && match.starttime - new Date() - 1 >= 0}">
              <td><g:link controller="pronostic" action="create" id="${match.id}"><button type="button">Pronostiquer</button></g:link></td>
            </g:if>
            <g:else>
              <td>Fini </td>
            </g:else>
	    <sec:ifAllGranted roles="ROLE_ADMIN">
              <td>
		<g:link controller="gameHandler" action="finalise" id="${match.id}">
		  <button type="button">Score</button>
		</g:link>
	      </td>
	    </sec:ifAllGranted>
        </tr>
        </g:each>        
    </table>
<h2>Anciens résultats</h2>

    <table class="table">
        <tr>
            <td><b><u>Equipe1</u></b></td>
            <td><b><u>Equipe2</u></b></td>
            <td><b><u>Date</u></b></td>
            <td><b><u>Score</u></b></td>
            <td><b><u>Pronostic</u></b></td>
            <td><b><u>Points</u></b></td>
        </tr>
        <g:each in="${old}" var="match">
        <tr>
            <td>${match.domicile}</td>
            <td>${match.exterieur}</td>
            <td><g:formatDate format="dd-MM-yyyy" date="${match.starttime}"/></td>
            <g:if test="${ match.bdomicile == -1 }">
              <td> - </td>
            </g:if>
            <g:else>
              <td> ${match.bdomicile}-${match.bexterieur} </td>
            </g:else>
            <g:set var="x" value="${0}"/>
            <g:set var="dom" value="${0}"/>
            <g:set var="ext" value="${0}"/>
            <g:set var="point" value="${0}"/>
            <g:each in="${pronostic}" var="prono">
              <g:if test="${ match.id == prono.game.id}">
                <g:set var="x" value="${1}"/>
                <g:set var="dom" value="${prono.b_domicile}"/>
                <g:set var="ext" value="${prono.b_exterieur}"/>
                <g:set var="point" value="${prono.point}"/>
              </g:if>
            </g:each>
            <g:if test="${ x == 1}">
                <td>${dom}-${ext}</td>
            </g:if>
            <g:else>
                <td><font color="red">manquant</font></td>
            </g:else>
	    <td>
	      ${point}
	    </td>
	    <sec:ifAllGranted roles="ROLE_ADMIN">
              <td>
		<g:link controller="gameHandler" action="finalise" id="${match.id}">
		  <button type="button">Score</button>
		</g:link>
	      </td>
	    </sec:ifAllGranted>
        </tr>
        </g:each>        
    </table>

</div>
			</body>
</html>
