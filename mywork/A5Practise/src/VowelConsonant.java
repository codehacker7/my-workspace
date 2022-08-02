import java.util.Arrays;
import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner r = new Scanner(System.in);

//		System.out.println("Enter the charachter: ");
//		char s=r.nextLine().charAt(0);
//		char y=Character.toLowerCase(s);
//	
//		
//		
//		if(y=='a' || y=='e' || y=='i'  || y=='o' || y=='u') 
//			System.out.println("It is a vowel");
//	
//		
//		else if(y>='a' && y<='z') 
//			System.out.println("It is a consonant");
//		
//		else 
//			System.out.println("Invalid charachter constant");
//		
		String s = null;
		String x = null;

		Object[] objects = { s, x };
		System.out.println(Arrays.toString(objects));
		Arrays.sort(objects);
		System.out.println(Arrays.toString(objects));

	}

}
