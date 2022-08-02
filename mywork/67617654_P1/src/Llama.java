
public class Llama  extends Animal {
	private static int z =1;
	public void sound() {
		if(isAlive()) {
			System.out.println("Hmmm!");
		}
	}
	
	public void Jump() {
		System.out.println("Llama can jump");
	}
	
	 Llama(){
		 setMealAmount(9);
		 setName("Llama"+z);
		z++;
	
	 }



}
