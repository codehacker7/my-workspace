import java.util.Arrays;
import java.util.Scanner;

public class Bunnieears {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	//	bunnieear(5);
		
		System.out.println(count7(7897));
		System.out.println(countx("xxmnx",0,4));
	
	System.out.println(changepi("xpiu"));
	System.out.println(array11(new int[] {11,43,11,11},0));
	System.out.println(printStars("aaaa"));
	System.out.println(countabc("abcvabc"));
	
	System.out.println(countHi2("ahixhi"));
	System.out.println(palindrome("abcba"));
	System.out.println(strCount("abcba","bc"));
	System.out.println(traingles(2));
	System.out.println(count8(9));
	
	System.out.println(sortedcheck(new int[] {1,2,5,7,11},0,4));
	substrings("abc",0," ");
	
	}
	
	
	
	
	
	public static int bunnieear(int bunnies) {
		

if(bunnies == 0) return 0;

if(bunnies%2==0) return 3+bunnieear(bunnies-1);

else{
  return 2+bunnieear(bunnies-1);
}

		
	}
	
	
	
	
	public static int count7(int n) {
		
	
		if(n==0) {
			return 0;
		}
		else {
		
			int rightmost = n%10;
			n/=10;
			
			if(rightmost==7) {
			return 1+count7(n);
		}
		else {
			return 0+count7(n);
		}
		
		}
	}
	
	public static int countx(String s,int low,int high) {
		
		if(low>high) {
			return 0;
		}
		else {
			
			if(s.charAt(low)=='x') {
				return 1+countx(s,low+1,high);
			}
			else {
				return 0+countx(s,low+1,high);
			}
			
		}
		
		
	}
	
	public static String changepi(String x) {
		
		if(x.length()<2) {
			return x;
		}
		else if(x.substring(0,2).equals("pi")) {
			return "3.14"+changepi(x.substring(2));
		}
		else {
			return x.substring(0,1)+changepi(x.substring(1));
		}
		
		
		
	}
	
	
	
	public static int array11(int[] nums,int index) {
		
		if(index>=nums.length) {
			return 0;
		}
		else {
			
			if(nums[index]==11) {
				return 1+array11(nums,index+1);
			}
			else {
				return 0+array11(nums,index+1);
			}
			
		}
		
		
		
		
		
	}
	
	
	public static String printStars(String s) {
		
		if(s.length()==1) {
			return s;
		}
		else if(s.charAt(0)==s.charAt(1)) {
			return s.charAt(0)+"*"+printStars(s.substring(1));
		}
		
		else {
				return s.charAt(0)+printStars(s.substring(1));
		}
		
		
		}
	
	
	public static int countabc(String str) {

		if (str.length() < 3) return 0;
		 
		   if (str.substring(0,3).equals("abc") || str.substring(0,3).equals("aba"))
		 
		     return 1 + countabc(str.substring(1));
		 
		   else
		 
		     return countabc(str.substring(1));

		

	}
	
	// here is an important problem
	public static int countHi2(String s) {
		
		int len = s.length();
		
		if(s.length()<2) {
			return 0;
		}  // ahixhi
		
		 if(s.substring(len-2,len).equals("hi") ) {
			 if(s.charAt(len-3)!='x') {
				return 1+countHi2(s.substring(0,len-1)); 
			 }
		 }
		
		return countHi2(s.substring(0,len-1));
		
		
		
		
		
	}
	
	public static boolean palindrome(String s) {
		
		

		
		if(s.length()<=1) {
			return true;
		}
		
		else if(s.charAt(0)!=s.charAt(s.length()-1)) {
			return false;
		}
		
		else {
			return palindrome(s.substring(1,s.length()-1));
		}
		
		
		
	}
	
	public static int strCount(String s, String sub) {
		
		int x = sub.length(); //3
		int m = s.length();
		
		if(x>m) {
			return 0;
		}
		
		 if(s.substring(0,x).equals(sub)) {
			
			return 1+strCount(s.substring(1),sub);
	
		}
		
		else {
			return strCount(s.substring(1),sub);
		}
		
		}
	
	public static int traingles(int row) {
		
		
		if(row==0) return 0;
		
		else {
			return row+traingles(row-1);
		}
		
		
		}
	
	public static int count8(int n) {
		
		if(n==0) {
			return 0;
		}
		
		int rightmost = n%10;
		n/=10;
		if(rightmost==8) {
			
			return 1+count8(n);
		}
		
		else {
			return count8(n);
		}
		
		
		
	}
	
	
	
	public static int counthi(String s) {
		
	if(s.length()<2) {
		return 0;
	}
		
	else {
		
		if(s.substring(0,2).equals("hi")) {
			return 1+counthi(s.substring(1));
		}
		else {
			return counthi(s.substring(1));
		}
		
		
	}
		
}

	
	public String noX(String str) {
		
		
		if(str.length()<1){
			return str;
		}
		
		if(str.charAt(0)=='x') {
			return str.substring(1);
		}
		else {
			return 	str.charAt(0)+	str.substring(1);
		}
		
		
		
		
	}
	
	
	
	public static boolean array220(int[] nums,int index) {
		
		
		if(index>=nums.length-1) {
			return false;
		}
		
		 if(nums[index+1]==nums[index]*10) {
			return true;
		}
		return array220(nums,index+1);
	}
	
	
	public static String endX(String s) {
		
		
		if(s.length()<1) {
			return s;
		}
		
		
		else if(s.charAt(0)=='x') {
			return endX(s.substring(1))+'x';
		}
		else {
			return s.charAt(0)+endX(s.substring(1));
		}
		
	}
	
	
	public static int count11(String str) {
		
		if (str.length() < 2) return 0;
		
	
		if (str.substring(0,2).equals("11"))    return 1 + count11(str.substring(2));
		
		
		else  	return count11(str.substring(1));
}
	
	
	public static int powerN(int base,int n) {
		if(n==1) {
			return 1;
		}
		
		else {
			return base*powerN(base,n-1);
		}
	}
	
	
	public static String changeXY(String str) {
		
		
		if(str.length()<1) {
			return str;
		}
		
		else if(str.charAt(0)=='x') {
			return 'y'+changeXY(str.substring(1));
		}
		else {
			return str.charAt(0)+ changeXY(str.substring(1));
		}
		
		
		
		
	}
	
	
