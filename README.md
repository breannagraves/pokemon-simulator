# Pokemon Simulator
* Pokémon Battle Simulation 
* Live demo [_here_](https://www.example.com). <!-- If you have the project hosted somewhere, include the link here. -->

## Table of Contents
* [Description](#description)
* [General Info](#general-information)
* [Technologies Used](#technologies-used)
* [Features](#features)
* [Screenshots](#screenshots)
* [Setup](#setup)
* [Usage](#usage)
* [Project Status](#project-status)
* [Room for Improvement](#room-for-improvement)
* [Acknowledgements](#acknowledgements)
* [Contact](#contact)
<!-- * [License](#license) -->

<a name="desc"></a>
## Description
* Who you’re working with (you and your team members)?
<br/>**Breanna Graves, Michelle Sowell, Roldan Cortes, Sam Lowe, Evan Faust**<br/>
* What you’re creating?
<br/>**A Pokémon Battle Simulator**<br/>
* Who you’re doing it for, your audience (may be same as the previous question)?
<br/>**Pokémon Lovers**<br/>
* Why you’re doing this, the impact or change you hope to make?
<br/>**To create an engaging and simple battle simulator for all ages**<br/>
<!-- You don't have to answer all the questions - just the ones relevant to your project. -->

## General Information
![UltraBall](http://img1.wikia.nocookie.net/__cb20101106022319/pokemon/images/f/f1/UltraBallArt.png)

- We are currently lacking in time for development of this project, with only four weeks in this accelerated semester. 


## Technologies Used
- The game will be written in Java
- We are utilizing Jira, BitBucket, Git Kracken & CircleCI



## Features
**Pokémon Battle**
- Ability for users pokemon to battle other pokemon in a Graphical Interface
- Must have a visual interface that users can interact with
<br/>- Feature corresponds to user story #5<br/>
<br/>**Pokémon Move Pool**<br/>
- Pokemon will have at least 3 abilities 
<br/>- Feature corresponds to user story #7<br/>
<br/>**Accurate Pokémon moves**<br/>
- Abilities will be accurate for each pokemons evolution and move pool
- Must have accurate Pokémon information such as moves, evolution, and move pool
<br/>- Feature corresponds to user story #4<br/>
<br/>**Random Pokémon User Selection**<br/>
- Pokémon will be assigned to player at random
<br/>- Feature corresponds to user story #2<br/>
<br/>**Random Pokémon Opponant Selection**<br/>
- Pokémon that the user plays against will also be random
<br/>- Feature corresponds to user story #2<br/>



## Screenshots
![67771575524__B5ED4C4C-12C5-488F-85F2-39D2CF7D7144](https://github.com/user-attachments/assets/4ea30eca-1a93-403d-908b-d7cdfc4c9fac)

![67807456081__DDA7EAFE-1752-4EE0-924A-33CBF26528CB](https://github.com/user-attachments/assets/d8c1d602-565c-490e-89e9-e4fd8623bfd6)



## Setup
Proceed to describe how to install / setup one's local environment / get started with the project.


## Project Status
Project is: _in progress_ 

## Sprint One [6/15/2022 - 6/20/2022]
**Michelle's Contributions:**
<br/>- Updated code to randomly assign a Pokemon to a user: https://cs3398su22borgs.atlassian.net/browse/PS-9 (https://bitbucket.org/cs-3398-su22-borgs/new-pokemon-simulator/src/master/src/Main.java)<br/>
<br/>- Updated code to randomly assign a Pokemon to an opponent: https://cs3398su22borgs.atlassian.net/browse/PS-10 (https://bitbucket.org/cs-3398-su22-borgs/new-pokemon-simulator/src/master/src/Main.java)<br/>
<br/>- Created a dialog box to be displayed for when a Pokemon faints: https://cs3398su22borgs.atlassian.net/browse/PS-39 (https://bitbucket.org/cs-3398-su22-borgs/new-pokemon-simulator/src/master/src/GUI.java)<br/>
<br/>- Created a dialog box to be displayed for when a Pokemon wins: https://cs3398su22borgs.atlassian.net/browse/PS-40 (https://bitbucket.org/cs-3398-su22-borgs/new-pokemon-simulator/src/master/src/GUI.java)<br/>
<br/>- Created a Squirtle object: https://cs3398su22borgs.atlassian.net/browse/PS-49 (https://bitbucket.org/cs-3398-su22-borgs/new-pokemon-simulator/src/master/src/Squirtle.java)<br/>
<br/>- Created an Eevee object: https://cs3398su22borgs.atlassian.net/browse/PS-20 (https://bitbucket.org/cs-3398-su22-borgs/new-pokemon-simulator/src/master/src/Eevee.java<br/>
 
<br/>**Breanna's Contributions:**<br/>
<br/>- Research on Java Swing Class for gui implementation: https://cs3398su22borgs.atlassian.net/jira/software/projects/PS/boards/4?selectedIssue=PS-38 <br/> 
<br/>- Creation of Gui Class within GUI.java: https://cs3398su22borgs.atlassian.net/jira/software/projects/PS/boards/4?selectedIssue=PS-34 <br/>
<br/>- Creation of Start Page (code found in startGame() method) for Gui (added background/ buttons/ actionlisteners, etc): https://cs3398su22borgs.atlassian.net/jira/software/projects/PS/boards/4?selectedIssue=PS-34 <br/>
<br/>- Added Jtextfields on Start Page for player1 and player2 name entry: https://cs3398su22borgs.atlassian.net/jira/software/projects/PS/boards/4?selectedIssue=PS-51 <br/>
<br/>- Creation of Battle Page (code found in battle() method) for Gui (added background/ buttons/ actionlisteners, etc): https://cs3398su22borgs.atlassian.net/jira/software/projects/PS/boards/4?selectedIssue=PS-46 <br/>
<br/>- Added Pokemon images to Battle Page: https://cs3398su22borgs.atlassian.net/jira/software/projects/PS/boards/4?selectedIssue=PS-47 <br/>
<br/>- Allowed for Player names given on Start Page to show on Battle Page: https://cs3398su22borgs.atlassian.net/jira/software/projects/PS/boards/4?selectedIssue=PS-51 <br/>
<br/>- Added Jtextfields on Battle Page for player1 and player2 to enter their attacks: https://cs3398su22borgs.atlassian.net/jira/software/projects/PS/boards/4?selectedIssue=PS-52 <br/>
<br/>- Tied the dialogue boxes for fainting and winning to the attack buttons action listeners for the purpose of the demo: https://cs3398su22borgs.atlassian.net/jira/software/projects/PS/boards/4?selectedIssue=PS-52 <br/>

<br/>All of my contributions can be found at: https://bitbucket.org/cs-3398-su22-borgs/new-pokemon-simulator/src/master/src/GUI.java<br/>

<br/>**Evan's Contributions:**<br/>
<br/>- Created Psyduck object class to use as a Pokemon in battle https://cs3398su22borgs.atlassian.net/browse/PS-36 https://bitbucket.org/cs-3398-su22-borgs/new-pokemon-simulator/src/master/src/Psyduck.java <br/>
<br/>- Created a Mr. Mime object class to use as a Pokemon in battle https://cs3398su22borgs.atlassian.net/browse/PS-27 https://bitbucket.org/cs-3398-su22-borgs/new-pokemon-simulator/src/master/src/MrMime.java <br/>
<br/>- Adjusted the battle logic so that only one round is played during the game https://cs3398su22borgs.atlassian.net/browse/PS-22 https://bitbucket.org/cs-3398-su22-borgs/new-pokemon-simulator/src/master/src/Main.java <br/>
<br/>- Added battle moves for each Pokemon to be used in battle (String move arguments for each Pokemon object, created functions to call for each Pokemon's move, did research to make sure each move was accurate) also researched ways of using them in battle for Sprint 2 (All pokemon objects were edited but that would be too many links).
       https://cs3398su22borgs.atlassian.net/browse/PS-11 https://bitbucket.org/cs-3398-su22-borgs/new-pokemon-simulator/src/master/src/nPokemon.java https://bitbucket.org/cs-3398-su22-borgs/new-pokemon-simulator/src/master/src/PokeLoader.java <br/>
<br/>- Each Pokemon was given a type, which is relevant to how a Pokemon will be called into battle. Used getType in nPokemon.java and updated Pokeloader as well. (All pokemon objects were edited but that would be too many links) https://cs3398su22borgs.atlassian.net/browse/PS-21 https://bitbucket.org/cs-3398-su22-borgs/new-pokemon-simulator/src/master/src/nPokemon.java
       https://bitbucket.org/cs-3398-su22-borgs/new-pokemon-simulator/src/master/src/PokeLoader.java <br/>
       
<br/><br/>Note: I was unaware that you could create branches and pull requests directly from the tasks on Jira, so I created my branches manually and did the commits and pull requests associated with those branches. Therefore, my tasks won't show branches made and pull requests on Jira.
          However, you will find all of my commits in the commits section on Bitbucket with my name beside all of them, and all of said commits are associated with my tasks on Jira. The branches Evansbranch and Pokemoves were made by me. Please consider this before deducting points. I will make sure not to make this mistake again in Sprint 2. <br/>
<br/>**Roldan's Contributions:**<br/>
<br/>- Created file directory for the team. Also cloned a github repo to use as our source https://cs3398su22borgs.atlassian.net/browse/PS-26 <br/>
<br/>- Created an abstract Pokemon class, along with two sample Pokemon that can be loaded into a factory class to generate specific pokemon objects https://cs3398su22borgs.atlassian.net/browse/PS-26 <br/>
<br/>- Created a Pokemon interface with abstract methods that each pokemon will implement. https://cs3398su22borgs.atlassian.net/browse/PS-23 <br/>
<br/>- Uploaded 3D model gif files for each Pokemon, along with background images for the battle area. https://cs3398su22borgs.atlassian.net/browse/PS-31 & https://cs3398su22borgs.atlassian.net/browse/PS-30 <br/>
<br/>- Created a player class and interface. The player class creates an object and the user can enter their name, and also have a team of pokemon. https://cs3398su22borgs.atlassian.net/browse/PS-68 <br/>
<br/>- Created file directory for the team. Also cloned a github repo to use as our source https://cs3398su22borgs.atlassian.net/browse/PS-26 <br/>
<br/>- Created an abstract Pokemon class, along with two sample Pokemon that can be loaded into a factory class to generate specific pokemon objects https://cs3398su22borgs.atlassian.net/browse/PS-26 <br/>
<br/>- Created a Pokemon interface with abstract methods that each pokemon will implement. https://cs3398su22borgs.atlassian.net/browse/PS-23 <br/>
<br/>- Uploaded 3D model gif files for each Pokemon, along with background images for the battle area. https://cs3398su22borgs.atlassian.net/browse/PS-31 & https://cs3398su22borgs.atlassian.net/browse/PS-30 <br/>
<br/>- Created a player class and interface. The player class creates an object and the user can enter their name, and also have a team of pokemon. https://cs3398su22borgs.atlassian.net/browse/PS-68 <br/>
<br/>**Sam's Contributions:**<br/>
<br/>-All Pokemon should have an initial health statistic (get 50% done by sprint 1)(this part was only to the terminal since GUI and battle havent been implemented will be updated to healthbar in the next sprint) - https://cs3398su22borgs.atlassian.net/browse/PS-13
<br/>Create Lucario object - https://cs3398su22borgs.atlassian.net/browse/PS-48<br/>
<br/>When a Pokemon faints, a new pokemon with a different type should be picked - https://cs3398su22borgs.atlassian.net/browse/PS-19<br/>
<br/>All Pokemon should have an initial strength statistic ( both this and the health are done on the main and nPokemon files) - https://cs3398su22borgs.atlassian.net/browse/PS-18<br/>

## Retrospectives for Sprint One
<br/>**What Went Well?**<br/>
<br/>Team – We were flexible enough to adjust our scope into something feasible.<br/>
<br/>Team – Very good at helping one another when one of us got stuck.<br/> 
<br/>Team – We were good about merge communication.<br/> 
<br/>Team – We communicated in a very timely matter.<br/>
<br/>Michelle – Being able to create dialog boxes without too much issue.<br/>
<br/>Breanna – Being able to create a complex GUI <br/>
<br/>Roldan – Was able to be flexible with how the Pokémon class was created which ended up really backing the whole project.<br/> 
<br/>Evan – Was very enthusiastic and confident about the research completed on the project and being able to ensure the data was accurate in all the details.<br/> 
<br/>Sam – Being able to pickup the slack on Jira/BitBucket/GitKraken towards the end of the sprint once it all started to click and make sense.<br/> 
<br/>**What Can I do Better?**<br/>
<br/>Michelle – Could do better by taking time and reviewing code in depth before committing and submitting a pull request. Overall be more knowledgeable on how GitKraken works. This will be accomplished by noticing less errors in GitKraken for Sprint 2.<br/>
<br/>Breanna – Could organize the GUI code better so that it is more readable. This will be accomplished by it being more organized and readable after Sprint 2.<br/> 
<br/>Roldan— Could communicate better on how code will be implemented. This will be accomplished by discussing how the code will be implemented prior to requesting a pull request and ensuring the team is on board. This should lead to less back and forth and/or changes being requested on pull requests.<br/> 
<br/>Evan – Could be more responsive in offline group chats. This will be accomplished by the group receiving additional texts or messages on a routine basis as he works through the project. Could do better understanding all the software tools, especially GitKraken. This will be accomplished by noticing correct commits and merges in BitBucket/Jira/GitKraken for Sprint 2.<br/>
<br/>Sam – Could do better by creating branches off specific tasks in Jira. This will be accomplished once Sprint 2 is started and we should be able to see branches off of each of his tasks.<br/> 
<br/>**What Might Be Impeding Us from Performing Better?**<br/>
 We could all have  more effective/efficient communication to ensure that we are all on the same page about everything.<br/>
 <br/><br/>

## Sprint Two - Next Steps 
 <br/>**Michelle:**<br/>
 <br/>1) New Feature: Create buttons/dropdowns for Pokemon selection<br/>
 <br/>2) New Feature: Create buttons/dropdowns for Pokemon move/attack options<br/>
 <br/>3) New Feature: Create text/dialog to show whose turn it is<br/>
 <br/>4) New Feature: Create text/dialog for battle statements(HIT, MISS, etc)<br/>
 <br/>5) Feature Update: Provide Eevee with four moves/attacks<br/>
 <br/>6) Bug Fix: Move needs to get correctly passed into constructor<br/>
 <br/>**Breanna:**<br/>
 <br/> New Feature: Creation of a Layerd Gui: Poke Images/ Some Components of GUI should be layered on Background
 <br/> New Feature: Create a pokemon object within the main (StartGame) panel when a user selects a Pokemon
 <br/> New Feature: Add the passing of the created pokemon object to the battle frame
 <br/> New Feature: On the main/StartGame Panel, the pokemon selection/name should appear below the players name
 <br/>**Roldan:**<br/>
 <br/>- Create a Move factory. This will fill in the attributes needed by the abstract Move class.<br/>
 <br/>- Create Move class. This will create an abstract move object, which will be assigned to each pokemon.<br/>
 <br/>- Create an array of move objects and assign each pokemon 4 moves that they can use in battle. <br/>
 <br/>- Finish player class. Add new features such as user choices (Battle, Heal, or view Team). <br/>
 <br/>- Assing each Pokemon their respective front and rear view 3D model in a way that is not hard coded. <br/>
 <br/>- Create a Move factory. This will fill in the attributes needed by the abstract Move class.<br/>
 <br/>- Create Move class. This will create an abstract move object, which will be assigned to each pokemon.<br/>
 <br/>- Create an array of move objects and assign each pokemon 4 moves that they can use in battle. <br/>
 <br/>- Finish player class. Add new features such as user choices (Battle, Heal, or view Team). <br/>
 <br/>- Assing each Pokemon their respective front and rear view 3D model in a way that is not hard coded. 
 <br/>**Evan:**<br/>
 <br/>1) MISS battle statement within the GUI will be triggered based on battle logic/attack <br/>
 <br/>2) Charmander should have four attacks moves<br/>
 <br/>3) Mr. Mime should have four attacks moves<br/>
 <br/>4) Player turn should be randomly assigned<br/>
 <br/>5) Psyduck should have four attacks/moves<br/>
 <br/>6) During battle, attacks should randomly miss<br/>
 <br/>**Sam:**<br/>
 <br/>1)HIT battle statement within the GUI should be triggered based on battle logic/attack<br/>
 <br/> 2)Lucario should have four attacks/moves<br/>
 <br/>3)Health display needs to be updated upon each HIT<br/>
 <br/>4)Health needs to be updated upon each HIT<br/>
 <br/>5)Squirttle should have four attacks/moves<br/>
 <br/>6)Pikachu should have four attacks/moves<br/>
 <br/><br/>
 
