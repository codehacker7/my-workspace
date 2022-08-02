
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	int[][] firstarray = {
			
			{14,11,13,12},
			{18,15,13,13},
			{19,16,15,17}
	};
	
	System.out.println("The sum of the first column in the firstarray is: "+sumCol(firstarray,1));
	
	}

public static int sumCol(int[][] m,int colIdx) {
	
			int added =0;
	for(int c=colIdx;c<colIdx+1;c++) {
		for(int r=0;r<m.length;r++) {
			added= added+ m[r][c];
		}
	}
	return added;
}
}
