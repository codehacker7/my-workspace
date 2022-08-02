public class Hexagon extends Shape{
	private int side;
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
setSide(2);

}

Hexagon(String color,boolean filled,int side ){
	setColor(color);
	setFilled(filled);
	setSide(side);
}
public int getSide() {
	return side;
}

public void setSide(int side) {
	this.side = side;
}

public String toString() {
	return super.toString()+"\nSide: "+getSide()+"  Area: "+getArea()+" Perimeter: "+getPerimeter();
}














}
