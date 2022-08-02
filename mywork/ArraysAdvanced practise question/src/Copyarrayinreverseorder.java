import java.util.Arrays;

public class Copyarrayinreverseorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums= {1,2,3,4};
			int[] arr= new int[4];
			
			for(int i=0;i<nums.length;i++) {
					arr[3-i]=nums[i];
			}
			System.out.println(Arrays.toString(arr));
	
		
	
	
	
	}

}
