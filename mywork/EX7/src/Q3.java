import java.util.Scanner;
import java.util.Arrays;


public class Q3 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stubSca
		
		Scanner r =new Scanner(System.in);
		
		double[] y=new double[10];
		
		for(int i=0;i<10;i++) {
			System.out.print("Enter the ten numbers: ");
			y[i]=r.nextInt();
		}
		
			System.out.println("The minimum element is "+getMin(y));
	
	
	}

	public static double getMin(double[] arr) {
		
	double minimumelement = arr[0];
		int minimumindex =0;
		for(int i=0;i<arr.length;i++) {
				if(arr[i]<minimumelement) {
					minimumelement = arr[i];
					minimumindex =i;
				}
		}
		
		//int indexbaba = Arrays.binarySearch(arr, minimumelement);
		
			System.out.println("The index of the min is "+minimumindex);
	
			return minimumelement;
	
		
			
	
	}






}
