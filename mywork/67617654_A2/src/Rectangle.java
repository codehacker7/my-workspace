import java.util.Scanner;
public class Rectangle extends Shape {
private int height;
private int width;
	
Scanner r = new Scanner(System.in);



Rectangle(){

	setWidth(1);
	setHeight(1);

}
Rectangle(String color,boolean filled,int width,int height){
setColor(color);
setFilled(filled);
setWidth(width);
setHeight(height);
	
	
}

public int getHeight() {
	return height;
}

public void setHeight(int height) {
	this.height = height;
}

	public int getWidth() {
	return width;
}

	public void setWidth(int width) {
	this.width = width;
}
	
	public String toString() {
		return super.toString()+"\n Width: "+getWidth()+",Height: "+getHeight()+"\n Area: "+getArea()+" Perimeter: "+getPerimeter();
	}


@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return getHeight()*getWidth();
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*(getHeight()+getWidth());
	}

}
