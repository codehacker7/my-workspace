import java.util.Scanner;

public class Q2 {

	   public static void main(String[] args) {
		// TODO Auto-generated method stub

		//gives numbers from 1-10000
		  for (int number = 1; number <= 10000; number++) {
			 	int sum =0;
		   //gives factors
			 	for (int factor = 1; factor < number; factor++) {
		    if (number % factor == 0) {
		     sum = sum + factor;
		    }
		   }
		 
		   if (sum == number) {
		    System.out.println(number + " is a perfect number");
		   
		   }
		  }
		 
		 }
		 
		

		
		
		
	
	
	
	
	}


