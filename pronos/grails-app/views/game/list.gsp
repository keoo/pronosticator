<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
		      <title>List of matches</title>
		      </head>
		      <body>
			Match


    <table>
        <tr>
            <td>Equipe1</td>
            <td>Equipe2</td>
            <td>Date</td>
            <td>Score</td>
            <td>Pronosticate</td>
        </tr>
        <g:each in="${list}" var="match">
        <tr>
            <td>${match.domicile}</td>
            <td>${match.exterieur}</td>
            <td>${match.starttime}</td>
            <g:if test="${ match.bdomicile == -1 }">
              <td> - ${match.id}</td>
              <td><g:link controller="Pronostic" action="create" params="${match.id}"><button type="button">Pronostiquer</button></g:link></td>
<!--              <td><g:link url="${resource(dir:'pronostic', file:'create.gsp')}" params="${[match.id]}"><button onclick="" type="button">Pronosticate!</button></g:link></td>-->
            </g:if>
            <g:else>
              <td> ${match.bdomicile}-${match.bexterieur} </td>
              <td><button disabled="disabled" type="button">Pronosticate!</button> </td>
            </g:else>
        </tr>
        </g:each>        
    </table>


			</body>
</html>
