import java.util.Scanner;

public class VowelsLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner r=new Scanner(System.in);
		
		System.out.println("Enter the letter: ");
		char ch=r.nextLine().charAt(0);
		char y=Character.toLowerCase(ch);
	     
		
		int vowel=0;int consonant=0;
	
		/*	if(y=='a'  && y=='e' && y=='i' && y=='o') {
			System.out.println("It is a vowel");
		}
			
		else {*/
			
			while(ch>='a' && ch<='z') {
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
					vowel++;}
					
				else {
						consonant++;
					}
				
				
					
					
					System.out.println("Enter the charachter");
				      ch=r.nextLine().charAt(0);
	}
			
			
				System.out.println("Vowels are:  "+vowel);
				System.out.println("Consonants are: "+consonant);
		
		
		
		
		
	
	}
		
		
	}


