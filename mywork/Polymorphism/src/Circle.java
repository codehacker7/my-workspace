
public  class Circle extends Shape implements Cloneable {
private double radius;

public Circle() {
	this(1);
	
	}

public Circle(double radius) {
	this(1,"White",false);
}
public Circle(double radius,String color,boolean filled) {
	setradius(radius);
	setcolor(color);
	setfilled(filled);
}

public void setradius(double radius) {
	// TODO Auto-generated method stub
this.radius = radius;	
}

public double getradius() {
	// TODO Auto-generated method stub
		return this.radius;
}

public double getArea() {
	return Math.PI*this.radius*this.radius;
}

public double getDiameter() {
	return 2*this.radius;
}

public double getPerimeter() {
	return 2*Math.PI*this.radius;
}

public String toString() {
	return "Circle, Color: "+getcolor()+"Filled: "+isFilled();
}

@Override
public void draw() {
	// TODO Auto-generated method stub
	
}

public Object clone() throws CloneNotSupportedException {
	return  super.clone();
}





}
