import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner r=new Scanner(System.in);
		

		
		int[] ages = new int[20];
		ages[0]=12;
		ages[19]=1;
		
		
		System.out.println("Enter the value of 2nd element: ");
		ages[1]=r.nextInt();

	
		System.out.println(	ages[0]);
		System.out.println(	ages[19]);
		System.out.println(ages[1]);
		System.out.println(ages.length);
		
	}

}
