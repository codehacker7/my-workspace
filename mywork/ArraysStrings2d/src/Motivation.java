import java.util.Arrays;
import java.util.Scanner;

public class Motivation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

	
		
	
		int[][] places=new int[7][7] ;
		
		for(int c=0;c<7;c++) {
				for(int r=0;r<7;r++) {
					places[r][c]=in.nextInt();
			}
				
		}
	
	
		for(int y=0;y<places.length;y++) {
			System.out.println(Arrays.toString(places[y]));
				
			}
		
	
	
	
	}




	
	

}
