<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="prono"/>
    <title>Nouveau match</title>
</head>

<body>
<g:form class="form-horizontal" method="post" name="result" url="[action: 'register', controller: 'gameHandler']">
    <div class="form-group">
        <label for="domicile" class="col-sm-2 control-label">Équipe domicile</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" name="domicile" id="domicile">
        </div>
    </div>
    <div class="form-group">
        <label for="exterieur" class="col-sm-2 control-label">Équipe extérieur</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" name="exterieur" id="exterieur">
        </div>
    </div>
    <div class="form-group">
        <label for="starttime" class="col-sm-2 control-label">Date</label>
        <div class="col-sm-10">
            <input type="date" class="form-control" name="starttime" id="starttime">
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" class="btn btn-default">Valider</button>
        </div>
    </div>
</g:form>
</body>
</html>