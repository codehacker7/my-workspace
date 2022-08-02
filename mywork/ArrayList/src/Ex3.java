import java.util.ArrayList;
import java.util.List;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// instead of intialilizing arraylist with add we can use ListOf operator
		
		ArrayList<String> list = new ArrayList<>(List.of("A","B","X","A","A","Y"));
		
		//list.set(0,"Z");
		
		// you can also use the clear method to emty the list
		//list.clear();
	
		
		//you can also remove by a specific element
//	boolean found =	list.remove("Z");
//		if(found) {
//			System.out.println("Z was found and removed");
//		}
//		else {
//			System.out.println("Z was not found in the list");
//		}
		
	
		
		// But if you use list.remove(int) ie by index you can check which ement was removed by 
		//System.out.println(list.remove(0));
		
		System.out.println(list.indexOf("A"));
		
		// if list.contains("A")
		//if(list.isEmpty())
		
		// we can access the size of the arraylist
	if(list.size()==0) {
			System.out.println("Empty");
		}
	
	
	//we can trim the size of the arrayList
	
	list.trimToSize();
	// deletes the non used portion of arrayList
	
		
		
		System.out.println(list);
		
		
		
		
		
		
	
	}

}
