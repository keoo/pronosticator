<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="prono"/>
    <title>Classement</title>
</head>

<body>
<table class="table table-hover text-center">
    <tr>
        <th class="text-center">Pseudo</td>
        <th class="text-center">Points</td>
        <th class="text-center">Classement</td>
    </tr>
    <g:each in="${users}" var="user" status="i">
        <tr>
            <td>${user[0].username}</td>
            <td>${user[1]}</td>
            <td>${i+1}</td>
        </tr>
    </g:each>
</table>
</body>
</html>
