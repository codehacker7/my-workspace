
public class Battery implements Cloneable {
int charge;




public Object clone() throws CloneNotSupportedException{
	return super.clone();
}



public Battery(int charge) {
	this.charge = charge;
}


}
