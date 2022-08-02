
public class Farmer {
// instance variables
private String name;
private double weight;
private int x,y;

Farmer(String name,double weight,int x,int y){
	this.name = name;
	this.weight = weight;
	this.x = x;
	this.y = y;
	
}

public void moveUp() {
	y++;
}
	
public void movDown() {
	y--;
}
public void moveRight() {
	x++;
}
public void moveLeft() {
	x--;
}
	public void moveTo(int x ,int y ) {
		this.x = x;
		this.y = y;
	}
	
	Farmer(){
		
	}
	
	public void setname(String name) {
		this.name = name;
	
	}
	
	public String getname() {
		return name;
	}
	
	
	
	
	



}
