import java.util.Arrays;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);
		
	   
	    System.out.println("Enter three  letters: ");
	  
	    char largest = ' '; 
	    char middle = ' ';
	    char min = ' ';
	    char letter1 = in.next().charAt(0);
	    char letter2 = in.next().charAt(0);
	    char letter3 = in.next().charAt(0);

	    if ( letter1 > letter2 && letter1 > letter3 ){
	      largest = letter1;

	      if(letter2 > letter3){
	        middle = letter2;
	        min=letter3;
	      }
	      else if (letter3>letter2){
	        middle = letter3;
	        min=letter2;
	      }
	    }


	    else if ( letter2 > letter1 && letter2 > letter3 ){
	      largest = letter2;

	      if(letter3>letter1){
	        middle=letter3;
	        min=letter1;
	      }
	      else if (letter1>letter3){
	        middle=letter1;
	         min=letter3;
	      }
	    }

	    else if ( letter3 > letter1 && letter3 > letter2 ){
	      largest = letter3;

	      if(letter2>letter1){
	         middle=letter2 ;
	         min=letter1;

	      }
	      else if (letter1>letter2){
	        middle=letter1;
	         min=letter2;

	      }
	    } 
	    
	    
	   
	    System.out.println(min+" "+middle+" "+largest);
	
	}

}
