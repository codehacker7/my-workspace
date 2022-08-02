
public class Concept2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
	}


	public static int[][] get2darrayy(int rows,int columns,int value) {
		
	
		int[][] m = new int[rows][columns];
		
	for(int r=0;r<m.length;r++) {
		for(int c=0;c<m[r].length;c++) {
			m[r][c]=value;
		}
	}
			return m;
	
	}

	public static void Print2Darray(int[][] m) {
		
		for(int r=0;r<m.length;r++) {
			for(int c=0;c<m[r].length;c++) {
				System.out.print(m[r][c]);
			}
			System.out.println();
		}
		
	}






















}
