# Web App :  Black Jack ♥️♦️♣️♠️

keyword: Java, JavaFX, SceneBuilder, MVC　　

## Summary　　

This is a web application for users to play a card game called “Black Jack”.
The rule of this game is simple, whoever holds the cards with sum of 21 wins, and whoever holds cards with sum of more than 21 is busted.
Each game will be conducted by a dealer and 2 players. 　　

![Black Jack Demo 1](https://media.giphy.com/media/ngkQ1DTLSlHCxZBoAk/giphy.gif)

## Spec　　

- Java: version 1.8.0_261
- JavaFX: version 8.0.261-b12
- SceneBuilder: version 8.5.0

## How to play　　

1. A user click the ‘START’ button to initiate a game.
2. A dealer draws 2 cards randomly from a deck and distributes each to Player1 and Player2, and 1 card for the dealer themselves.
   This is the start of the game. (and continues untill users choose ‘STAND’)
3. After all of them get cards, players take turn to choose either ‘HIT’(request 1 more card) or ‘STAND’(no more card).
4. Whoever holds cards which sums up to 21, wins, and over 21 will be busted(lose).
    When one of the players is busted earlier than the other, the remaining player will stay and continues the game with the dealer.
5. When players choose ‘STAND’, but sum of dealer’s cards is less than 16, the dealer get to draw one more card.

![Black Jack Demo 2](https://media.giphy.com/media/QIkWWhB2riEWGwxkvb/giphy.gif)  ![Black Jack Demo 3](https://media.giphy.com/media/0slruR69DqQcsYjTTu/giphy.gif)

## Target users

People who want to casually enjoy BlackJack game, but do not know much about its rule.  
-> We’ve implemented the ‘Help’ page, which users can see by clicking the help button on the upper left to check the game rule whenever they feel unsure throughout the game.
![Black Jack Help](https://user-images.githubusercontent.com/69213242/127411696-d656fec1-7df0-4558-82a2-c11b5f8514d1.png)

## Design Pattern

We used Model-view-controller design pattern to implement this game.
![Black Jack UML Diagram](https://user-images.githubusercontent.com/69213242/127413637-b5ffbfb3-3a3f-441b-a30b-ec52ced5df53.png)

## Project Management

We used a shared excel sheet to manage each project to-dos, and also keep track of the schedule, so that all the team members are aware of every other team member's tasks, and which to-dos are open and which is closed.  
This makes this project to be completed in 2 weeks.

[Links to sheet](https://docs.google.com/spreadsheets/d/13FzdiZcMlkQ-prK5MWnweHoyfvnOv_mjw_lL_3LKfMA/edit#gid=1210881043)

## UI Design

We created simple UI on Excel, then elaborate it with using SceneBuilder with images.

## Team 

Team Member  | Role
------------- | -------------
Yurie ([Yurie-Koga](https://github.com/Yurie-Koga))  | Project Manager, UI Designer
Yumi ([YumiMachino](https://github.com/YumiMachino))   | System Design, Programmer, Docs
Kazu ([wangkalbi-gernessen](https://github.com/wangkalbi-gernessen))  | System Design, Programmer
Kideok ([rlarlejr88](https://github.com/rlarlejr88))   | UI Designer

