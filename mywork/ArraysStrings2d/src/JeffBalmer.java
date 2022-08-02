import java.util.Scanner;

public class JeffBalmer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner  r = new Scanner(System.in);
		
		
		
		System.out.println("Enter the rows and columns you want in 2d array");
		int[][] x1 = new int[r.nextInt()][r.nextInt()];
		
		// this code takes user input for the array
		
		for(int i=0;i<x1.length;i++) {
			for(int j=0;j<x1[i].length;j++) {
				System.out.print("Enter the array: ");
					x1[i][j]=r.nextInt();
			}
		}
		
		
		// you can check this code by uncommenting it out if you are not getting the user input thing
	
	/*	int[][] x1 = {
				
				{1,2,3},
				{4,5,6},
				{7,8,1}
		
		
		};*/
		
		
		
		
		// this code will just shuffle arrray elements
		
		
		for(int i=0;i<x1.length;i++) {
			for(int j=0;j<x1[i].length;j++) {
				
				int i1 = (int)(Math.random()*x1.length);
				int j1 = (int)(Math.random()*x1[i].length);
				
				int temp = x1[i][j];
				x1[i][j]= x1[i1][j1];
				x1[i1][j1]=temp;
		
			
			}
		}
		// this code is used to print the arrays
		

		for(int i=0;i<x1.length;i++) {
			for(int j=0;j<x1[i].length;j++) {
					System.out.print(x1[i][j]);
		
			}
			System.out.println();
		}
	
	}

}
