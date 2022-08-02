import java.util.Arrays;

public class Farmtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Farm myFarm = new Farm(); 
		  
		for(Animal a: myFarm.getanimals()) {      
		   
			  for(int i=0; i<(int)(Math.random()*1000); i++) 
			   a.move(); 
			  
		  }
		  
		  System.out.println("Before feeding: " + myFarm.getFood()); 
		  
		  myFarm.feedAnimals(); 
		  
		  System.out.println("After feeding: " + myFarm.getFood()); 
		  
		  myFarm.makeNoise(); 
		  
		  myFarm.getanimals()[0].speak("Hello!!"); 
		  
		  System.out.println(Arrays.toString(myFarm.getanimals())); 
		 
		}

}
