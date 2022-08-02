import java.util.Arrays;

public class ArraycopyVsforloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1,2,3,4,5};
		int[] arr = new int[2*nums.length];
		
		for(int i=0;i<nums.length;i++) {
			arr[2*i]=nums[i];
		}

		System.out.println(Arrays.toString(arr));
	}

}
