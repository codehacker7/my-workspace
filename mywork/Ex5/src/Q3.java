import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner r=new Scanner(System.in);

		System.out.println("Enter the string");
		String s=r.nextLine();
		
		String reverse= ""; int vowels=0;int UpperCase=0;
		
		for(int i=s.length()-1;i>=0;i--) {
				reverse = reverse + s.charAt(i);
				char chh =s.charAt(i);
				char chh1= Character.toUpperCase(s.charAt(i));
	if(chh1=='A' || chh1=='E'|| chh1=='U' || chh1=='I' ||chh1=='O') {
		     vowels++;
	}
		if(Character.isUpperCase(chh)) {
					UpperCase++;
		}
		
		
		}
	
		System.out.println("The reverse of a string is "+reverse);
		System.out.println("The number of vowels are "+vowels);
	      System.out.println("The number of Upper Case charachters are "+UpperCase);
	
	
	
	
	}

}
