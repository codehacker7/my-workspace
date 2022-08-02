import java.util.Arrays;

public class ArraysasObjects {
		public static void  main(String[] args) {
			
	
		int[] nums = {1,2,3,4};
		int[] arr = nums;
		nums[0]=99;
		arr[1]=98;
		
		// Here there are two reference variables which are pointing to the same memory location so any change in 1 will affect other
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(nums));
		
		// but this is not the case with primitive date types lets check
		
		
		int x =5;
		int y=x;
		x= 98;
		System.out.println(x);
		System.out.println(y);
		}






}
