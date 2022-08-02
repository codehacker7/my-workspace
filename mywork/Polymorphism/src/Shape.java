 public abstract class Shape extends Object implements Drawable{ // an abstract classcan extend a concrete class
	private String color ;
	private boolean filled;
	
	public Shape(){
		this("White",false);
	}

	public Shape(String color,boolean filled){
		setcolor(color);
		setfilled(filled);
	}

	public void setfilled(boolean filled) {
		// TODO Auto-generated method stub
		this.filled = filled;
	}

	public void setcolor(String color) {
		// TODO Auto-generated method stub
		this.color = color;
	}

	public String getcolor() {
		Drawable.printMe();
		return this.color;
	}
	
	
	
	public boolean isFilled() {
	return this.filled;	
	}
	
//	public String toString(){
//		return "Shape, Color: "+getcolor()+"Filled: "+isFilled();
//	
//	}
	
	public abstract double getArea();
	
	
	public abstract double getPerimeter();

 public abstract String toString();// we can overide methods from concrete class and make them abstract 
 

 
 }
