import java.util.Arrays;

public class Midtermquestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
				int[] arr = {1,2,4,5,2,4};
			
					int min =0; int temp=0 ;
				
				for(int i=0;i<arr.length;i++) {  // now i is equal to 1
					
					min = i;
					
					for(int j=i+1;j<arr.length;j++) {  // 
						
					if(arr[min]>arr[j]) {
						min = j;
					}
					
					
					}
						
				
				temp = arr[i];
				arr[i]= arr[min];
				arr[min] =  temp;
				}
				
				System.out.println(Arrays.toString(arr));
				
				
				
				
				
				
				
				
				
				
			/*	int[] temp = new int[arr.length];
				int j =0;
			//	int x =0;
				for(int i=0;i<arr.length-1;i++) {
					
				if(arr[i]!=arr[i+1]) {
					temp[j]=arr[i];
					j++;
				}
				
					}
		
				temp[j]=arr[arr.length-1];
			int[] temp1 = new int[j+1];	
		
			System.arraycopy(temp, 0, temp1, 0, temp1.length);
	
				System.out.println(Arrays.toString(temp1));*/
	}

}
