import java.util.Scanner;
public class TestHexagon {

	public static void main(String[] args) throws CloneNotSupportedException  {
		// TODO Auto-generated method stub

		Scanner r = new Scanner(System.in);
		

			System.out.println("Colour: ");
			String color=r.nextLine();

			System.out.println("Filled (Yes/No)? ");
			String filled = r.nextLine();
			
			System.out.println("Side length: ");
			int side = r.nextInt();
			
		
			boolean realfilled;
			
			if(filled.equals("true")) {
				realfilled = true;
			}
			else {
				realfilled = false;
			}
			
		Hexagon c1 = new Hexagon(color,realfilled,side);
		
		System.out.println("First Hexagon");

		System.out.println(c1.toString());
			Hexagon c2 = (Hexagon)c1.clone();
		
			System.out.println("Clonable hexagon ");
			
			System.out.println(c2.toString());
	
			int c = c1.compareTo(c2);
			
		
		if(c<0) {
	
				System.out.println("Clonned hexagon has more Area");
					}
			else if(c>0) {
System.out.println("Clonned hexagon has lesser Area");
		}
	else {
	System.out.println("Both hexagons are identical");
					
				}

	
	
	}

}
