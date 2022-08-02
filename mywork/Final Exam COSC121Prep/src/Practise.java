
public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		System.out.println(changChar("baac",'a'));
		
		
	}
	public static String changChar(String str,char ch) {
		return changeChar(str,ch,str.length());
	}
	public static String changeChar(String str,char ch,int n){
		
	
		
		if(n==0) {
			
			System.out.println("Nabeel ali");
			
			return "";
		}
		else if(str.charAt(n-1)==ch) {
			return changeChar(str,ch,n-1);
		}
		else {
			return changeChar(str,ch,n-1)+str.charAt(n-1);
		
		}
		
	}	

	

}
