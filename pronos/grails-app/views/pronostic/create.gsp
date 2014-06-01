<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="prono"/>
    <title>Pronostic</title>
</head>

<body>
<g:form class="form-inline text-center" method="post" name="myprono" url="[action: 'pronosticated', controller: 'game', id: params.id]">
    <div class="row">
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
    </div>
    <div class="row">
        <div class="form-group">
            <button type="submit" class="btn btn-default">Valider</button>
        </div>
    </div>
</g:form>
</body>
</html>

