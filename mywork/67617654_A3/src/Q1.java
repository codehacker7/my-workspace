import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner r = new Scanner(System.in);
		
		int[] array = new int[50];
		for(int i=0;i<array.length;i++) {
			array[i]= (int)(45+Math.random()*100);
		}
		System.out.println("Enter an index: ");
		int x;
		boolean y = false;
		while(!y) {
	try {
		x = r.nextInt();
		System.out.println("The element is "+array[x]);
		y=true;
	}catch(Exception e) {
		System.out.println("Out of Bound. Try again: ");
		}
		}
		
	}

}
