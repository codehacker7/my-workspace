
public class Farmer {

// attributes
private String name;
private double weight;
private int x,y;


// constructors
// to prevent error we create a constructor

public Farmer(){
name = "Aninymous";	

}

public Farmer(String name,double weight,int x,int y){

	this.setName(name);
	this.setWeight(weight);
	this.setX(x);

	//name =n;
	//weight =w;
	//x =a;
	//y =b;

}

// if u dont add a constructor to your code java will do it for u
// say in this case it will be Farmer()

public void moveUp() {y++;}
public void moveDown() {y--;}
public void moveLeft() {x++;}
public void moveRight() {x--;}
public void moveTo(int a,int b){
	x=a;
	y=b;
}
public void display() {
	System.out.printf("Name:%s, Weight :%1f, xy-location:(%d,%d)\n",name,weight,x,y);
}
public void setName(String name) {
	this.name = name;
}

public void setWeight(double weight) {
	this.weight=weight;
}
public void setX(int x) {
	this.x = x;
}

}
