<!DOCTYPE html>
<html>
  <head>
    <meta name="layout" content="prono"/>
    <title>Pronostic</title>
  </head>
  <body>
    <g:form method="post" name="myprono" url="[action:'pronosticated',controller:'game', id:params.id]">
      <div class="row">
	<div class="col-md-3"> </div>
	<div class="col-md-6">
	  
	  <table class="table">
	    <tr>
	      <td>
		
                <label>${params.domicile} </label>
		<input type="textField" name="domicile" id="domicile" />
		-
		<input type="textField" name="exterieur" id="exterieur" />
		<label>${params.exterieur} </label>
	      </td>
	    </tr>
	  </table>
	</div>
	<div class="col-md-3"> </div>
      </div>
      <div class="row">
	<center><input type="submit" value="valider"/></center>
      </div>
    </g:form>
  </body>
</html>

