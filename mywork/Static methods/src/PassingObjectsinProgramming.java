import java.util.Scanner;

public class PassingObjectsinProgramming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	//int[] x = new int[4];
	
	//int[] y = new int[5];
	

		Circle[] c1 = new Circle[4];
		
		
	/// this is same as creating an object named as c0,c1,c2,c3
	
	// create an array
	Circle[] c = new Circle[4];  
	
	for(int i=0;i<c.length;i++) {
		c[i]=new Circle();
	}
	
		
	
	
	
	// THis line is equal to
	//Circle c0;
	//Circle c1
	// Circle c2;
	// Circle c3;
	
	c1[0].count =14;
	c1[1].count = 15;
	System.out.println(c1[0].count);
	System.out.println(c1[1].count);
	
	
	
	
	
	
	
	
	// explicit casting

	
	Scanner in = new Scanner(System.in);
	
	System.out.println("Enter the number");
	int y2 = in.nextInt();
	
	in.nextLine();
	
	System.out.println("Enter the name: ");
	String s = in.nextLine();
	
	System.out.println(y2++);
	System.out.println(++y2);
	
	
	int x =5;
	int y =5;

	System.out.println(x>10 && y>1);

	
	String s1 = "abc";
	System.out.println(hasDigits(s1));
	
	int[] x6 = {2,3,4,5,6};
	
	for(int item:x6) {
		System.out.println(item);
	}
	
	
	
	/*System.out.println(c[0].radius);
	System.out.println(c[1].radius);
	System.out.println(c[2].radius);
	System.out.println(c[3].radius);
	System.out.println(c[0].max);
	
	}*/

}

	private static boolean hasDigits(String s1) {
		// TODO Auto-generated method stub

			for(int i=0;i<s1.length();i++) {
				
				char ch = s1.charAt(i)
						;
			//	int count =0;
				if(Character.isDigit(ch)) {
				
				return true;	
				
				}
			}
			
		
				return false;
			
			
	
	}
	





}
