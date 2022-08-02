import java.util.ArrayList;
import java.util.Arrays;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
ArrayList<String> c1 = new ArrayList(Arrays.asList("A","B","A","D"));		
		
ArrayList<String> c2 = new ArrayList(Arrays.asList("A","X","Y","Z"));
		
System.out.println("c1: "+c1);
System.out.println("c2: "+c2);


ArrayList<String> c3 =  (ArrayList<String>) c1.clone();

System.out.println("B in c1> "+c3.contains("B"));
c3.remove("B");
System.out.println("B in c1> "+c3.contains("B"));



c3 = (ArrayList<String>) c1.clone();

c3.addAll(c2);

System.out.println("Items in c1 but not c2:  "+c3);


c3 = (ArrayList<String>)c1.clone();

c3.retainAll(c2);

System.out.println("Items in c1 (intersection) c2:  "+c3);




		
	}

}
