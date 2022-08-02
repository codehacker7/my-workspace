
public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		divide(5,0);
		
	}
	
	
	public static void divide(int x,int y) {
		
		try {
			System.out.println(x/y);
		}catch(Exception e) {
			System.out.println("cannot divide by zero ");
		}
		
		
		
		
	}

}
