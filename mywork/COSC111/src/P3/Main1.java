package P3;

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





/* This file includes:
 * 	1. Solution to P1
 *  2. Questions for P2. Comments starting with REQ represent the questions.
 *  
 * Features:
 * 	- We have exactly 3 players: player0, player1, and player2
 *  - We have exactly 3 questions, one question for each player
 *  - User can play many rounds of the game. 
 * 
 * Focus: 
 * 	- while loops
 * 
 * Aim:
 * 	- Allow user to play again after the end of the game (using while loop)
 *  - Validate user's input (using while loop)
 */

public class Main1 {
	static Game game;	
	public static void main(String[] args) {
	
		//REQ1:	This is the beginning of the game loop (that will re-run all the game if the user wants to play again).
		int count = 0 ;
		while (count < 1) {
	
		game = new Game();		//This statement resets the game	
		
		//Create three questions and their answers
		
		
		String[] questions = {"Who is the owner of Tesla?","Where is Taj Mahal?","Who is the best rockstar of this decade?"};
		String[] answers = {"Elon Musk","India","Greg"};
		
		
	
		//Add 3 players to the game
		
		int players = game.askForInt("How many players" , 0, 3);
		
		for(int i=0;i<players;i++) {
			String name = game.askForText("What is player "+(i)+" name");
				game.addPlayer(name);
		
		}
		
		for(int i=0;i<players;i++) {
			game.setCurrentPlayer(i);
			String answer = game.askForText(questions[i]);
			if(answer.equals(answers[i]))
				game.correct();
			else 
				game.incorrect();
		}
	
		//Ask each player a question and change his/her score based on the given answer
				
		//REQ1 (cont.):	
		//		- Ask the user if they want to play again (use game.askForText() and store the input in a variable)
		//String Q = "Do you want to play again? ";
		String repeat = game.askForText("Do you want to play again? ");
			repeat = repeat.toUpperCase();
	
		//		- Make sure you get valid input (i.e., it is not null, and it is either "Y" (for yes) or "N" (for no). Your code should ignore the case of the input (small or capital).
	   
			while(!(repeat.equals("Y") || repeat.equals("N"))) {
				repeat = game.askForText("Invalid input. Try again.");
				repeat = repeat.toUpperCase();
				
			}
				
			if (repeat.equals("Y") )
	    	count--;
	    else 
	    	System.exit(1); 
	   
	    	    		}
}
}	
	

