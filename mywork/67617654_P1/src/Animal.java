
public class Animal  {
private String name;
private double energy;
private boolean alive;
private double mealAmount;
private double x;
private double y;
private double speedX;
private double speedY;

Animal(){
	setEnergy(100);
	setSpeedX(1);
	setSpeedY(1);
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;

}

public double getEnergy() {
	return energy;
}

public void setEnergy(double energy) {
	
	if(energy<0)
	this.energy = 0;
	
	else if(energy>100)
		this.energy = 100;
	
	else if(energy<=17) {
		this.energy = energy;
		System.out.println(name+" is starving");
	}
	else if(energy>17 && energy<50) {
		this.energy = energy;
		System.out.println(name+" is hungry");
	}
	else {
		this.energy = energy;
	}
	
	
	
}

public boolean isAlive() {
	
	if(energy>0) {
	this.alive = true;	
	
	return true;
	}
	else {
				this.alive = false;
		return false;
	}
	}



public double getMealAmount() {
	return mealAmount;
}

public void setMealAmount(double mealAmount) {
	
	if(mealAmount<0 || mealAmount>100)
		System.out.println("Invalid input");
		else {
			this.mealAmount = mealAmount;
		}
	
}

public double getX() {
	return x;
}

public void setX(double x) {
	this.x = x;
}

public double getY() {
	return y;
}

public void setY(double y) {
	this.y = y;
}

public double getSpeedX() {
	return speedX;
}

public void setSpeedX(double speedX) {
	this.speedX = speedX;
}

public double getSpeedY() {
	return speedY;
}

public void setSpeedY(double speedY) {
	this.speedY = speedY;
}

public String toString() {
	if(isAlive()) {
	return name+" alive at "+"( "+getX()+", "+getY()+" )"+" Energy: "+getEnergy();
	}
	else
		return name+"dead "+"( "+getX()+", "+getY()+" )"+" Energy: "+getEnergy();
	
	}
public void move() {
	if(isAlive()) {
		x+= speedX;
		y+= speedY;
		energy-=0.1;
		
		
	}
	
	else if(alive==false) {
		System.out.println(name+" can't move. It is dead!");
	}
}

public void speak(String msg) {
	if(isAlive()) {
		System.out.println(name+" says : "+msg);
	}
}

public void sound() {
	if(isAlive()) {
		System.out.println("Unknown sound");
	}
}
	
public double eat() {
	
	if(isAlive()==false) {
		System.out.println(name+" is dead!");
			return 0;
	}
	
	else if(isAlive()==true && getEnergy()==100) {
		System.out.println(name+" didn't eat as it is full! ");
			return 0;
	}
	
	else {
		
		if(isAlive() && (energy+mealAmount)<=100) {
			System.out.println(name+" ate "+mealAmount+" units ");
			setEnergy(energy+mealAmount);	
			return mealAmount;
		}

		else {
			double x = 100 - energy;
			setEnergy(100);
			System.out.println(name+" ate "+x+" units, now it is Full! ");
			return x;
		}
		
	
		
		
	
	}

	

}





}



