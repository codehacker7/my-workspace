
public class TestRectangle {
	public static void main(String[] args) throws CloneNotSupportedException {
	
		Rectangle r1 = new Rectangle();
		Rectangle r2 = (Rectangle)r1.clone();
		System.out.println(r2.toString());
	int c =	r1.compareTo(r2);
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
