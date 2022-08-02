package kavyanshbansal;

import java.util.Scanner;

public class L03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner r=new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name=r.nextLine();
		
		System.out.println("What is your age");
		int age=r.nextInt();
		
		System.out.printf("Welcome %s you are %d years old",name,age);

	}

}
