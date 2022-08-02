
import java.util.Arrays;

public class Randomvaluepractisequestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int[] a = getRandomArray(3,6,15);
	
				System.out.println(Arrays.toString(a));
			
	
	
	}


		public static int[] getRandomArray(int n,int from,int to) {
			
				int[] arr = new int[n];//{0,0,....,0}
				
					for(int i=0;i<arr.length;i++) {
						arr[i]=  (int)(from + Math.random() *(to-from+1));
					
					
					}
				
				
				
				return arr;
		
		
		
		
		
		}









}
