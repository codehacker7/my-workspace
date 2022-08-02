package kavyanshbansal;

import java.util.Scanner;

public class New1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner r=new Scanner(System.in);
		
		int sum=0;int x;
		do{
			System.out.println("Enter the first integer");
		     x=r.nextInt();
			sum+=x;
	}while (x!=0);
		System.out.println(sum);

}}