## Sprint Two [6/22/2022 - 6/28/2022]
<br/>**Michelle's Contributions:**<br/>
 <br/>-Create dropdowns for Pokemon selection <br/>
        <br/>Jira: https://cs3398su22borgs.atlassian.net/jira/software/projects/PS/boards/4?selectedIssue=PS-63 Bitbucket: https://bitbucket.org/cs-3398-su22-borgs/new-pokemon-simulator/commits/72c19defa9a35ed9ee3c5395923b92887e42e652 <br/>
 <br/>-Create dropdowns for move selection for Pokemon <br/> 
        <br/>Jira: https://cs3398su22borgs.atlassian.net/jira/software/projects/PS/boards/4?selectedIssue=PS-62 Bitbucket: https://bitbucket.org/cs-3398-su22-borgs/new-pokemon-simulator/commits/f44dc7e0c018f6285d4082e54207a2880dec4731 <br/>
 <br/>-Adjust move constructor to ensure all proper parameters are being passed <br/>
        <br/>Jira: https://cs3398su22borgs.atlassian.net/jira/software/projects/PS/boards/4?selectedIssue=PS-78 Bitbucket: https://bitbucket.org/cs-3398-su22-borgs/new-pokemon-simulator/commits/b092f625067ee20e08c5e79f1792007ee4e8a852 <br/>
 <br/>-Add all remaining/available moves to pokeLineup so that they can be properly assigned/used <br/>
        <br/>Jira: https://cs3398su22borgs.atlassian.net/jira/software/projects/PS/boards/4?selectedIssue=PS-65 Bitbucket: https://bitbucket.org/cs-3398-su22-borgs/new-pokemon-simulator/commits/3895a0c0841537a68e09ad002e926df202c92293 <br/>
 <br/>-Add expected moves for Eevee <br/>
        <br/>Jira: https://cs3398su22borgs.atlassian.net/jira/software/projects/PS/boards/4?selectedIssue=PS-66 Bitbucket: https://bitbucket.org/cs-3398-su22-borgs/new-pokemon-simulator/commits/952b88c37c5174b1e100aa35e1118e5e3299981e <br/>
 <br/>-Condense all separate Pokemon classes into one large nested class so that it can be easily expanded <br/>
        <br/>Jira: https://cs3398su22borgs.atlassian.net/jira/software/projects/PS/boards/4?selectedIssue=PS-82 Bitbucket: https://bitbucket.org/cs-3398-su22-borgs/new-pokemon-simulator/commits/f5daf6adecd6d15d6dafb58d7eb02b1a82013be2 <br/>
 <br/>-Adjust dropdown sizes <br/>
        <br/>Jira: https://cs3398su22borgs.atlassian.net/jira/software/projects/PS/boards/4?selectedIssue=PS-64 Bitbucket: https://bitbucket.org/cs-3398-su22-borgs/new-pokemon-simulator/commits/292ed11738564fbb8f71d94f858009450c072127 <br/> 

