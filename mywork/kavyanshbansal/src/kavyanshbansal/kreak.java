package kavyanshbansal;

import java.util.Scanner;

public class kreak {
       public static void main(String[] args) {
   
    	   
    	   
    	   Scanner r=new Scanner(System.in);
    	   		int sum=0;int count=0;
    	   		
    	   		System.out.println("Enter the number");
    	   		int x=r.nextInt();
    	   		while(x!=0) {
    	   			count++;
    	   			sum+=x;
    	   			System.out.println("Enter the integers(0 to end): ");
    	   			x=r.nextInt();
    	   			
    	   		}
    	   		if(count>0)
    	   		System.out.println(sum/count);
       
 }}

