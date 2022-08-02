
public abstract class Shape implements Cloneable,Comparable<Shape>{
	//attributes
	private String color;
	private boolean filled;
	//constructors
	protected Shape(){this("White", true);}
	protected Shape(String color, boolean filled){
		setColor(color);
		setFilled(filled);
	}
	//methods
	public String getColor(){return color;}
	public void setColor(String color){this.color = color;}
	public boolean isFilled(){return filled;}
	public void setFilled(boolean f){filled = f;}
	public String toString(){
		return "Color: " + color + ". " + (filled? "Filled. ":"Not filled. ");
	}
	public abstract double getArea();
	public abstract double getPerimeter();
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public int compareTo(Shape shp) {
		
		return (int)(this.getArea()-shp.getArea());
		
//		if(shp instanceof Hexagon) {
//			System.out.println("Clonned hexagon ");
//			
//			if(this.getArea()>shp.getArea()) {
//			System.out.println("Clonned hexagon has lesser Area");
//				return -1;
//			}
//		
//			else if(shp.getArea()>this.getArea()) {
//				System.out.println("Clonned hexagon has more Area");
//				return 1;
//			}
//		
//			else {
//				System.out.println("Both hexagons are identical");
//				return 0;
//			}
//		}
//		
//		
//		else {
//			System.out.println("Clonned Rectangle ");
//			if(this.getArea()>shp.getArea()) {
//				System.out.println("Clonned Rectangle has lesser Area");
//				return 1;
//			}
//		
//			else if(shp.getArea()>this.getArea()) {
//				System.out.println("Clonned Rectangle has more Area");
//				return -1;
//			}
//		
//			else {
//				System.out.println("Both Rectangles are identical");
//				return 0;
//			}
//		}
		
	}
		

	
	
	
	
	
	
	
	
	
	
	
	}