<br/>**Breanna's Contributions:**<br/>
 <br/>-Research implementing a layered battle interface <br/>
        <br/>Jira: https://cs3398su22borgs.atlassian.net/browse/PS-56 Bitbucket: https://bitbucket.org/cs-3398-su22-borgs/%7B0ea0e6dc-4bd9-4b71-91f2-52f215109362%7D/commits/88193ed7a2035ef905aaea51c37934f7976907eb <br/>
 <br/>-Poke Images/ Some Components of GUI should be layered on Background (GUI Redesign) <br/> 
        <br/>Jira: https://cs3398su22borgs.atlassian.net/browse/PS-81  Bitbucket: https://bitbucket.org/cs-3398-su22-borgs/%7B0ea0e6dc-4bd9-4b71-91f2-52f215109362%7D/commits/558463653e9a4fcb4127a4c90a0875f1a01b04dd <br/>
 <br/>-Create a pokemon object & User Object within the main (StartGame) panel when a user enters their name & selects a Pokemon <br/>
        <br/>Jira: https://cs3398su22borgs.atlassian.net/browse/PS-53 Bitbucket: https://bitbucket.org/cs-3398-su22-borgs/%7B0ea0e6dc-4bd9-4b71-91f2-52f215109362%7D/commits/0448d1de478315d26e094ed6bc76440fefe1226d <br/>
 <br/>-On the main/StartGame Panel, the pokemon selection/name should appear next to the players name <br/>
        <br/>Jira: https://cs3398su22borgs.atlassian.net/browse/PS-54 Bitbucket: https://bitbucket.org/cs-3398-su22-borgs/%7B0ea0e6dc-4bd9-4b71-91f2-52f215109362%7D/commits/441852d15a02b33effa84b732901a598adcabe76 <br/>
 <br/>-Work on logic for battle in GUI <br/>
        <br/>Jira: https://cs3398su22borgs.atlassian.net/browse/PS-80 Bitbucket: https://bitbucket.org/cs-3398-su22-borgs/%7B0ea0e6dc-4bd9-4b71-91f2-52f215109362%7D/commits/53656f4253d49e57b026dca8293655f74d84673b <br/>
 <br/>-Remove player 2 move selection and name entries from gui (Adds random selection of a pokemon for player2): <br/>
        <br/>Jira: https://cs3398su22borgs.atlassian.net/browse/PS-84 Bitbucket: https://bitbucket.org/cs-3398-su22-borgs/%7B0ea0e6dc-4bd9-4b71-91f2-52f215109362%7D/commits/35a1dd8c4b69d5c31ddef8c92ee7d8991f3e2100 <br/>
 <br/>-Fix image icon to accommodate larger Pokémon gifs <br/>
        <br/>Jira: https://cs3398su22borgs.atlassian.net/browse/PS-86 Bitbucket: https://bitbucket.org/cs-3398-su22-borgs/%7B0ea0e6dc-4bd9-4b71-91f2-52f215109362%7D/commits/4d44cd4e603715c96c564ebe75f497f6a6931e6f <br/>
 <br/>-Fix bug where Jtextfields resize and mess with the way poke images/ start button appear: <br/>
       <br/>Jira: https://cs3398su22borgs.atlassian.net/browse/PS-79 Bitbucket: https://bitbucket.org/cs-3398-su22-borgs/%7B0ea0e6dc-4bd9-4b71-91f2-52f215109362%7D/commits/c20913c86b40bccb902a5bf61deed43a41b5567e <br/>
 
