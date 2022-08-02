import java.util.Scanner;

import java.util.Arrays;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner r =new Scanner(System.in);
		
		double[] arr = {3,6,2,1,7,1,4,12,16,2};
			System.out.println(indexOfMin(arr));	

		
	}


public static int indexOfMin(double[] arr) {
	
		double minimumelement = arr[0];
		int minimumindex =0;
		for(int i=0;i<arr.length;i++) {
				if(arr[i]<minimumelement) {
					minimumelement = arr[i];
					minimumindex =i;
				}
		}
		
		System.out.println("The index of minimum element is "+minimumindex);
		
		return minimumindex;

			

}





}
