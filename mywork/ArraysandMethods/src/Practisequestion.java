import java.util.Arrays;

public class Practisequestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3};
		
		double[] arr1 = {1.3,1.8,2.4,4.2};

		int kavyansh =maximum(arr);
			
		System.out.println("The maximum is "+kavyansh);
		
		System.out.println("The minimum among the above elemets is "+minimum(arr));
		
		
		
		
		
	}

	public static int maximum(int[]  a) {
		
		       a[1]=98;
		
			int max = a[0];
			
				for(int i=0;i<a.length;i++) {
					
					if(a[i]>max) {
						max =a[i];
					}
				
				}
	
	
				return max;
	}

		public static int minimum(int[] a) {
			
				int min = a[0];
		
					for(int i=0;i<a.length;i++) {
						if(a[i]<min) {
							min=a[i];
						}
					}
					
		
		
					return min;
		}	
		
		
		public static double minimum(double[] a) {
			
			double min = a[0];
	
				for(int i=0;i<a.length;i++) {
					if(a[i]<min) {
						min=a[i];
					}
				}
				
	
	
				return min;
	}	
		
		
		public static double maximum(double[]  a) {
			
		       a[1]=98;
		
			double max = a[0];
			
				for(int i=0;i<a.length;i++) {
					
					if(a[i]>max) {
						max =a[i];
					}
				
				}
	
	
				return max;
	}





































}