<br/>**Evan's Contributions:**<br/>
<br/>-Added Mewtwo object and gif<br/> 
<br/>Jira: https://cs3398su22borgs.atlassian.net/browse/PS-77 Bitbucket: https://bitbucket.org/cs-3398-su22-borgs/new-pokemon-simulator/commits/173882181f0770c59beac9422f1feb49b5706a06 <br/>
<br/>-Charmander should have four attacks/moves<br/>
<br/>Jira: https://cs3398su22borgs.atlassian.net/browse/PS-61 Bitbucket: https://bitbucket.org/cs-3398-su22-borgs/new-pokemon-simulator/commits/bde71168170a3fb3a00927a869ac1e25f7116a9f<br/>
<br/>-MrMime should have four attacks/moves<br/>
<br/>Jira: https://cs3398su22borgs.atlassian.net/browse/PS-60 Bitbucket: https://bitbucket.org/cs-3398-su22-borgs/new-pokemon-simulator/commits/951320756e0ca29ffc377920de094b56ca7a7025<br/>
<br/>-Player turn should be randomly assigned<br/>
<br/>Jira: https://cs3398su22borgs.atlassian.net/browse/PS-59 Bitbucket: https://bitbucket.org/cs-3398-su22-borgs/new-pokemon-simulator/commits/24e0f65ff47ab54ca75527c4574d17038a4c75c4<br/>
<br/>-Psyduck should have four attacks/moves<br/>
<br/>Jira: https://cs3398su22borgs.atlassian.net/browse/PS-58 Bitbucket: https://bitbucket.org/cs-3398-su22-borgs/new-pokemon-simulator/commits/c78447902930097b65ef988a21e71d6d6a442160<br/>
<br/>-Add Dragonite object and Gifs<br/>
<br/>Jira: https://cs3398su22borgs.atlassian.net/browse/PS-57 Bitbucket: https://bitbucket.org/cs-3398-su22-borgs/new-pokemon-simulator/commits/7aa01a33a38c471af671c6487d288719e5c6fbc6 <br/>

