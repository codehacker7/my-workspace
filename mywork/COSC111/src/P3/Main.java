package P3;
//import P2.Game;
public class Main {
//static Game game;	
	public static void main(String[] args) {
	//REQ1:	This is the beginning of the game loop (that will re-run all the game if the user wants to play again).
		Game game = new Game();		//This statement resets the game	
		String user;
		int setcounter =0;
		while(setcounter<1) {
		//Create three questions and their answers
			String[] questions = new String[3];
			String[] answers = new String[3];
			String[] name = new String[3];
			String[] useranswer = new String[3];
			
			questions[0] = "Which geometrical shape is generally used for stop signs";
			answers[0] = "Octagan";
			questions[1] = "How many colours are there in a rainbow";
			answers[1]  = "7";
			questions[2] = "Which American president appears on 1 dollar bill";
			answers[2]  = "George Washington";
		
		//Add 3 players to the game
			
			int numbers = game.askForInt("How many players",1,3);
		
				for(int i=0;i<numbers;i++) {
					name[i]= game.askForText("What is player "+(i)+" name");
					game.addPlayer(name[i]);
				}
		
					for(int i=0;i<numbers;i++) {
						game.setCurrentPlayer(i);
						useranswer[i] = game.askForText(questions[i]);
			
							if(useranswer[i].equals(answers[i]))
								game.correct();		//display "Correct", increment score, change frame color to green
			
						   else
							   game.incorrect();	//display "incorrect", change frame color of player to red
							}
			
			
			user = game.askForText("Do you want to play again??");
		    user = user.toUpperCase();  
		
		    while(!(user.equals("Y")  || user.equals("N"))) { 
			user = game.askForText("Error please retry typing the input");
			user = user.toUpperCase();
			}
		
		   if(user.equals("Y")) {
		    setcounter--;
		    game = new Game();	
		    }
		    
		   else 
		    System.exit(1);

		
		
		
		
		
		
		
		}}}


		