import java.util.Arrays;

public class Practisequestion {
	public static void main(String[] args) {
	
		
		int[][] matrix = { 
				{1,2,3},
				{4,5,6},
				{7,8,9}
				
				};
	
	System.out.println(Arrays.toString(matrix[2]));
	System.out.println(matrix.length);
	System.out.println(matrix[0].length);
	
	//Ragged Arrays
	
	int[][] triangularArrays = {
	
			{1,2,3,4,5},
			{2,3,4,5},
			{3,4,5},
			{4,5},
			{5}
			
	};
	
	// 2nd way of creating the ragged arrays
	int[][] m2 = new int[4][];
	m2[0]=new int[3];
	m2[1]=new int[2];
	m2[2]= new int[4];
	m2[3]=new int[5];
	// loop used for printing all the elements inside the traingular arrays
	for(int r=0;r<triangularArrays.length;r++) {
		for(int c =0;c<triangularArrays[r].length;c++){
			System.out.print(triangularArrays[r][c]);
		}
		System.out.println();
	
	}
	
	}
	

	public static void RandomizeValues(int[][] m,int value) {
		
		for(int r=0;r<m.length;r++) {
			for(int c=0;c<m[r].length;c++) {
				m[r][c] = value;
			}
		}
	
	}














}
	

