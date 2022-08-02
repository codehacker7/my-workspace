
public class reverse1darray {

public static void main(String[] args) {
	
	int[] x = {1,2,3,4,5};
	
	char[][] answers = {
			
			{'a','b','c','d'},
			{'d','a','c','a'}
	}
	;

	char[] keys = {'a','c','d','e'};

	int count =0;
	
	for(int i=0;i<answers.length;i++) {
		for(int j=0;j<keys.length;j++) {
				
			if(answers[i][j]==keys[j]) {
				count++;
			}
		
		
		}
	
			System.out.println("Scorer of student "+i+"is "+count);
				count =0;
				
				
	}
		
								



}

}
