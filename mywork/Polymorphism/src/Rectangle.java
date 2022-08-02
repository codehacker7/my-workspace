
public class Rectangle extends Shape {
private double width;
private double height;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
		this(5,7);
	
	}

public Rectangle(double width,double height) {
		this(width,height,"White",false);	
		
}

public Rectangle(double width,double height,String color,boolean filled) {
	setwidth(width);
	setheight(height);
	setcolor(color);
	setfilled(filled);
}

public void setheight(double height) {
	// TODO Auto-generated method stub
	this.height = height;
}

public void setwidth(double width) {
	//TODO Auto-generated method stub
	this.width = width;
}

public double getheight() {
	// TODO Auto-generated method stub
//	this.height = height;
		return this.height;
}

public double getwidth() {
	//TODO Auto-generated method stub
	  return this.width;
}

public double getArea() {
	return this.width*this.height;
}

public double getPerimeter() {
	return 2*(this.width+this.height);
}

public String toString() {
	return "Rectangle, Color: "+getcolor()+"Filled: "+isFilled();
}

@Override
public void draw() {
	// TODO Auto-generated method stub
	
}










}
