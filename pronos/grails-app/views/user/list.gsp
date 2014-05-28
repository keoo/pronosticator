<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="prono"/>
		      <title>List of matches</title>
		      </head>
		      <body>
			Match


    <table>
        <tr> 
            <td>Nom</td>
            <td>Prenom</td>
            <td>Points</td>
            <td>Classement</td>
        </tr>
        <g:each in="${list}" var="user">
        <tr>
            <td>${user.firstname}</td>
            <td>${user.lastname}</td>
            <td>0</td>
            <td>0</td>
        </tr>
        </g:each>        
    </table>


			</body>
</html>
