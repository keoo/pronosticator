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
        <g:each in="${list}" var="bla">
        <tr>
            <td>${bla[0].firstname}</td>
            <td>${bla[0].lastname}</td>
            <td>${bla[0].username}</td>
            <td>${bla[1]}</td>
            <td>0</td>
        </tr>
        </g:each>        
    </table>


			</body>
</html>
