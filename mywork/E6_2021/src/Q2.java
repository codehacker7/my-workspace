
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(countindex("kavyansh",'v'));
	
		
		System.out.println(countchar("KAVA",'A',0,3));
	}
	
	
	
public static int countindex(String str,char a) {
	
	
	return countindex(str,a,0,str.length()-1);
}

public static int countindex(String str,char a,int low,int high) {
	
	char ch = str.charAt(low);
	if(ch==a) {
		return low;
	}
	else {
		return countindex(str,a,low+1,high);
	}
}


public static int countchar(String str,char a,int low,int high) {

	
	/*If i apply the code given below then it is not worth it
	  as the num variable will always get 0 as method run each time
	  
	 */
	
	
	
	//	int num =0;
//	
//	if(low<high) {
//
//		char ch= str.charAt(low);
//
//		if(ch==a) {
//	num+=1;
//}
	
	// Code to solve the given problem
	
	int num =0;
	
	if(low<= high) {
		num=((str.charAt(low)==a)?1:0) +countchar(str,a,low+1,high);
	}


	return  num;
	
	}
	
	
	
	
	
	

}











