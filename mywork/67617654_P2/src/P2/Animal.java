package P2;

public abstract class Animal implements Comparable<Animal>,Cloneable {
	
	/*
	 It makes more sense to make animal class abstract because we can make the sound() class
	 abstract as we can make the methods like sound() abstract in the Animal class because sound() method in the animal 
	 class is just reduant  if you make it abstract then we can implmenent the methods in subclasses without actually 
	providing those methos with the code  
	*/
	private String name;
	private double energy, mealAmount, x, y, speedX=1, speedY=1;
	private boolean alive;	
	public Animal() {
		setEnergy(100);
	}
	public void speak(String msg){
		if (isAlive()) System.out.println(getName() + " says: " + msg);
	}
	public double eat(){
		if (isAlive()) {
			//get amount needed and round to 2 decimals
			double amount = Math.round((100-getEnergy())*100)/100.0;
			if (amount >= mealAmount) {
				System.out.println(getName() + " ate " + mealAmount + " units");
				setEnergy(getEnergy() + mealAmount);
				return mealAmount;
			} else if (amount > 0) {
				System.out.println(getName() + " ate " + amount + " units. Now it is full!");
				setEnergy(100);
				return amount;
			} else {
				System.out.println(getName() + " didn't eat. It is full!");
				return 0;
			}
		} else {
			System.out.println(getName() + " is dead!");
			return 0;
		}
	}
	
	public  int compareTo(Animal o) {
		if(this.getEnergy()>o.getEnergy()) {
			return 1;
		}
		else if(o.getEnergy()>this.getEnergy()) {
			return -1;
		}
		else
			return 0;
	}
	
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
	
	
	
	
	public void move() {
		if(isAlive()){
			x += speedX;
			y += speedY;
			setEnergy(getEnergy() - 0.1);
		}else
			System.out.println(getName() + "can't move. It is dead!");
	}
	public abstract void sound();
	
	/*
	Sound method is implemented in all the subclasses, which extends Animal class,
	but we need to have this method in the Animl class because according to the 
	Polymorphism rules you cannot call a method in the subclass which is not visible to the super class
	so what we can do here is that e can make the sound() class abstract so it can be implemented in all the subclasses
	without actually writing the code inside the sound() method in the Animal class
 
	
	*/
	
	
	
	
	//setters, getters, toStringi
	public String getName() {
		return name;
	}
	public double getEnergy() {
		return energy;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEnergy(double energy) {
		if(energy>0 && energy <=100) 
			this.energy = energy;
		if(this.energy <= 17 ) 
			System.out.println(getName() + " says: I'm STARVING");
		else if(this.energy <= 50) 
			System.out.println(getName() + " says: I'm hungry");
		this.alive = (energy > 0); 	
	}
	public double getMealAmount() {
		return mealAmount;
	}
	public void setMealAmount(double mealAmount) {
		if(mealAmount>0 && mealAmount<100) this.mealAmount = mealAmount;
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
	public boolean isAlive() {
		return alive;
	}
	public String toString(){
		//return String.format("Alive:%b Name:%-10sEnergy:%-7.1fLocation:(%-2.1f,%-2.1f)", isAlive(), name, energy,x,y); 
		return String.format("%-8s: %-5s at (%-2.1f,%-2.1f) Energy=%-7.1f", name, isAlive()?"alive":"dead",x,y,energy); 
	}	
}