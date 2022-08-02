import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner r=new Scanner(System.in);
	
     
     System.out.println("Enter an integer: ");
     int integer=r.nextInt();
     
    
     System.out.println("Pattern I ");
     
     for(int row=1;row<=integer;row++) {
    	for(int column=1;column<=row;column++) {
    		System.out.print(column+" ");
    	
 
    	}
    	System.out.println();
  }
     
	System.out.println("\n pattern 2");
	
	for(int row=0;row<integer;row++) {
		for(int column=1;column<=integer-row;column++) {
			System.out.print(column+" ");
			
		}
	    System.out.println();
	
	}
	
	
	
	
	
	
	
	
	
	
	
	}

}