<br/>**Roldan's Contributions:**<br/>
<br/> Create methods to access Move attributes & create User choice loop. https://cs3398su22borgs.atlassian.net/browse/PS-69?atlOrigin=eyJpIjoiNDE5YTY1M2Q0MmE3NDBmN2E3ZmM5NGZmY2NlYWQxZjUiLCJwIjoiaiJ9 <br/>
<br/> Gifs should be assigned to each Pokemon object. Remove redundant Pokemon classes. Add moves to each pokemon at runtime. https://cs3398su22borgs.atlassian.net/browse/PS-67?atlOrigin=eyJpIjoiMzMzZWRiZTJmMjJiNGVkNGFhYzE0NmQyNDljMGNmMmYiLCJwIjoiaiJ9 <br/>
<br/> Create Move class, and interface. Used factory design patterns to create objects for each move by entering the name https://cs3398su22borgs.atlassian.net/browse/PS-70?atlOrigin=eyJpIjoiZGQyYmQ0Yjk1ZTU0NDM0MDg5MTU2OGRlODQxNmEwYzQiLCJwIjoiaiJ9 <br/>
<br/> Added 2 of my favortive Pokemon. Added 3D models, and stats of Gliscor & Aegislash. Added the Pokemon to the Pokemon Factory. https://cs3398su22borgs.atlassian.net/browse/PS-68?atlOrigin=eyJpIjoiNGE3OWRlNTYyZjMzNGMxOGJjZWY3ZWZmNDcwYWMyODkiLCJwIjoiaiJ9 <br/>
 


