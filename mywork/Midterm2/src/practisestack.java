import java.util.ArrayList;
import java.util.Stack;

public class practisestack {
//
//	
//	ArrayList<E> list;
//	int size;
//	
//	public void push(E e) {
//		list.add(list.size()-1,e);
//		size++;
//	}
//	public E peek() {
//		return list.get(list.size()-1);
//	}
//	
//	public E pop() {
//		return list.remove(list.size()-1);
//	}
//
//
//public boolean isEmpty() {
//	if(list.size()==0) {
//		return true;
//	}
//	else {
//		return false;
//	}
//}

public static boolean isPalindrome(String s) {
	
	Stack<Character> c = new Stack<>();

for(int i=0;i<s.length();i++) {
char ch = s.charAt(i);
 c.push(ch);
}
	
	StringBuilder s2 = new StringBuilder();
	
	
	while(!c.isEmpty()) {
s2.append(c.pop());
	}
	
	
	if(s.equals(s2.toString())) {
		return true;
	}
	else {
		return false;
	}
	
}
public static void main(String[] args) {
	
	
System.out.println(isPalindrome("UBC"));
	
	System.out.println(isPalindrome("abcba"));
	
	
}


}
