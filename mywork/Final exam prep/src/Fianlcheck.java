import java.util.Arrays;

public class Fianlcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String s1 = "XYXZ"; String s2 ="XXY\Z";
		 
		 s1= s1.toLowerCase(); s2= s2.toLowerCase();
		 
		 int x = s1.length(); int y = s2.length();
		 
		 
		 
		  char[] ch1 = new char[s1.length()]; char[] ch2 = new char[s1.length()];
	
		 int count =0;
		 for(int i=0;i<ch1.length;i++) {
			 char ch = s1.charAt(i);
			 ch1[i] = ch; 
		 }
		 
		 for(int i=0;i<ch1.length;i++) {
			 char ch = s2.charAt(i);
			 ch2[i] = ch; 
		 }
	
		// Arrays.sort(ch1);
		// System.out.println(Arrays.toString(ch1));
	
		 
		 boolean b = Arrays.equals(ch1,ch2);
		 
		 if(b) {
			 System.out.println("equal");
		 }
		 else {
			 System.out.println("not equal");
			 
		 }
		 
		 
		 
		/* for(int i=0;i<s1.length();i++) { for(int j=0;j<s1.length();j++) {
		  if(ch1[i]==ch2[j]) { count++; break; } } }
		  
		  if((x==y) && count==s1.length()) { System.out.println("Equal"); } else {
		 System.out.println("Not equal"); }*/
		 

	

	}

}
