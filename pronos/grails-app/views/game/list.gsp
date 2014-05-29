<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="prono"/>
		      <title>List of matches</title>
		      </head>
		      <body>


    <table>
        <tr>
            <td>Equipe1</td>
            <td>Equipe2</td>
            <td>Date</td>
            <td>Score</td>
            <td>Pronostiquer</td>
            <td>Pronostic</td>
        </tr>
        <g:each in="${list}" var="match">
        <tr>
            <td>${match.domicile}</td>
            <td>${match.exterieur}</td>
            <td>${match.starttime}</td>
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
        </tr>
        </g:each>        
    </table>


			</body>
</html>
