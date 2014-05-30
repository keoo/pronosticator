<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="prono"/>
		      <title>Classement</title>
		      </head>
		      <body>


    <table>
        <tr> 
            <td>Nom</td>
            <td>Prenom</td>
            <td>pseudo</td>
            <td>Points</td>
            <td>Classement</td>
        </tr>
	<g:set var="x" value="${1}"/>
        <g:each in="${list}" var="bla">
        <tr>
            <td>${bla[0].firstname}</td>
            <td>${bla[0].lastname}</td>
            <td>${bla[0].username}</td>
            <td>${bla[1]}</td>
            <td>${x}</td>
        </tr>
	<g:set var="x" value="${x+1}"/>
        </g:each>        
    </table>


			</body>
</html>
