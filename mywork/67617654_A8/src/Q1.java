import java.util.Arrays;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] firstarray = {
				{14,11,13,12},
				{18,15,13,13},
				{19,16,15,17}
		
		};
		int[][] secondarray = {
				{54,53,51,52},
				{51,59,52,56},
				{53,54,52,58}
		};
		int[][] added = addMatrix(firstarray,secondarray);
		
		if(added!=null) {
		for(int r=0;r<added.length;r++) {
		System.out.println(Arrays.toString(added[r]));
	}	}
	
}
	public static int[][] addMatrix(int[][] a,int[][] b){
		
		if(a.length!=b.length) {
			return null;
		}
			for(int r=0;r<a.length;r++) {
				int d = a[r].length;
				int e = b[r].length;
				
				if(d!=e) {
				System.out.println("Error this is not supported");
				return null;
				}
	}
		int[][] added = new int[a.length][];
			 for(int r=0;r<added.length;r++) {
			added[r]=new int[a[r].length];
			}
		  for(int r=0;r<a.length;r++) {
			for(int c=0;c<a[r].length;c++) {
			added[r][c]= a[r][c] + b[r][c];
			}
			}
		return added;
	}
}
