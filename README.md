# pronosticator
===============

## Description

Small webapp to handle a pronostic challenge between (nice) people.
One can register to bet on a game until the day before the actual game.
One get points for betting, in the end all people that bet are sorted according to the one getting the more points (the winner of the bet championship).

## Rules

Current rules are (for 2014 football world cup) :
Right bet (i.e. 2-1 for 2-1 or 2-2 for 2-2) : 5 points
Right difference (i.e. 2-1 instead of 1-0 or 2-2 for 1-1) : 4 points
Right winner (i.e 2-0 instead of 1-1) : 3 points
Participation (ie 2-0 instead of 0-1) : 1 point


## Technologies
* grails 
* spring security
* mysql (can use any other if you wish, tested with h2 for instance)
* bootstrap (and still such a bad UI)


## Still missing
* Error handling
* Beautiful UI
* Parameters checking
* More solid admin side (by default there is an admin user : admin/admin)

## Features to come
* Statistics