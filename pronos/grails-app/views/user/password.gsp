<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="prono"/>
    <title>Changement de mot de passe</title>
</head>

<body>
<g:form class="form-horizontal" role="form" method="post" name="mypwd"
        url="[action: 'passwordified', controller: 'user']">
    <div class="form-group">
        <label for="password" class="col-sm-2 control-label">Nouveau mot de passe</label>
        <div class="col-sm-10">
            <input type="text" name="password" id="password"/>
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

