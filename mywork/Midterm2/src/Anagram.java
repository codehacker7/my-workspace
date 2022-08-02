import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	}
	

	
	public static boolean anagram(String s,String s1,int low,int high) {
		
		char[] x = s.toCharArray();
		char[] y = s1.toCharArray();

		Arrays.sort(x);//BCU
	Arrays.sort(y);//BCU

	

	if(s.length()!=s1.length()) {
		return false;
	}

	if(low>high) {
		return true;
	}


	else if(x[low]!=y[low]) {
		return false;
	}



	else {
		
		return anagram(s,s1,low+1,high);
	}
		
}
}