<br/>**Sams's Contributions:**<br/>
<br/>-Add dialga object and assets to render in game!<br/>
<br/>-https://cs3398su22borgs.atlassian.net/browse/PS-76?atlOrigin=eyJpIjoiODU5Zjc3YTNjMzI2NGI3OWFkMWU1NDkzZmJjYjA2Y2QiLCJwIjoiaiJ9<br/>
<br/>-Add Pikachu object<br/>
https://cs3398su22borgs.atlassian.net/browse/PS-71?atlOrigin=eyJpIjoiMjA2YTJjYWFiYjI3NDc3NWIyYjNkZDk5NTgzMDdhOGYiLCJwIjoiaiJ9<br/>
<br/>-Add Squirtle object
https://cs3398su22borgs.atlassian.net/browse/PS-72?atlOrigin=eyJpIjoiMjM3ZGRmODU2NGE3NDBhNDk4ZjExODRhNDY1OTkxZTgiLCJwIjoiaiJ9<br/>
<br/>-Add Lugia Object and assets 
https://cs3398su22borgs.atlassian.net/browse/PS-73?atlOrigin=eyJpIjoiYzk3NzU1NGYwZGFjNGUxNTkwYzBmYjIwY2ZiZGZiN2YiLCJwIjoiaiJ9<br/>
<br/>-Make a HealthDisplay for the GUI
https://cs3398su22borgs.atlassian.net/browse/PS-74?atlOrigin=eyJpIjoiNGQxZGMzM2FkYTgyNGMzYmEzOGVmZjUxNGUzMWZhMDkiLCJwIjoiaiJ9<br/>
<br/>-Create Lucario Object
https://cs3398su22borgs.atlassian.net/browse/PS-75<br/>
<br/>-Upload Assets for Lucario
https://cs3398su22borgs.atlassian.net/browse/PS-85<br/>
<br/><br/>

