import java.util.Arrays;

public class MidtermSolutions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	int[] arr = {1,2,2,3,4,5,4,2};
	
	Arrays.sort(arr);									//{2,2,2,2,3,4,4,5}
	
	int[] temp = new int[arr.length];
	
	int j =0;
	
	for(int i=0;i<arr.length-1;i++) {
		
			if(arr[i]==arr[i+1]) {
				
				continue;
			}
			else {
			
			System.arraycopy(arr,i,temp,j,1);
			j++;
			}
		
}
		int[] temp1 = new int[j+1];	
		System.arraycopy(temp, 0, temp1, 0, j);
	
	if(arr[arr.length-2]!=arr[arr.length-1]) {
			
			temp1[temp1.length-1] = arr[arr.length-1];
		}	
	
	System.out.println(Arrays.toString(temp1));
	
}}
