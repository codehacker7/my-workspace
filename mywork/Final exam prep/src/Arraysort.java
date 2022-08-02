import java.util.Arrays;
import java.util.Scanner;

public class Arraysort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] x = {1,6,2,3,4,5,1,3,2};
					
				
			for(int i=0;i<x.length;i++) {
					for(int j=i+1;j<x.length;j++) {
						if(x[i]>x[j]) {
							int temp = x[i];
							
							x[i]=x[j];
							x[j]= temp;
					}
					
					
					
					
					}
				}
			
			
			Scanner r1 = new Scanner(System.in);
		System.out.println(Arrays.toString(x));
			
		System.out.printf("%s %s %s %s %s","Degrees","Radians","Sine","Cosine","Tangent");
		int degrees = 30;
	     double r = Math.toRadians(degrees);
	     System.out.println();
		System.out.printf("%d %f %f %f %f",degrees,r,Math.sin(r),Math.cos(r),Math.tan(r));
		
		
		String s1 = "abc";
		String s2 = "abcdefgh";
			
		
		System.out.println(s1.compareTo(s2));
	
			int sum =0;
		
		System.out.println("Enter the digit: ");
		int y = r1.nextInt();
	
		while(y!=0) {
		sum+=y;
		System.out.println("Enter the digit: ");
		y = r1.nextInt();
	}
	
	System.out.println(sum);
		
	
	
	
	
	
	
	
	}
}
