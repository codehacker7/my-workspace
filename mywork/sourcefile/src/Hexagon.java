import java.util.Scanner;
public class Hexagon extends Shape{
	private int side;
Scanner r = new Scanner(System.in);
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return ((3*Math.sqrt(3))/2)*getSide()*getSide();
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 6*getSide();
	}

Hexagon(){
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

System.out.println("Side length: ");
int side = r.nextInt();

setSide(side);

System.out.println("First Hexagon");






System.out.println(toString());









}

public int getSide() {
	return side;
}

public void setSide(int side) {
	this.side = side;
}

public String toString() {
	return super.toString()+"\nSide: "+getSide()+"  Area: "+getArea()+"Perimeter: "+getPerimeter();
}














}
