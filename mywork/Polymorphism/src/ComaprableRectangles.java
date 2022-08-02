import java.util.Arrays;

public class ComaprableRectangles extends Rectangle implements Comparable<ComaprableRectangles> {
     
	
	public ComaprableRectangles(double width,double height) {
		super(width,height);
	}

	@Override
	public int compareTo(ComaprableRectangles o) {
		// TODO Auto-generated method stub
		
		if(this.getArea()>o.getArea()) {
			return 1;
		}
		else if(o.getArea()>this.getArea()) {
			return -1;
		}
		else
			return 0;
		
	}
	
	
	public static void main(String[] args) {
		

	ComaprableRectangles[] rectangles= {
			
			new ComaprableRectangles(3.4,5.4),
			new ComaprableRectangles(13.24,55.4),
			new ComaprableRectangles(7.4,35.4),
			new ComaprableRectangles(1.4,25.4),
	
	
	};
	
	Arrays.sort(rectangles);
	
	for(ComaprableRectangles rectangle:rectangles) {
		System.out.println(rectangle.toString());
	}
	
	
	
	
	}
	
	
	
}
