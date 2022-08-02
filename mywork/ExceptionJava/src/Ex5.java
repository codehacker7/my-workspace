
public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

try {
	
	foo(5,7);
}catch(Exception e) {
	System.out.println("caught in  the main()");
}
	
	}

	
	// we can throw  many exceptions seperated by a comma 
	
	public static void foo(int x,int y) throws ArrayIndexOutOfBoundsException  {
		
		try {
		int[] arr = {1,2,3};
		
		
		}catch(ArithmeticException e) {
			System.out.println("Error");
		}finally {
			System.out.println("finally");
		}
			
			// Exception propagation is a method by which java keeps on throwing the exception back t the methods by which it called if it is not dealt within that particular methos



		}

	
	
	
	
	
	
	
	
	
}
