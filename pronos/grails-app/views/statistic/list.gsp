<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="prono"/>
    <title>Statistiques utilisateur</title>
</head>

<body>
<table class="table table-hover text-center">
        <tr>
            <td>Parieur</td>
            <td>${user.username}</td>
        </tr>
        <tr>
            <td>Nombre de paris</td>
            <td>${total}</td>
        </tr>
        <tr>
            <td>Paris sur matchs finis</td>
            <td>${judged}</td>
        </tr>
        <tr>
            <td>Pronostics parfaits</td>
            <td>${perfect}</td>
        </tr>
        <tr>
            <td>Bon écart</td>
            <td>${great}</td>
        </tr>
        <tr>
            <td>Bon vainqueur</td>
            <td>${good}</td>
        </tr>
        <tr>
            <td>Echec</td>
            <td>${bad}</td>
        </tr>
        <tr>
            <td>Total points marqués</td>
            <td>${totalScore}</td>
        </tr>
        <tr>
            <td>Points par match</td>
            <td>${avg}</td>
        </tr>
</table>
</body>
</html>
