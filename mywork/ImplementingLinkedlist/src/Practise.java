import java.util.Scanner;

public class Practise {
public static void main(String[] args) {
	
	Scanner r = new Scanner(System.in);
	System.out.println("Enter the text: ");
	String text = r.nextLine();
	int vowels =0; 
	int consonants =0 ;
	int uppercaseletters = 0;
	int lowercaseletters = 0;
	int punctuationletters = 0;
	
//	
//	for(int i=0;i<text.length();i++){
//		
//		char ch = text.charAt(i);
//		
//		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' ||ch=='E' || ch=='I' || ch=='O' ||ch=='U'){
//			vowels++;
//		}
//		
//		if(ch>=65 && ch<=90){
//			uppercaseletters++;
//		}
//		 if(ch>=97 && ch<=122){
//			lowercaseletters++;
//		}
//		
//	if(!(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' ||ch=='E' || ch=='I' || ch=='O' ||ch=='U')) {
//		consonants++;
//	}
//	}
	int count=1;
	
	for(int i=0;i<text.length();i++){
		
		char ch = text.charAt(i);
		
		if((ch ==' ') && (text.charAt(i+1)!=' ')) {
			count++;
		}
		
		
		
	}
	
	
System.out.println("Count is "+count);
	
	
	
	
}
}
