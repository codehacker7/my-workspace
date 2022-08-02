
public class Chicken extends Animal {
private static int z =1;
	public void sound() {
		if(isAlive()) {
			System.out.println("Cluck!");
		}
	}
	
	public void swim() {
		System.out.println("chicken can swim");
	}
	
	 Chicken(){
			 setMealAmount(5);
		 setName("Chicken"+z);
		z++;
	
	 }

}
