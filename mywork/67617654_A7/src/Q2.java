import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Enter the number of students: ";
		String s2 = "Enter students grades: ";
		
		
		 getNumsFromUser(s1,s2);
}


	public static void getNumsFromUser(String msg1,String msg2) {
		
			Scanner r = new Scanner(System.in);
			
			double highestmark ;
			
			System.out.println(msg1);
			int x =r.nextInt();
			
			double[] d = new double[x];
			
			System.out.print(msg2);	
			
			for(int i=0;i<x;i++) {
			//System.out.print(msg2);	
				d[i]=r.nextDouble();
			}
			
			highestmark = d[0];
			
			for(int i=0;i<d.length;i++) {
				
			
				if(d[i]>highestmark) {
					highestmark = d[i];
				}
				
				
			}
			//System.out.println(highestmark);
		
			
			
			
			for(int i=0;i<d.length;i++) {
				if(d[i]>=(highestmark -10)) {
					System.out.println("Student " +(i+1) + " marks are " +d[i]);
					System.out.println("Your letter grade is A");
				}
				else if(d[i]>=(highestmark -20)) {
					System.out.println("Student "+ (i+1) + " marks are " +d[i]);
					System.out.println("Your letter grade is B");
				}
			
			
				else if(d[i]>=(highestmark -30)) {
					System.out.println("Student "+ (i+1) + " marks are " +d[i]);
					System.out.println("Your letter grade is C");
				}
				
				
				else if(d[i]>=(highestmark -40)) {
					System.out.println("Student "+ (i+1) + " marks are " +d[i]);
					System.out.println("Your letter grade is D");
				}
				
				
				
				else {
					System.out.println("Student "+ (i+1) + " marks are " +d[i]);
					System.out.println("Your letter grade is F");
				
				}
				
				System.out.println();
}}
}
