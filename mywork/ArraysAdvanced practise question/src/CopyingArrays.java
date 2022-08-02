import java.util.Arrays;

public class CopyingArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// this is a method of copying arrays with the help of for loop
		
		int[] nums = {1,2,3,4};
		int[] arr= new int[nums.length];
		for(int i=0;i<nums.length;i++) {
			arr[i]=nums[i];
		}
			System.out.println(Arrays.toString(arr));
	}

}
