import java.util.Scanner;
public class Practise4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner r = new Scanner(System.in);
	
	System.out.println("Enter the value of n: ");
	int n =r .nextInt();
	
	
	
	for(int rows=1;rows<=n;rows++) {
		for(int spaces =rows;spaces<=n;spaces++) {
			System.out.print(" ");
		}
		for(int j=rows;j>=1;j--) {
			System.out.print(j);
		}
			System.out.println();
	}
	
	
	
	
	
	
	
	
	}

}
