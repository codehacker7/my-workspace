
public class Q1 {

	public static void main(String[] args) {
	
	//palindrome("abchjefvjdcbjdcbuj");

String s = "abc674";
int count =0;

for(int i=0;i<=s.length()-1;i++) {

	char ch = s.charAt(i);
	
	if(Character.isDigit(ch)) {
		count++;
	}

	
	
	
}

if(count>0) {
	System.out.println("The string "+s+""+"has "+count+" digits");
	
	
}

else {
	System.out.println("The string has no digits");
}

}

	public static void palindrome(String s) {
	
		String reverse = "";
		
	for(int i=s.length()-1;i>=0;i--) {
		
		char ch = s.charAt(i);
		
		reverse = reverse + ch;
		
	}
		
	System.out.println(reverse);	
	
	}
		
		



}




