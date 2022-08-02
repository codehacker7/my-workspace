import java.util.Arrays;

public class System$arraycopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
			int[] nums = {1,2,3,4};
			int[] arr = new int[4];
			System.arraycopy(nums, 2, arr, 0,2);
			System.out.println(Arrays.toString(arr));
	
	
	
	
	}

}
