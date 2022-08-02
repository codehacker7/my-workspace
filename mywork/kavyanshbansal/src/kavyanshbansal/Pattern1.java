package kavyanshbansal;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int rows=1;rows<=4;rows++) {
			for(int spaces=1;spaces<rows;spaces++) {
				System.out.print(" ");
			}
				for(int columns=4;columns>=rows;columns--) {
					System.out.print("*");
				}
			
	             	System.out.println();
		}
		

	}

}
