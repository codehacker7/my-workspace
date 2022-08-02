import java.util.Arrays;

public class Prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 5;
		int[] arr = {1,2,3};
		
		System.out.println("Before invoking the method x is "+x);
		System.out.println("Before invoking the method array arr is "+Arrays.toString(arr));
		
		updateMe(arr);
		updateMe(x);
	
	

		System.out.println("After invoking the method x is "+x);
		System.out.println("After invoking the method array arr is "+Arrays.toString(arr));
		
    System.out.println("This the first \"UBC's\" ");
		
	
	
	
	
	
	}

		private static void updateMe(int b) {
			b =28;

		
	}

		public static void updateMe(int[] a) {		// this means a ==arr ie a and arr are both pointing to same memory location
			a[2]=78;

		}

			

}
