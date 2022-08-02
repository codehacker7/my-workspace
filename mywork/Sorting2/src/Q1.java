
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

substrings("abc");
	
	
}

	
	
public static void substrings(String s) {
	
	if(s.length()==1) {
	
	   System.out.println(s);
	
	}
	
	else {
		
		System.out.println(s);
		
		substrings(s.substring(0, s.length()-1));
		
		substrings(s.substring(1, s.length()));
		
		
		
}
	
	
}
	
	

}
    