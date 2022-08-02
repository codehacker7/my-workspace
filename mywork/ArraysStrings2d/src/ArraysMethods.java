import java.util.Arrays;

public class ArraysMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	
	int[][] places = {
			{1,2,23},
			{4,5,6},
			{7,8,9}
	
	};
	
	randomizevalues(places);
	print2darray(places);
	
	}

	public static void randomizevalues(int[][] m) {
		
		for(int r=0;r<m.length;r++) {
			for(int c=0;c<m[r].length;c++) {
				m[r][c]= (int)(Math.random()*10);
			}
		}
			
	}

	
public static void print2darray(int[][] y) {
		
		for(int r=0;r<y.length;r++) {
			System.out.println(Arrays.toString(y[r]));
				
			}
		}
			
	}


