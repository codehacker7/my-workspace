import java.util.Arrays;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Enter the number of students: ";
		String s2 = "Enter students grades: ";
		
		double[] a = getNumsFromUser(s1,s2);
			System.out.println(Arrays.toString(a));
		
		}


		public static double[] getNumsFromUser(String msg1,String msg2) {
			
				Scanner r = new Scanner(System.in);
				
				System.out.println(msg1);
				int x =r.nextInt();
				
				double[] d = new double[x];
			
				System.out.println(msg2);
				
				for(int i=0;i<x;i++) {
					d[i]=r.nextDouble();
				}
				
				return d;
			
				
				
				
	}
}
