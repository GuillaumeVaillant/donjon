README 
------
 
Group 1 L3 MIAGE 
TP2 : DONJON

AUTHORS : 
---------

  - Fabien Vantorre 
  - Feriel Ouarkoub

 I- Presentation of the project :
---------------------------------


Donjon game :

In this game the aim of the player is to find the exit room ,but to move from a room to another he will have to kill all the monsters in the current room .
When a player attacks a monster this one can ripost by attacking back the player making him loose some Life points , the player can also come across a healer it's a character that the player can attack and as a result the healer rises the number of life points  of all the characters in the room whether it's a player or a monster . 
The monster can not attack a player unless it's the player who started the fight . 
In order to help the player , in each room he can find items such as (bourse,bandit,elixir..) that can help him rise (gold points ,life points..) Some items can be stocked by the player and some others are inevitably used when the player takes them.
After each action the player makes , it will be proposed to him to choose the next action he's willing to execute .
The game is over when the player attempts one of the exitings rooms or if the player looses all his life points .


 
II- How To ? 
------------
- Everything in  in TP2 folder :

- To recover our project from git   :
git clone git@gitlab-etu.fil.univ-lille1.fr:ouarkoub/donjon.git
- To generate javadoc :
mvn javadoc:javadoc
- To generate the .jar file  :
mvn -X package
- To execute jar :
cd target
java -jar donjon.jar




III- Presentation of the code :
-------------------------------

- Our Conception of the game tends to be as generic as possible so that it could be easier to make the game progress or to make changes on it .
- In order to test all the fonctionalities of the game we have creatd a simple exemple of the game (with only two rooms) but where we can test all the methods (actions,using items ,adding monsters ....).
- This interface has methods that builds room,player,monsters and items .
- We've implemented this simple test version in a package but the user is free to create  other versions easily without modifing all the code .
- The main method builds a game based on an init game which is an interface , and execute the methode play which is a a succcession of actions the player chooses to make as long as the game isn't finished .
- All of the monsters ,player and healer are characters .
- The Item class is an abstract class which instantiate many items .
- We've created a new character Healer which extends monster and the same way we can add new kinds of monsters creaturs ....
- Items has an attribute which indicate whether the item can be stocked or not , if he isn't the player consumes that item immediately.
- Creation of our own Exception (AlreadyHasANeighborsException)
  

VI- Appreciations : 
------------------- 

- All what needed to be done has been done .
- The documentation and the code are implemented in english .
- The tests tries all the possibles situations of the game , and simulate the answers of the player when needed (choosing an action ....)


What have we add to the project ? 
----------------------------------

- The game is as generic as possible .
- An inventory has been added to stock the items . 
- Other kind of items added (elixirStrengthToLife , healer...).
- Creation of our own class of excetion according to the project needs .
- Every methods we have implemented is as simple as possible and it has a uniq responsability what mades our code easier to understand . 
- We have Put into practise all the smatterings learned from the lessons (lookup,interface,personnal exception ....).







