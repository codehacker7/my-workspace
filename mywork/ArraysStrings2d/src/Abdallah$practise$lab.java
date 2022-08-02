
public class Abdallah$practise$lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[][] x = {
				
				{2,3,4,5,6,3,4,45},
				{1,4,5},
				{3,1}
				};
		
		int sum =0;
		int maxsum =0;
		int largestelement =0;
		int index =0;
		int rownumber =0;
		int rownumber1 =0;
		int t =0;
		int t1=0;
		int t2=0;
		
		for(int r=0;r<x.length;r++){
			for(int j=0;j<x[r].length;j++) {
				sum+=x[r][j];
			}
			if(sum>maxsum) {
				maxsum = sum;
					rownumber = r;
					sum =0;
			}
}
		
		for(int r=0;r<x.length;r++){
			for(int j=0;j<x[r].length;j++) {
				
				if(x[r][j]>largestelement) {
					largestelement = x[r][j];
						index =j;
						rownumber1 = r;
				}
			
			}
		}
		
			System.out.println("Row which has largest sum is "+(rownumber+1));
			System.out.println("The smallest  index of largest element is "+index+" in the row number "+(rownumber1+1));
		
		
			for(int i=0;i<1;i++) {
				for(int j=0;j<x[i].length;j++) {
					
						t++;
					
				}
				}
			
			for(int i=1;i<2;i++) {
				for(int j=0;j<x[i].length;j++) {
					
					t1++;
				
				}
			}
			
			
			for(int i=2;i<3;i++) {
				for(int j=0;j<x[i].length;j++) {
					t2++;
				
				}
			}
			
			int min =0;
			
			if(t<t1 && t<t2) {
				min =t;
			}
			
			else if(t1<t && t1<t2) {
				min =t1;
			}
			else if(t2<t && t2<t1) {
				min =t2;
			}
			
			
			
			
			
			
			
			
			
			for(int i=0;i<x.length;i++) {
				for(int j=0;j<min;j++) {
					
					int i1 = (int)(Math.random()*x.length);
					int j1 = (int)(Math.random()*min);
					
					int temp = x[i][j];
					x[i][j]= x[i1][j1];
					x[i1][j1]=temp;
			
				
				}
			}
			
			
			
			
			for(int r=0;r<x.length;r++){
				for(int j=0;j<x[r].length;j++) {
					
				System.out.print(x[r][j]);
				
				
				}
			System.out.println();	
			
			}
			
			
			
			
		
	}

}
