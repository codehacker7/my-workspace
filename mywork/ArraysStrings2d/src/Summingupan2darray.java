
public class Summingupan2darray {
	public static void main(String[] args) {
		
		int[][] m = {
				
		
				{1,2,3},
				{4,5,6},
				{7,8,9}
		
		
		};
		/*int sum =0;
		
		for(int r=0;r<m.length;r++) {
			for(int c=0;c<m[r].length;c++) {
				sum+=m[r][c];
			}
		
				System.out.println(sum);
				sum=0;
		}*/
		
		int colTotal = 0;
		for (int c = 0; c < m[0].length; c++) {
			for (int r = 0; r < m.length; r++)
			colTotal += m[r][c];
			
			System.out.println("Sum for col #"+c+" is "+ colTotal);
			colTotal =0;
		}
		
		
		
		
		
		
	}
}
