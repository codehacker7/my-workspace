
public class Circle {

	private double radius;
	private String color;
	private boolean filled;
	
	Circle(){
		this(1,"Black",true);
	}
	Circle(double radius){
	this(radius,"Black",true);
	}
	
	Circle(double radius,String color,boolean filled){
		
		setradius(radius);
		setColour(color);
		setFilled(filled);
	}
	
	public void setradius(double radius) {
		if(radius>0)
		 this.radius=radius;
	
	}
	
public void setColour(String color) {
		
	 this.color=color;
	
	}

public void setFilled(boolean filled) {
	
	this.filled=filled;
}

public double getradius() {
	return this.radius;
}
	public String getcolor() {
		return this.color;
	}
	public boolean getFilled() {
		return this.filled;
	}
	
	public 	String toString() {
		
	return "radius="+radius+"color="+color+"filled="+filled;
	
	}
	
	
	
	
	
	
	
	
	
	
}
