
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int x =fib(4);
	System.out.println(x);
	}

	public static int fib(int n) {
		// TODO Auto-generated method stub
		if(n==0) {
			return 0;
		}
		else if(n==1) {
			return 1;
		}
		else
	return fib(n-1)+fib(n-2);
	
	
	}
	
	
	
	
	
	

}
