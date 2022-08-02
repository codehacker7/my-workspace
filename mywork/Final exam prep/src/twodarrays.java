
public class twodarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] x  = {
		
				{1,2,3,4,5,6,7,7},
				{4,5,8,9},
				{7,8,9,8,7,9}
				
		};
		
		
	
	int largestelement =0;
	
	int index =0;
	
	for(int r=0;r<x.length;r++) {
		for(int c=0;c<x[r].length;c++) {
			
	
		if(x[r][c]>largestelement) {
			largestelement = x[r][c];
					index = c;
		}
			}
	
	}
	
	System.out.println("The largest element is: "+largestelement);
	System.out.println("The index of largest element is: "+index);
	
	
	
	
	
	
	
	
	
	}

public static void randomshuffle(int[][] p) {
	

	for(int r=0;r<p.length;r++) {
		for(int c=0;c<p[r].length;c++) {
			int x = (int)(Math.random()*3);
			int y = (int)(Math.random()*3);
			int temp = p[r][c];
			p[r][c]=p[x][y];
			p[x][y]=temp;
			
		}
	}
	
	for(int r=0;r<p.length;r++) {
		for(int c=0;c<p[r].length;c++) {
			System.out.print(p[r][c]+" ");
		}
		System.out.println();
	}





}










}
