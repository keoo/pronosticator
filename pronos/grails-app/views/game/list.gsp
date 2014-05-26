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
            <td>Domicile</td>
            <td>Exterieur</td>
        </tr>
        <g:each in="${list}" var="match">
        <tr>
            <td>${match.domicile}</td>
            <td>${match.exterieur}</td>
            <td>${match.date}</td>
        </tr>
        </g:each>        
    </table>


			</body>
</html>