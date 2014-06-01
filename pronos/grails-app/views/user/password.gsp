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
        <label for="password" class="control-label col-md-offset-2 col-md-3">Nouveau mot de passe</label>

        <div class="col-md-5">
            <input type="text" name="password" id="password"/>
        </div>
    </div>

    <div class="form-group">
        <div class="col-md-offset-2 col-md-8">
            <button type="submit" class="btn btn-default">Valider</button>
        </div>
    </div>
</g:form>
</body>
</html>

