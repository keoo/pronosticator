<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="prono"/>
    <title>Résultat</title>
</head>

<body>
<g:form class="form-inline text-center" method="post" name="result" url="[action: 'scored', controller: 'gameHandler', id: params.id]">
    <div class="form-group">
        <label for="domicile">${params.domicile}</label>
    </div>
    <div class="form-group">
        <input type="text" class="form-control" name="domicile" id="domicile">
    </div>
    <div class="form-group">
        <label>-</label>
    </div>
    <div class="form-group">
        <input type="text" class="form-control" name="exterieur" id="exterieur">
    </div>
    <div class="form-group">
        <label for="exterieur">${params.exterieur}</label>
    </div>
    <div class="form-group">
      <input type="submit" value="valider"/>
    </div>
</g:form>
</body>
</html>

