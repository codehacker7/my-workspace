
public class Farm extends Animal{
private double food;
	Animal[] animals = new Animal[4];
	
	Farm() {
	 	animals[0]= new Chicken();
		animals[1]= new Cow();
		animals[2]= new Llama();
		animals[3]= new Llama();
		setFood(1000);
	
	}
	
public void makeNoise() {
		for(int i=0;i<animals.length;i++) {
			animals[i].sound();
		}
}

public void feedAnimals() {
	for(int i=0;i<animals.length;i++) {
			if(getFood()>=animals[i].getMealAmount()) {
				food=getFood()-animals[i].eat();
			
			}
			
			else {
				System.out.println("Not enough food");
			}
	
	
	}
	
	
	
}

public double getFood() {
	return food;
}

public void setFood(double food) {
	this.food = food;
}

public Animal[] getanimals() {
	return animals;
}




}
