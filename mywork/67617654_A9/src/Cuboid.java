
public class Cuboid{

	private double l,w,h;
	private	String color;
	
	Cuboid(double l, double w ,double h, String color){
		
		setlength(l);
		setwidth(w);
		setheight(h);
		setColor(color);
			surfaceArea();
			getVolume();
	
	}
	
	
	Cuboid(){
		this.l =1;
		this.w =1;
		this.h =1;
		this.color = "white";
		
	}
	
	
		public double surfaceArea() {
			
			double surfacecuboid = 2*(l*w+l*h+w*h);
			
				return surfacecuboid;
		
		
		}
	
		public double getVolume() {
			
			double Volume = l*w*h;
			return Volume;
		}
		
			public void displayinfo() {
				
			
				System.out.println("Color: "+getcolor());
				System.out.println("Dimensions: "+this.l+" * "+this.w+" * "+this.h );
				System.out.println("Surface Area: "+surfaceArea());
				System.out.println("Volume: "+getVolume());
				
				System.out.println();
			
			}
			
			public double setlength(double l){
				
				this.l = l;
				return this.l;
				
				
			
				
			}
	
			public double setwidth(double w){
			
				this.w = w;
				return this.w;
			
			}
	
			public double setheight(double h){
				this.h = h;
				return this.h;
			
			}
			public String setColor(String color){
				this.color = color;
				return this.color;
			
			}
			
			public String getcolor() {
				return this.color;
			}
	
			
	
	
	
	
	
	
	
	
	










}


