
public class Practisequestion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		char [][] studentanswers = {
				
				{'A','B','A','C','C','D','E','E','A','D'},
				{'D','B','A','B','C','A','E','E','A','D'}
		
			};
		
			char[] keys =   {'D','B','D','C','C','D','A','E','A','D'};
			
			int score =0;
			
			for(int r=0;r<studentanswers.length;r++) {
				for(int c=0;c<studentanswers[r].length;c++) {
					if(studentanswers[r][c]==keys[c]) {
						score++;
					}
					
				}
			
				System.out.printf("student%d's score : %d \n ",r,score);
				score =0;
				
				
				int x =5;
				String s = (x%2==0)?"even":"odd";
			}
		
		
	
	
	
	
	
	}

}
