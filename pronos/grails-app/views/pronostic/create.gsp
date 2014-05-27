<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
		      <title>Pronostic</title>
		      </head>
		      <body>
			Pronostic
                        <g:form name="myForm" url="[action:'index',controller:'pronostic']">

                          <label for="domicile">${params.domicile} :</label>
                          <input type="text" name="domicile" id="domicile" />
                          <label for="exterieur">${params.exterieur} :</label>
                          <input type="text" name="exterieur" id="exterieur" />

                        </g:form>
			<g:link controller="pronostic" action="save" id="${params.id}"><button type="button">Valider</button></g:link>
			</body>
</html>

