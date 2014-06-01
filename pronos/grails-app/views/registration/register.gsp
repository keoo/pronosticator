<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="prono"/>
    <title>Inscription</title>
</head>

<body>
<g:form class="form-horizontal" method="post" name="registration" url="[action: 'create', controller: 'registration']">
    <div class="form-group">
        <label for="nom" class="col-sm-2 control-label">Nom</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" name="nom" id="nom">
        </div>
    </div>
    <div class="form-group">
        <label for="prenom" class="col-sm-2 control-label">Prénom</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" name="prenom" id="prenom">
        </div>
    </div>
    <div class="form-group">
        <label for="user" class="col-sm-2 control-label">Pseudo</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" name="user" id="user">
        </div>
    </div>
    <div class="form-group">
        <label for="pwd" class="col-sm-2 control-label">Mot de passe</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" name="pwd" id="pwd">
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

