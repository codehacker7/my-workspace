
public class Robot implements Cloneable{

int x,y;
Battery battery;


public Robot(int x,int y, Battery battery) {
	
this.x = x;
this.y =y;
this.battery = battery;

}


public Object clone() throws CloneNotSupportedException {
	//return super.clone();
	Robot r = (Robot)super.clone();

		r.battery= (Battery)battery.clone();

return r;


}

public void charge() {
	battery.charge =100;
	
}

 public void discharge() {
	 battery.charge =0;
 }

 
 public String toString() {
	 return String.format("x: %d, y: %d,Charge: %d",x,y,battery.charge);
 }








}
