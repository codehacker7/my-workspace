import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner r = new Scanner(System.in);

		
		ArrayList<Integer> y = new ArrayList<>();	
	
		/* Here i am taking user input for five integers using a for loop and then I declared an ArrayList in which i am 
		 * gradually adding the values and this ArrayList is passed to the method noDuplicates
		
		
		*/
		System.out.println("Enter five integers: ");
		
	for(int i=0;i<5;i++) {
		int x= r.nextInt();
		y.add(x);
	
	}
	
	
		
		System.out.println(noDulpicates(y));
	
		
		
		
	}

	
	public static ArrayList<Integer> noDulpicates(ArrayList<Integer> list){
		
	
		
	/*
	 
	 
	 In this method I decared a new ArrayList x and implemented a for loop which is less than size of Arraylist which
	 is passed in the main method and inside thr for loop I am getting all the elements of list ArrayList and if the new
	 ArrayList does not contain that element I am just adding it to the ArrayList
	 
	 
	 */
	ArrayList<Integer> x = new ArrayList<>();
	
	
	for(int i=0;i<list.size();i++) {
		
		int y = list.get(i);
		
		

		
		
		while(!x.contains(y)) {
			x.add(y);
		}
		
		
		
	}
	
	
	return x;
	
		
		
		
	}
	

	
	
	
}
