package P4;

/* This file includes:
 * 	1. Solution to P3
 *  2. Questions for P4. Comments starting with REQ represent the questions.
 *  
 * Features:
 * 	- We have from 1 to 3 players
 *  - We have many questions. Each player may be asked more than one question.
 *  - User can play many rounds of the game. 
 * 
 * Focus: 
 * 	- Arrays and Methods
 * 
 * Aim:
 * 	- Organize code and avoid code redundancy by the use of methods
 */

public class Main {				
	static Game game;			
	
	//Two arrays for questions and answers (both are global, i.e., accessible by all code in the class).
	//REQ1:	Replace array values with real questions/answers
	static String[] questions = {"Which geometrical shape is generally used for stop signs","How many colours are there in a rainbow","Which American president appears on 1 dollar bill"};
	static String[] answers = 	{"Octagan","7","George Washington"};
	
	public static void main(String[] args) {
		String ans="";
		do{								
			//Reset the game
			game = new Game();			
			
			//Get number of players (from 1 to 3)
			int numPlayers = game.askForInt("How many players", 1, 3);

			//Add up to 3 players to the game
			for (int i = 0; i < numPlayers; i++) {
				String name = game.askForText("What is player " + i + " name?");
				game.addPlayer(name);				
			}
			
			//REQ2:	Call a method to shuffle questions and answers. For that, you need to create a method with the header: void shuffleQuestions();
			 shuffleQuestions();
			//REQ3:	- Calculate the maximum number of rounds (each player is asked one question per round). The maximum number of rounds should be equal to the number of available questions divided by numPlayers. Store this value in a variable maxRounds
			//	- Ask the user about the number of rounds. The value read from the user should not exceed maxRounds. Store this value in a variable numRounds.
			//		- Ask each player the next unanswered question (e.g., player 0 gets the first question. If it is answered correctly, then player1 gets the next question in the array, otherwise player1 gets the same question again, and so on). 
			// 		  Assume that an incorrectly answered question will keep popping up until it is correctly answered or we finish all the rounds.
			
			//		  Hint: you need to create a for loop that repeats the below code block numRounds times.
			//		  Hint: you need to have a variable that keeps track of the next question to be offered. 
		
			 int maxrounds = (questions.length)/(numPlayers);
			 int numRounds= game.askForInt("How many rounds", 1, maxrounds);
			 	int x =0;
				for(int i=0;i<numRounds;i++) {
				for(int i1=0;i1<numPlayers;i1++) {
					game.setCurrentPlayer(i1);
					String useranswer = game.askForText(questions[x]);
						if(useranswer.equals(answers[x])) {		
						game.correct();	
							x++;
							}
				else{
					game.incorrect();
					if(i1<numPlayers-1) {               
						game.setCurrentPlayer(i1+1);	
						useranswer = game.askForText(questions[x]);  	
						if(useranswer.equals(answers[x])) {	
							game.correct();	
							x++;				
}
						else {
			game.incorrect();	}
	}					
			i1++;
		}
	}}
	//Do you want to play again? make sure you get valid input
			ans = game.askForText("Play again? (Y/N)"); 
			while(ans != null && !ans.toUpperCase().equals("Y") && !ans.toUpperCase().equals("N"))
				ans = game.askForText("Invalid input. Play again? (Y/N)");
				
				}while(ans.toUpperCase().equals("Y"));	//play again if the user answers "Y" or "y"
System.exit(1); 	//This statement terminates the program
			}
				public static void shuffleQuestions() {
				for(int i=0;i<questions.length;i++) {
				int x = (int)(Math.random()*questions.length);
				String temp = questions[i];
				questions[i]= questions[x];
				questions[x]= temp;
				String temp1 = answers[i];
				answers[i]= answers[x];
				answers[x]= temp1;
			
}
}}

