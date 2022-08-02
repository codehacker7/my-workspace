
public class TV{
	private int channel;
	private int VolumeLevel;
	private boolean on;
	

	
      TV(){
    	 this.channel =1;
    	 this.VolumeLevel = 1;
    	 this.on = true;
      }
      
      



public void turnOn() {
	this.on = true;
}
public void turnOff() {
	this.on = false;

}
public void setChannel(int newChannel) {
this.channel = newChannel;

}
public void setVolume(int VolumeLevel) {
	this.VolumeLevel = VolumeLevel;
}
public void channelUp() {
	this.channel ++;
}
public void channelDown() {
	this.channel --;
}
public void VolumeUp() {
	this.VolumeLevel++;
}

public void VolumeDown() {
	this.VolumeLevel--;
}











}

