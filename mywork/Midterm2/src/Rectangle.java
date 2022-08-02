public class Rectangle extends Shape{

	private double width, height;

public Rectangle() {

	this(1,1);

}




public Rectangle(double width, double height) {

	setWidth(width);

	setHeight(height);
}

public double getWidth() {

	return width;


}

public void setWidth(double width) {

	this.width = width;
	

}
public double getHeight() {

	
	
	return height;


}
public void setHeight(double height) {
	
	this.height = height;
	}
public double getArea() {
	
	return width * height;
	
}
public double getPerimeter() {
	
	return 2 * (width+height);
	
}
public String toString() {

	return "Color:" + getColor() + ". Filled: " + isFilled() +
". Width: " + width + "Height: " + height;
}





}