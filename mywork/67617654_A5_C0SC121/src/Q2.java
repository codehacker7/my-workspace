
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println(reverse("UBC-0"));
	
	}
	
	
	
	public static String reverse(String s) {
		return reversehelper(s,0,s.length()-1);
	}
	
	
	
	public static String reversehelper(String s,int low,int high) {
		
	/* The basic logic that I used was as soon as low is less than high extract the charachter at the index high
	
		and add it to the new String m and then call the method again with the help of recurssion and decrease
		
		high to high-1 so that now the previous character will be added to our new string and this process contions till
		low is less than high and than in the end we return the string
		
		*/
		
		String m ="";
		
		
		
	if(low<=high) {
			char ch = s.charAt(high);
		
		return m=m+ch+reversehelper(s,low,high-1);
	
	}

	
	else {
		return "";
	}
	
	
	}

}
