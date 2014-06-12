<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="prono"/>
    <title>Statistiques utilisateur</title>
</head>

<body>
<table class="table table-hover text-center">
        <tr>
            <td>Match</td>
            <td>${domicile} - ${exterieur}</td>
        </tr>
        <tr>
            <td>Nombre de paris</td>
            <td>${total}</td>
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
        <tr>
            <td>Score moyen</td>
            <td>${totalDom}-${totalExt}</td>
        </tr>
        <tr>
            <td>Pronostic du nombre de buts maximal et minimal marqués pour ${domicile}</td>
            <td>${maxDom} / ${minDom}</td>
        </tr>
        <tr>
            <td>Pronostic du nombre de buts maximal et minimal marqués pour ${exterieur}</td>
            <td>${maxExt} / ${minExt}</td>
        </tr>
</table>
</body>
</html>
