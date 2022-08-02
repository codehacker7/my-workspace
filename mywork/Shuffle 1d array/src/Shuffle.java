import java.util.Arrays;

public class Shuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	int[] arr = {1,2,3};
	String[] answers = {"a","b","c"};
	
	
	
		for(int i=0;i<arr.length;i++) {
			
		int x = (int)(Math.random()*arr.length);
		
		int temp = arr[i];
		
		arr[i]= arr[x];
		arr[x]= temp;
		
		String temp1 = answers[i];
		
		answers[i]= answers[x];
		answers[x]= temp1;
		
		
		
		
		}
	
	
	System.out.println(Arrays.toString(arr));
	
	System.out.println(Arrays.toString(answers));
	
	
	
	}

	
	
	
}
