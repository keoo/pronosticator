<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="prono"/>
		      <title>Pronostic</title>
		      </head>
		      <body>
			Pronostic
                        <g:form method="post" name="myprono" url="[action:'pronosticated',controller:'game', id:params.id]">
			  <table>
			    <tr>
			      <td>

                          <label>${params.domicile} :</label>
			      </td>
			      <td>
                          <input type="textField" name="domicile" id="domicile" />
			      </td>
			    </tr>
			    <tr>
			      <td>
                          <label>${params.exterieur} :</label>
			      </td>
			      <td>
                          <input type="textField" name="exterieur" id="exterieur" />
			      </td>
			    </tr>
			    <tr>
			      <td>
			      </td>
			      <td>
                           <input type="submit" value="valider"/>
			      </td>
			    </tr>
			  </table>
                         </g:form>
			</body>
</html>