## Sprint Three - Next Steps 

 <br/>**Michelle:**<br/>
   <br/>Research: How to utilize multithreading and event handlers in order to continue with development of the game <br/>
   <br/>New Feature: Add battle logic to trigger dialog boxes to appear when Pokemon has fainted or won (based on health) <br/>
   <br/>New Feature: Add in logic to have a Pokemon randomly miss <br/>
   <br/>New Feature: Incorporate the ability to add a team of Pokemon and switch between them in battle <br/>
 
 <br/>**Breanna:**<br/>
  <br/>Research: How to utilize multithreading and event handlers in order to continue with development of the game <br/>
  <br/>New Feature: Implement multithreading into the gui so that it does not freeze up when battle logic is triggered <br/>
  <br/>Research: How attacks need to be passed to action listeners or event handlers in order to update health properly and not freeze game <br/>
  <br/>New Feature: Add a jLabel or other element that will display messages to the user about events that are occuring during battle such as they have been hit or their attacks missed <br/>
  <br/>Bug Fix: Fix any bugs in the game logic that exists in the GUI and ensure that players health are being updated properly <br/>

<br/>**Roldan:**<br/>
 <br/> Finish choice loop where player can choose what they want to do in the GUI <br/>
 <br/> Implement some multi-threading so each pokemon gif updates without lagging <br/>
 
 
 <br/>**Evan:**<br/>
 <br/>Research: How to add music into the Jframe<br/>
 <br/>New Feature: Add music to the game so that the Pokemon song is playing in the background (will give user mute option, could play multiple songs)<br/>
 <br/>Research: How to visuliaze an attack from another Pokemon on screen<br/>
 <br/>New Feature: Implement visual logic to where attacks made Pokemon are visualized on the screen<br/>
 <br/>New Feature: Add in logic to switch Pokemon during battle when a Pokemon hasn't fainted yet<br/>
 <br/>Bug Fix: Fix logical bugs to where player turns are still randomly assigned when a player clicks battle again<br/>
 <br/>New Feature: Add in experience points bar to show when a Pokemon is leveling up based on defeating another Pokemon in battle<br/>
 
 <br/>**Sam:**<br/>
 <br/>Research how to tie GUI objects to back end in order to track health more efficiently<br/>
 <br/>New Feature: Add dialog to the user asking when and if the user would like to use items to heal their pokemon<br/>
 <br/>New Feature: Add ability of consumables to affect pokemon health<br/>
 <br/>Research: How to add Windows Look And Feel to the look of a JProgressBar<br/>
 <br/>Bug Fix: integrate windows Look And Feel into the JProgressbar so they dont look so different in the next generation<br/>
 
 <br/><br/>
