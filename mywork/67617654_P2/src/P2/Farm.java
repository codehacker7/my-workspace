package P2;

import java.util.Arrays;

public class Farm implements Cloneable {
	private double availableFood;
	private Animal[] animals;

	
	public Farm() {
		
		setAvailableFood(1000);
	   animals = new Animal[100];
	   	add(new Chicken());
	   	add(new Cow());
		add(new Llama());
		add(new Llama());
	}

public static int z =0;
	
public boolean add(Animal anim) {
		if(z<=99) {
		animals[z]= anim;
		z=z+1;
		return true;
	}
	else {
		return false;
		
	}
	
	}
	
	
	
	
	public void makeNoise(){			// all animals make their sound (Moo, Cluck, etc)
		for(Animal animal: animals)
			animal.sound();
	}
	public void feedAnimals(){ 			// restore energy of all animals and deduct amount eaten from availableFood
		for(Animal animal : animals)
			if(availableFood >= Math.min(animal.getMealAmount(), (100-animal.getEnergy()))) 
			// no penalty if student uses:  if(availableFood >= animal.getMealAmount())
				availableFood -= animal.eat();
			else
				System.out.println("Not enough food for your animals! You need to collect more food items.");
	}
	public double getAvailableFood() {
		return availableFood;
	}
	public void setAvailableFood(double availableFood) {
		if(availableFood>=0 && availableFood<=1000)
			this.availableFood = availableFood;
	}
	
	public Animal[] getAnimals() {
		Animal[] array = new Animal[z];
	
		
	for(int i=0;i<z;i++) {
			array[i]= animals[i];
		} 
	
	
	
	return array;
	}	


	
public void animSort() {

	Animal[] array = getAnimals();
	
	
	
	Arrays.sort(array);
	
	for(int i=0;i<z;i++) {
		animals[i]=array[i];
	}
	
	
	

	

}






public boolean addClone(Animal anim) throws CloneNotSupportedException {

	if(z<=99) {
	animals[z]=(Animal) anim.clone();
	z++;
	return true;
	}
	else {
		return false;
	}
	

}

public Object Clone() throws CloneNotSupportedException {
	return super.clone();
}

public void printAnimals() {
	

for(int i=0;i<z;i++) {
	System.out.println(animals[i]);
}


}
int chicken =0;

public int getNumChicken() {
	
	for(int i=0;i<z;i++) {
		if(animals[i] instanceof Chicken) {
		chicken++;	
		}
	}
	return chicken;
	
}

int cows =0;

public int getNumCows() {
	
	for(int i=0;i<z;i++) {
		if(animals[i] instanceof Cow) {
		cows++;	
		}
	}
	return cows;
	
	
}
int Llams =0;
public int getNumLlams() {
	

	for(int i=0;i<z;i++) {
		if(animals[i] instanceof Llama) {
		Llams++;	
		}
	}
	return Llams;
	

}


public void printSummary() {
	
System.out.print("The farm has "+z+" animals"+"( "+getNumChicken()+" Chicken , "+getNumCows()+" Cows, "+getNumLlams()+" Llams )");
System.out.println();

System.out.println(getAvailableFood()+" units of available food");
}























}



