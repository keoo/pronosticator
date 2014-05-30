<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="prono"/>
		      <title>Classement</title>
		      </head>
		      <body>


    <table>
        <tr> 
            <td><b><u>Nom</u></b></td>
            <td><b><u>Prenom</u></b></td>
            <td><b><u>pseudo</u></b></td>
            <td><b><u>Points</u></b></td>
            <td><b><u>Classement</u></b></td>
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
