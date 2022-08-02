
public class Cow extends Animal{
	private static int z =1;
	public void sound() {
		if(isAlive()) {
			System.out.println("Moo");
		}
	}
	
	public void Milk() {
		System.out.println("Cow can drink milk");
	}
	
	 Cow(){
		setMealAmount(20);
 setName("Cow"+z);
		
	
	 }

	 








}
