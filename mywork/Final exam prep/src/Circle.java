
public class Circle {


	public double radius;
	static int numberofobjects;
	
	public Circle() {
		
		radius =1.0;
		numberofobjects++;
		
	}

	public Circle(double radius) {
		this.radius = radius;
		numberofobjects++;
	}

	public double getradius() {
			if(radius>0) {
				return radius;
			}
			else {
				return 0.0;
			}
	}
	
	public void setradius(double radius) {
		

		this.radius = radius;
	
	
	
	}
	
	public int getNumberofObjects() {
		
		return numberofobjects;
	
	}
	
	public double getArea() {
		
	return Math.PI*radius*radius;
	
	
	}
	
	
	
	
	


}
