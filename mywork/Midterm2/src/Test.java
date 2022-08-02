import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Circle();
		
		Circle c = (Circle)s;
		
		System.out.println();
		
	
		System.out.println(c.getDiameter());
		
		
		for(int row =0;row<=4;row++) {
			for(int spaces =0;spaces<4-row;spaces++) {
				System.out.print(" ");
			}
			for(int col =1;col<=row+1;col++) {
				System.out.print("*");
			}
		System.out.println();
		}
		
		
		for(int i=1;i<=5;i++) {
			System.out.println(" ".repeat(5-i)+"*".repeat(i));
		}
		
		
	}
//	
//    *
//   * *
//  * * *
// * * * *
//* * * * * 
	
	
	
	public static void printstars() {
		
		
		
		
	}






}








