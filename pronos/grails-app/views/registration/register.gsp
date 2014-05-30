<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="prono"/>
		      <title>Inscription</title>
		      </head>
		      <body>
			  <table>
                        <g:form method="post" name="registration" url="[action:'create',controller:'registration']">
			    <tr>
			      <td>
				<label>Nom :</label>
			      </td>
			      <td>
				<input type="textField" name="nom" id="nom" />
			      </td>
			    </tr>
			    <tr>
			      <td>
				<label>Prenom :</label>
			      </td>
			      <td>
				<input type="textField" name="prenom" id="prenom" />
			      </td>
			    </tr>
			    <tr>
			      <td>
				<label>Pseudo :</label>
			      </td>
			      <td>
				<input type="textField" name="user" id="user" />
			      </td>
			    </tr>
			    <tr>
			      <td>
				<label>Mot de passe :</label>
			      </td>
			      <td>
				<input type="password" name="pwd" id="pwd" />
			      </td>
			    </tr>
			    <tr>
			      <td>
			      </td>
			      <td>
				<input type="submit" value="valider"/>
			      </td>
			    </tr>
                         </g:form>
			  </table>
			</body>
</html>

