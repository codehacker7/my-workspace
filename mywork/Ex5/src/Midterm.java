import java.util.Scanner;

public class Midterm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	      Scanner r=new Scanner(System.in);
	    
	      	int count=0; int $=0;
	      System.out.println("Enter your email: ");
	      String email=r.nextLine();
	    
	      
	     /* char chh=email.charAt(0);
	      char chh1=email.charAt(1);
	      char chh2=email.charAt(2); char chh3=email.charAt(3);*/
	    /*  for(int i=0; i<4;i++) {
	    	  char chh =email.charAt(i);
	    	  boolean chh1= Character.isAlphabetic(chh);
	    	  if(chh1==true) {
	    		  count++;
	    	  }
	    	  
	    	
	    		  
	    	  }*/
	    	  
	     
	      for(int i=0;i<email.length();i++) {
	    	  char chh =email.charAt(i);
	    	  if(chh=='@') {
	    		  $++;
	    	  
	    	  }
	    	   }
	      
	if($>0) {
		System.out.println("Valid email");
	}
	
	else
		System.out.println("Invalid email");
	
	
	
	
	
	
	}}
	     
	      
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	