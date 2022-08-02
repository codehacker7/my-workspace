
public class Shape {

	private String color;
	private boolean filled;

	public Shape() {
	this("white",false);	
	}

	public Shape(String color, boolean filled) {
		// TODO Auto-generated constructor stub
	setColor(color);
	setfilled(filled);
		
	}

	private void setfilled(boolean filled) {
		// TODO Auto-generated method stub
	this.filled = filled;	
	}

	public void setColor(String color) {
		// TODO Auto-generated method stub
		this.color = color;
	}
	public String getcolor() {
		return this.color
;	}

	public boolean getfilled() {
		return this.filled;
	}
	
	public String toString() {
		return "Shape, Color: "+getcolor()+"Filled: "+getfilled();
	}

}
