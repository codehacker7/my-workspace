package P2;


/* This file includes:
 * 	1. Solution to P2
 *  2. Questions for P3. Comments starting with REQ represent the questions.
 *  
 * Features:
 * 	- We have from 1 to 3 players
 *  - We have exactly 3 questions, one question for each player
 *  - User can play many rounds of the game. 
 * 
 * Focus: 
 * 	- 1-D arrays
 *  - for loops
 * 
 * Aim:
 * 	- Reduce code redundancy by the use of arrays and for loops 
 */

public class Main {
	///static Game game;	
	public static void main(String[] args) {

		//REQ1:	This is the beginning of the game loop (that will re-run all the game if the user wants to play again).
		Game game = new Game();		//This statement resets the game	
		String user;
		int setcounter =0;
		while(setcounter<1) {
		//Create three questions and their answers
		
			
			
		String q0 = "Which geometrical shape is generally used for stop signs";
		String a0 = "Octagan";
		String q1 = "How many colours are there in a rainbow";
		String a1 = "7";
		String q2 = "Which American president appears on 1 dollar bill";
		String a2 = "George Washington";
		
		//Add 3 players to the game
		String name = game.askForText("What is player 0 name?");
		game.addPlayer(name);
		String name1;
		name1 = game.askForText("What is player 1 name?");
		game.addPlayer(name1);
		String name2;
		name2 = game.askForText("What is player 2 name?");
		game.addPlayer(name2);
		
		//Ask each player a question and change his/her score based on the given answer
		game.setCurrentPlayer(0);
		String answer = game.askForText(q0);
		if(answer.equals(a0))
			game.correct();		//display "Correct", increment score, change frame color to green
		else
			game.incorrect();	//display "incorrect", change frame color of player to red

		game.setCurrentPlayer(1);
		String answer1 = game.askForText(q1);
		if(answer1.equals(a1))
			game.correct();		
		else
			game.incorrect();	
		
		game.setCurrentPlayer(2);
		String answer2 = game.askForText(q2);
		if(answer2.equals(a2))
			game.correct();		
		else
			game.incorrect();	
		
		 user = game.askForText("Do u want to play again??");
		   user = user.toUpperCase();  
		
		
		

		    while(!(user.equals("Y")  || user.equals("N"))) { 
				user = game.askForText("Error please retry typing the input");
				user = user.toUpperCase();
			}
		
		    	if(user.equals("Y")) {
		    		setcounter--;
		    		game = new Game();	
		    	}
		    	
		    	
		    	else {
		    		System.exit(1);
		    	}
		
		
		
		}
		
		//REQ1 (cont.):	
		//		- Ask the user if they want to play again (use game.askForText() and store the input in a variable)
		//		- Make sure you get valid input (i.e., it is not null, and it is either "Y" (for yes) or "N" (for no). Your code should ignore the case of the input (small or capital).
		//		  Show an error message if the input is invalid and ask again for Y or N.
		//		- Repeat the game again if the user answered "Y" or "y", otherwise terminate the program.
			
			//This statement terminates the program

	}
}

		