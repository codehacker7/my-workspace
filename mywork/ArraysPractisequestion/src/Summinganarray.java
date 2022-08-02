
public class Summinganarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar = {1,12,13,14};
		
		int sum =0;
		
		for(int i=0;i<ar.length;i++){
			sum+=ar[i];
		}
		System.out.println(sum);

			
		int max = ar[0];
		
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>max) {
				max=ar[i];
			}
		}
	System.out.println("The maximum between the given numbers is "+max);
	
	
	
	
	
	
	
	
	}

}
