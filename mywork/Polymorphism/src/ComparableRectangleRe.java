
public class ComparableRectangleRe extends Rectangle implements Comparable<ComparableRectangleRe>{

	@Override
	
	
	
	
	
	public int compareTo(ComparableRectangleRe o) {
		// TODO Auto-generated method stub
		
		
		
		if(this.getArea()>o.getArea()) {
			return 1;
		}
		
		else if(o.getArea()>this.getArea()) {
			return -1;
			
		}
		else {
			return 0;
		}
		
		
		
		
	}









}
