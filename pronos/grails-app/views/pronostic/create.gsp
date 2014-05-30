<!DOCTYPE html>
<html>
  <head>
    <meta name="layout" content="prono"/>
    <title>Pronostic</title>
  </head>
  <body>
    <!--
	<table>
          <g:form method="post" name="myprono" url="[action:'pronosticated',controller:'game', id:params.id]">
	    <tr>
	      <td>
		
                <label>${params.domicile} </label>
		<input type="textField" name="domicile" id="domicile" />
		-
		<input type="textField" name="exterieur" id="exterieur" />
		<label>${params.exterieur} </label>
	      </td>
	    </tr>
	    <tr>
	      <td>
		<center><input type="submit" value="valider"/></center>
	      </td>
	    </tr>
          </g:form>
	</table>
	-->
    <g:form method="post" name="myprono" url="[action:'pronosticated',controller:'game', id:params.id]">
      <div class="container-fluid">
	<div class="row">
	  <div class="col-md-3"> </div>
	  <div class="col-md-1">
            <label>${params.domicile} </label>
	  </div>
	  <div class="col-md-1">
	    <input type="textField" name="domicile" id="domicile" />
	  </div>
	  <div class="col-md-1">
	    <center>-</center>
	  </div>
	  <div class="col-md-1">
	    <input type="textField" name="exterieur" id="exterieur" />
	  </div>
	  <div class="col-md-1">
	    <label>${params.exterieur} </label>
	  </div>
	  <div class="col-md-3"> </div>
	</div>
      </div>
      <center><input type="submit" value="valider"/></center>
    </g:form>  
  </body>
</html>

