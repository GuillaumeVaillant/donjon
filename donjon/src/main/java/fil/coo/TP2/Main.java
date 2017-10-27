package fil.coo.TP2;

import java.util.Scanner;

import characters.Player;
import initialisationGame.MinimalInitialisation;


public class Main 
{
    public static void main( String[] args )
    {	
    	Scanner temp=new Scanner(System.in);
    	InitialisationGame init=new MinimalInitialisation();
    	Room initialRoom=(init.startingRoom());
    	Player player=init.startingPlayer();
    	AdventureGame game=new AdventureGame(initialRoom,player);
    	game.play(player);
    	temp.close();
    }
    
}
