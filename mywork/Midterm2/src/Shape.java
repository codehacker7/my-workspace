
 public class Shape {

	private String color;
	private  boolean filled;
	
 public Shape(){
		
	this("white",true);
	}
	
	public Shape(String color,boolean filled) {
		setColor(color);
		setFilled(filled);
	}
	
	
	public  String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	} 
	
	public String toString() {
		return "Color: "+getColor()+" ,Filled: "+isFilled();
				
	
	
	
}
