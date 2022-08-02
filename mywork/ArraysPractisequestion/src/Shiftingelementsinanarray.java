
public class Shiftingelementsinanarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar= {1,2,3,4};
	
		
		
			int temp =ar[0];
			
			for(int i=1;i<ar.length;i++) {
				ar[i-1]=ar[i];
				
			}
	
	              ar[ar.length-1]=temp;
	
	              	for(int i=0;i<ar.length;i++) {
	              		System.out.print(ar[i]);
	              	}
	
	
	
	
	
	}

}
