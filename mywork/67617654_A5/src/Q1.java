import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner r=new Scanner(System.in);double sum=0;
		int count=-1;
		int even=0;
		int positive=0;
		int negatives=0;
		int odds=0;
		int x;
		do{
		System.out.print("Enter the  integer(0 to terminate): ");
	        x=r.nextInt();
	        
	        sum+=x;
		
	
		if(x%2==0 &&x!=0 ) {
			even++;
		}
		
		if(x>0)
			positive++;
	      
		if(x<0) 
		     negatives++;
		
		if(x%2!=0)
			odds++;
	
		count++;
	
		}while (x!=0);
		
       
		 		
		    System.out.println("Number of positives is "+positive);
		    System.out.println("The number of negatives is "+negatives);
		   	System.out.println("Number of evens are "+even);
		   	System.out.println("Number of odds is "+odds);
		    System.out.println("The sum is "+sum);
		  if(count>0)  System.out.println("The average is  "+sum/count);


	
	
	}}
