
public class TestHexagon {

	public static void main(String[] args) throws CloneNotSupportedException  {
		// TODO Auto-generated method stub
			Hexagon c1 = new Hexagon();
			Hexagon c2 = (Hexagon)c1.clone();
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
