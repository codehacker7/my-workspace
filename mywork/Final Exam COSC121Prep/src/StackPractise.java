import java.util.Stack;

public class StackPractise {
public static void main(String[] args) {
	
Stack c = new Stack();

c.push("A");
c.push("B");
c.push("C");
c.push("D");
removemiddle(c,0,4);

System.out.println(c);


//System.out.println(isValidparenthesis("image(loadImage(.png),x,y)"));
//System.out.println(isValidparenthesis("{((]]]"));


	
	

	
}

public static void removemiddle(Stack inputstack,int count,int size) {
	
	
	if(count==(size-1)/2) {
		inputstack.pop();
		return;
	}
	
	String num = (String)inputstack.peek();
	
	inputstack.pop();
	
	// RECURSSION
	
	removemiddle(inputstack,count+1,size);
	inputstack.push(num);
	
	
}

public static boolean isValidparenthesis(String expression) {
	
	Stack<Character> s=new Stack<>();
	
	for(int i=0;i<expression.length();i++) {
		
		
		char ch = expression.charAt(i);
		
		//opening bracket stack push
		if(ch=='(' || ch=='{' || ch=='[') {
			s.push(ch);
		    
		}
		else {
			if(!s.isEmpty()) {
				char top = s.peek();
				
					if(ch==')' && top =='('||
						ch=='}' && top =='{'  ||
						ch==']' && top =='[') 
				{
					s.pop();
				}
				
					else
					return false;
	}
	
			
			else {
				return false;
}
				
			
			}
		
		}
	
	
	if(s.isEmpty()) {
		return true;
	}
	else {
		return false;
	}
	
}



	
	
	
	
	
	
	
	
	
	
	
	
}





















































































*/