//	public static String removeDuplicates(String s ) {
//		
//		if(s.length()<=1) {
//			return s;
//		}
//		else {
//			for(int i=0;i<s.length();i++) {
//				if(s.charAt(0)==s.charAt(i)) {
//					
//				}
//			}
//		}
//		
//		
//	}
	
	
	public static String printsubstring(String s) {
		
		
		if(s.length()<=1) {
			return s;
		}
		else {
			return printsubstring(s.substring(0,1));
		}
		
		
	}
	
	
	public static boolean anagram(String s,String s1,int low,int high) {
		
		//Rescue
		//Secure
		
		char[] x = s.toCharArray();
		char[] y = s.toCharArray();
		
		Arrays.sort(x);
		Arrays.sort(y);
		
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
	
	
	
	public static void substrings(String s,int index,String output) {
		
//		if(s.length()==1) {
//		
//		   System.out.println(s);
//		
//		}
//		
//		else {
//			
//			System.out.println(s);
//			
//			substrings(s.substring(0, s.length()-1));
//			
//			substrings(s.substring(1, s.length()));
//			
//			
//			
//	}
	if(index==s.length()) {
		System.out.println(output);
		return;
	}
	
	
	
	// nahi lera
	substrings(s,index+1,output);
	//lera
	output = output + s.charAt(index);
	substrings(s,index+1,output);
	
	
	}
	
	
	public static boolean sortedcheck(int[] x,int low,int high) {
		
		
	if(low>high-1) {
		return true;
	}
	
	else if(x[low]>x[low+1]) {
		return false;
	}
	else {
		return sortedcheck(x,low+1,high);
	}
			
			
			
		
		
		
		
		
	}
	
	
	public static void integers() {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		Scanner in = new Scanner(System.in);
		
		int x =1;
		
		System.out.println("Enter the integers: ");
		while(x!=0) {
			x = in.nextInt();
		
		
					
		
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
	

