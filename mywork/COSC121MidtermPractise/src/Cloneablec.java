
public class Cloneablec implements Cloneable {

public int x,y;
public Employees b;

Cloneablec(int x,int y){
	this.x = x;
	this.y=y;
	b= new Employees();
}

public Object clone() throws CloneNotSupportedException{

	Cloneablec c = (Cloneablec)super.clone();
	c.b = (Employees)b.clone();
	
	return c;
	






}



}
