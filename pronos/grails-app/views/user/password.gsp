<!DOCTYPE html>
<html>
  <head>
    <meta name="layout" content="prono"/>
    <title>Changement de mot de passe</title>
  </head>
  <body>
    <g:form method="post" name="mypwd" url="[action:'passwordified',controller:'user']">
      <div class="row">
	<div class="col-md-3"> </div>
	<div class="col-md-6">
	  
	  <table class="table">
	    <tr>
	      <td>
		
                <label>Nouveau mot de passe </label>
		<input type="textField" name="password" id="password" />
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

