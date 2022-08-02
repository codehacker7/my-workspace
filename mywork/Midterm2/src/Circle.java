
public class Circle extends Shape {

	private double radius;
	
	
	
	public Circle() {this(1);}
	public Circle(double radius) {
	setRadius(radius);
	}
	public void setRadius(double radius) {this.radius = radius;}
	public double getRadius() {return radius;}
	public double getDiameter() {return 2*radius;}
	public double getArea() {return Math.PI * radius * radius;}
	public double getPer() {return 2 * Math.PI * radius;}
	public String toString() {
	return "Color:" + getColor() + ". Filled: " + isFilled() +
	". Radius: " + radius;
	
	}
	public boolean equals(Circle c) {
		if(this.radius==c.getRadius()) {
			return true;
		}
		else {
			return false;
		}
	
	}
	
	
	
	
	
	
	
	
}
