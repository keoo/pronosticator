<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="prono"/>
    <title>Statistiques globales</title>
</head>

<body>
<table class="table table-hover text-center">
    <tr>
        <th class="text-center">Pseudo</th>
        <th class="text-center">Points</th>
        <th class="text-center">Classement</th>
        <th class="text-center">Consulter</th>
    </tr>
    <g:each in="${users}" var="user" status="i">
        <tr>
            <td>${user[0].username}</td>
            <td>${user[1]}</td>
            <td>${i+1}</td>
            <td><g:link controller="game" action="spy" id="${user[0].id}"><button type="button">Espionner</button></g:link></td>
        </tr>
    </g:each>
</table>
</body>
</html>
