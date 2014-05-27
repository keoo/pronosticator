<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
		      <title>Pronostic</title>
		      </head>
		      <body>
			Pronostic
                        <g:form name="myForm" url="[action:'index',controller:'pronostic']">

                          <label for="domicile">${match.domicile} :</label>
                          <input type="text" name="domicile" id="domicile" />
                          <label for="exterieur">${match.exterieur} :</label>
                          <input type="text" name="exterieur" id="exterieur" />

                        </g:form>
			</body>
</html>

