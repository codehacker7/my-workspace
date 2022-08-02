
public class TowerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println();
	
	
	hanoi(3,'A','B','C');
	
	}

	private static void hanoi(int n, char A, char B, char C) {
		// TODO Auto-generated method stub
	if(n==1) {
		System.out.printf("move disk %d from %c to %c\n",n,A,B);
	}
	else {
		hanoi(n-1,A,C,B);
		System.out.printf("move disk %d from %c to %c\n",n,A,B);
		hanoi(n-1,C,B,A);	
	
	}
		
		
		
		
		
	}

}