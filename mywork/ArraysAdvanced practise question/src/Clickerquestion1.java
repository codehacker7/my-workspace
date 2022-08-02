
public class Clickerquestion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = new int[6];// creates a reference variable a and an object in the memory
		int[] b=new int[4];// creates a reference variable b and an object in the memory
		int[]c =new int[6];//creates a reference variable c and an object in the memory

		a=b; //remove the object a and assingment and assings the memory address a to b ie a and b have same memory location  
	    a=c;//assign the memory address of a to c ie a and c now have same memoryb address now a is linked to c not b
	
	    // hence there are 3 refrences and 2 objects
	
	}

}
