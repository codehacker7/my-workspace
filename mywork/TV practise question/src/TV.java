
public class TV {

int channel;
int volumeLevel;
boolean on;



		TV(){
			
		channel =1;
		volumeLevel =1;
		on = true;
		}
	
		void turnOn() {
		on = true;	

		}
		
		void turnOff() {
		on = false;	
		
		}

	void setChannel(int newChannel) {
		
		if(newChannel>120) {
			this.channel = 120;
		}
		else {
			this.channel = newChannel;
		}
	
	}
	
	void setVolume(int newVolumeLevel) {
		
	if(newVolumeLevel>7) {
		this.volumeLevel = 7;
	}
	
	else {
		this.volumeLevel = newVolumeLevel;
	}
	
	}
	
	void channelUp() {
		setChannel(channel+1);
	}
	
	void channelDown() {
		setChannel(channel-1);
	
	}
	
	void volumeUp() {
		
	setVolume(volumeLevel+1);
	
	}
	
	void volumeDown() {
		
		setVolume(volumeLevel-1);

	
	
	}
	






}
