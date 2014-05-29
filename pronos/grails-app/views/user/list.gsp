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
        <g:each in="${list}" var="user">
        <tr>
            <td>${user.firstname}</td>
            <td>${user.lastname}</td>
            <td>${user.username}</td>
            <td>0</td>
            <td>0</td>
        </tr>
        </g:each>        
    </table>


			</body>
</html>