## Retrospectives for Sprint Two
<br/>**What Went Well?**<br/>
<br/>Team – With the little amount of time allotted to us, we were able to organize our code in such a way that made it easy and sensible to work with and start tying it all to a complex GUI​ <br/>
<br/>Team – We had frequent zoom meetings to better integrate individual parts to our main code.​ <br/> 
<br/>Team – We all got along great, we were all very quick to respond to each other, and we were always willing to help each other out when we had a conflict. <br/> 
<br/>Team – Everyone worked to make themselves available whenever any team member needed help or had a roadblock​ <br/>
<br/>Michelle – Being able to understand the bulk of our code enough to properly access a Pokemon object and its set moves/attributes. Started getting a better grasp on GitKraken.​ <br/>
<br/>Breanna – Being able to get all the game elements to layer on the GUI as well as create some battle logic​ <br/>
<br/>Roldan – Was able to create move class/factory so that we could objects to assign to each Pokemon. ​ <br/> 
<br/>Evan – Learned a lot about different software engineering tools (Bitbucket, Jira, GitKraken) and working with a team. Learned more about GUI and jframe and using visual graphics in programming.​ <br/> 
<br/>Sam – Fixed difficulties with integration of required software  such as Jira, GitKraken , etc. Got a grip on basic ways to program UI with Jframe!​ <br/> 
<br/>**What Can I do Better?**<br/>
<br/>Michelle – Could have dedicated more time to researching the battle logic and how to tie it into the GUI sooner. Next sprint this would be an obvious fix by dedicating initial tasks to this effort so that time does not run out.​ <br/>
<br/>Breanna – Could spend more time researching multithreading and event dispatchers so that we would not have the freezing problem in the battle element of the game. This could be accomplished next sprint by taking the time to focus on that and eliminating the freezing issue.  ​ <br/> 
<br/>Roldan— Could have done more research on java swing. This could’ve helped in tying in the backend to the front-end GUI.​ <br/> 
<br/>Evan – Could have dedicated more time to building the battle logic so that the program ran better during the demo. Could also communicate better when making commits and edits. <br/>
<br/>Sam – Could make interface of specific assigned parts more functional given more time, I.e. the healthbar couldn’t be connected to attacks and interactions due to lack of time.  <br/> 
<br/>**What Might Be Impeding Us from Performing Better?**<br/>
<br/>Overall, as a team, we could have done more research on what work exactly would need to go into connecting the backend to the frontend ​<br/>
<br/><br/>
## Acknowledgements
- This project was inspired by: https://github.com/parminpatel28/Pokemon-Simulator
- Other Resources:
<br/>- https://github.com/Jmgiacone/Pokemon<br/>
<br/>- https://github.com/RDCLder/Pokemon_Arena<br/> 

<br/>- SAMS RESEARCH RESOURCES
<br/>-https://docs.oracle.com/javase/7/docs/api/java/awt/Color.html<br/>
<br/>-https://docs.oracle.com/javase/tutorial/uiswing/components/progress.html<br/>
<br/>-https://gamedev.stackexchange.com/questions/110311/how-to-set-up-health-bar-rect-that-depends-on-health<br/>
 
<br/> BREANNAS RESEARCH RESOURCES <br/>

<br/> For Java Swing in General <br/>
https://docs.oracle.com/javase/7/docs/api/javax/swing/package-summary.html
https://docs.oracle.com/javase/tutorial/uiswing/components/frame.html
https://stackhowto.com/borderlayout-java-swing-example/
https://stackoverflow.com/questions/6325384/adding-multiple-jpanels-to-jframe
https://stackoverflow.com/questions/12899535/jlabels-into-jframe
https://stackoverflow.com/questions/22436779/how-to-add-imageicon-to-a-jlabel
https://www.tutorialspoint.com/swingexamples/using_buttons.html
https://stackoverflow.com/questions/30369197/switch-between-multiple-jframes
https://stackoverflow.com/questions/30507494/how-to-set-font-color-of-a-label-in-java-under-rgb-format#:~:text=If%20you%20try%20to%20change%20the%20color%20of,use%20it%20like%20yourLabel.setForeground%20%28Color.black%29%20%2F%2FFor%20example%20black.
https://docs.oracle.com/javase/tutorial/uiswing/events/actionlistener.html

<br/>EVAN'S RESEARCH SOURCES<br/>
<br/>https://www.tutorialspoint.com/random-number-generator-in-java#:~:text=To%20generate%20random%20numbers%20in%20Java%2C%20use.%20import,to%2020%2C%20write%20it%20as.%20nextInt%28%2020%20%29%3B<br/>
<br/>https://stackoverflow.com/questions/16867976/how-do-you-add-music-to-a-jframe<br/>
<br/>https://stackoverflow.com/questions/14160374/how-to-insert-an-animated-gif-in-java<br/>
<br/>https://www.javatpoint.com/java-actionlistener<br/>

<br/> For jLayered Pane <br/>
<br/> https://docs.oracle.com/javase/7/docs/api/javax/swing/JLayeredPane.html <br/>
<br/> https://docs.oracle.com/javase/tutorial/uiswing/components/layeredpane.html <br/>
<br/> https://www.educba.com/jlayeredpane/ <br/>
<br/> https://stackoverflow.com/questions/3067426/how-to-place-images-on-top-of-each-other-in-java <br/>


     
## Contact
Created by Roldan Cortes, Breanna Graves, Evan Faust, Sam Lowe and Michelle Sowell


<!-- Optional -->
<!-- ## License -->
<!-- This project is open source and available under the [... License](). -->

<!-- You don't have to include all sections - just the one's relevant to your project -->



