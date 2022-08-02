
import java.util.Arrays;

public class PractiseforMidterm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	int[][] m = {
			{1,2,3},
			{3,4,5},
			{4,5,6},
			{7,8,9}
			
	};
	
	System.out.println(m.length);
	System.out.println(m[0].length);
	System.out.println();
	for(int r=0;r<m.length;r++) {
		for(int c=0;c<m[r].length;c++) {
			System.out.print(m[r][c]+" ");
		}
			System.out.println();
	
	}
	
	
	// concept of ragged arrays
	int[][] m1 = new int[3][];
	
	m1[0]=new int[4];
	m1[1]=new int[5];
	m1[2]=new int[8];
	 
	// just printing a ragged array
	
	/*for(int r=0;r<m1.length;r++) {
		for(int c=0;c<m1[r].length;c++) {
			System.out.print(m1[r][c]+" ");
		}
			System.out.println();
	
	
	
	}*/
	
	//2nd way of printing ragged arrays
			for(int r=0;r<m1.length;r++) {
				System.out.println(Arrays.toString(m1[r]));
			}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}}
