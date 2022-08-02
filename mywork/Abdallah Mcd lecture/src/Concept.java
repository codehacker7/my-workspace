import java.util.Arrays;

public class Concept {

	public static void main(String[] args) {
		

		int[] nums = {1,2,3,4};
		int[] arr = new int[nums.length];
		
		for(int i=0; i<nums.length;i++) {
			arr[3-i]=nums[i];
		}
		System.out.println(Arrays.toString(arr));
		
	}
	

}
