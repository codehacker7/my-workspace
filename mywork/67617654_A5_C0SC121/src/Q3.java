
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println(countchar("kavyansh",'a'));
	}
	
	public static int countchar(String str ,char a) {
		return countcharhelper(str,a,0,str.length()-1);
	}
	public static int countcharhelper(String str,char a,int low,int high) {

	/*
	 
	 So here basically the logic that I used was i used char at to extract a character at index low
	 and if character at index low is equal to required character return  1+ calling method again with paramaters
	 as low+1 and if charachter is not equal to required charachter just call the method with low+1 
	 
	 
	 
	 
	 
	 
	 */
		int y =0;
		
		if(low<= high) {
			y=((str.charAt(low)==a)?1:0) +countcharhelper(str,a,low+1,high);
		}


		return  y;
		
		}
		

}
