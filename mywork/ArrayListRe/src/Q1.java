import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;



public class Q1 {
 public static void main(String[] args) {
	 
	 ArrayList<String> list = new ArrayList<>(Arrays.asList("A","B","C","D"));

// 
//for(int i=0;i<list.size();i++) {
//	System.out.println(list.get(i));
//}
// 
// for(String item: list) {
//	 System.out.println(item);
// }
// 
	 // using Iterator
 
 Iterator<String> it = list.iterator();
 
// while(it.hasNext()) {
//	 System.out.println(it.next());
// }
 // also we can remove the elements using Iterator
 while(it.hasNext()) {
	 String x = it.next();
it.remove();
 }
 System.out.println(list);
 
 
 }
}
