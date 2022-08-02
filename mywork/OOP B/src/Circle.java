
public class Circle {
	
// attributes
	private double radius;
	
	public Circle(){
		setRadius(10);
	}

	public Circle(int r){
		//radius = r;
		setRadius(r);
	}

	void setRadius(int r) {
		
		if(r>=0)
		radius =r;
		else
			System.out.println("Invalid radius. Radius not chnged");
		
	}
	
	public double getArea() {
		
		final double PI =22.7;
		
		double Area = PI*radius*radius;
	
		return Area;
	}

public	double getPerimeter() {
		
		final double PI =22.7;
		
		double Perimeter = PI*2*radius;
	
		return Perimeter;
	
	}

public double getRadius() {
	return radius;
}








}

