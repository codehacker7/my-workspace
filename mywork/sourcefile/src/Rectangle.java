import java.util.Scanner;
public class Rectangle extends Shape {
private int height;
private int width;
	
Scanner r = new Scanner(System.in);



Rectangle(){
//
//	System.out.println("Colour: ");
//	String color=r.nextLine();
//
//	setColor(color);
//	
//	System.out.println("Filled (Yes/No)? ");
//	String x = r.nextLine();
//
//	if(x=="No") {
//		setFilled(false);
//	}
//	else {
//		setFilled(true);
//	}

System.out.println("Width and Height:  ");
int Width = r.nextInt();
int Height=r.nextInt();

setWidth(Width);
setHeight(Height);


System.out.println("First Rectangle");


System.out.println(toString());







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
