<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
		      <title>Pronostic</title>
		      </head>
		      <body>
			Pronostic
                        <g:form method="post" name="myprono" url="[action:'pronosticated',controller:'game', id:params.id]">

                          <label>${params.domicile} :</label>
                          <input type="textField" name="domicile" id="domicile" />
                          <label>${params.exterieur} :</label>
                          <input type="textField" name="exterieur" id="exterieur" />
                           <input type="submit" value="valider"/>
                         </g:form>
			</body>
</html>

