<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="prono"/>
		      <title>Nouveau match</title>
		      </head>
		      <body>
			  <table>
                            <g:form method="post" name="result" url="[action:'register',controller:'gameHandler']">
			    <tr>
			      <td>

                          <label>Domicile </label>
				<input type="textField" name="domicile" id="domicile" />
				</td>
				</tr>
				<tr>
				<td>
				<label>Exterieur </label>
				<input type="textField" name="exterieur" id="exterieur" />
			      </td>
			      </tr>
				<tr>
				<td>
				<label>Date </label>
				<input type="date" name="starttime" id="starttime" />
			      </td>
			      </tr>
			    <tr>
			      <td>
				<center><input type="submit" value="valider"/></center>
			      </td>
			    </tr>
                         </g:form>
			  </table>
			</body>
</html>

