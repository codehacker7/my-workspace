import java.util.Scanner;
public class TestRectangle {
	public static void main(String[] args) throws CloneNotSupportedException {
	Scanner r = new Scanner(System.in);
		System.out.println("Colour: ");
		String color=r.nextLine();


		
		System.out.println("Filled (Yes/No)? ");
		String filled = r.nextLine();

	boolean realfilled;
	if(filled.equals("Yes")) {
		realfilled = true;
	}
	else {
		realfilled = false;
	}
	System.out.println("Width and Height:  ");
	int width = r.nextInt();
	int Height=r.nextInt();

	Rectangle c1= new Rectangle(color,realfilled,width,Height);

	System.out.println("First Rectangle");
	
	System.out.println(c1.toString());

	
	Rectangle c2 = (Rectangle)c1.clone(); 

		
		System.out.println("Clonned Rectangle");
		System.out.println(c2.toString());
		
		
	
	int c =	c1.compareTo(c2);
	if(c<0) {
		System.out.println("Clonned Rectangle has more Area");
			
		}
	
		else if(c>0) {
			System.out.println("Clonned Rectangle has lesser Area");
			
		}
	
		else {
			System.out.println("Both Rectangle are identical");
			
		}

	
	}
}
