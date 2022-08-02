import java.util.Arrays;

public class ExperimentationArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int[][] m = {
				
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		for(int r=0;r<m.length;r++) {
			System.out.println(Arrays.toString(m));
		}
		
		// try to ffind sum of every column in an 2d array
		
		int colsum =0;
		
		for(int c=0;c<3;c++) {
			for(int r=0;r<3;r++) {
				colsum+=m[r][c];
			}
		}
		
		int rowtotal =0;
		for(int r=0;r<3;r++) {
			for(int c=0;c<3;c++) {
				rowtotal+=m[r][c];
			}
				System.out.println(rowtotal);
		}
		
		
		
		
		
		
	}

}
