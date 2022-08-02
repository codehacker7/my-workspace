/*import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner r=new Scanner(System.in);
		
		System.out.print("Enter the number of students: ");
		int students =r.nextInt();
		
		int[] students1 = new int[students];
		String[] studentsname= new String[students];
		
	
		for(int i=0;i<students1.length;i++) {
			
			r.nextLine();
			
			System.out.print("Enter the students name: ");
			studentsname[i]=r.nextLine();
			
			//r.nextLine();
			
			
			System.out.print("Enter the score: ");
					students1[i]=r.nextInt();
					
	}

	
	
		 int m1 = students1[0];
	      int m2 = students1[1];
	
	     String highestscorer = studentsname[0];
	     String secondscorer = studentsname[1];
	      		
	      			if(m2>m1) {
	      				int temp;
	      				temp=m1;
	      				m1=m2;
	      				m2=temp;
	      			
	      				String temp1;
	      				temp1 = highestscorer;
	      				highestscorer = secondscorer;
	      				secondscorer = temp1;
	      			}
	      	
	      	
	      
	      
	      for(int i=2;i<students1.length;i++) {

	    	  
	    	  	if(students1[i]>m1) {
	    	  		m2=m1;
	    	  		m1= students1[i];
	    	  		secondscorer=highestscorer;
	    	  		highestscorer = studentsname[i];
	    	  		
	    	  	}
	    	  	else if(!(students1[i]>m1)    && students1[i]>m2) {
	            	  m2= students1[i];
	            	  secondscorer = studentsname[i];
	    	  	
	    	  	}
	      
	      
	      
	      
	
	}



	  	
	      	System.out.println("The highest score is "+m1+" scored by "+highestscorer);
	      	System.out.println("The second highest score is "+m2+" scored by "+secondscorer);
	
	}}*/
import java.util.Scanner;
class Solution {
	public static void main(String[] args) {
        //read user's weight and height
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your weight: ");
		double weight = in.nextDouble();
		System.out.println("Enter your height: ");
		double height = in.nextDouble();
        in.close();

        //write code here to display the right weight category
    height = height/100;
    double BMI = (weight)/(Math.pow(height,2));
    if(weight<0 || height<0){
        System.out.println("Invalid values");
    }
    else if(BMI<18.5){
        System.out.println("underweight");
    }
	else if(BMI>=18.5 && BMI<25){
        System.out.println("normal");
    }
    else if(BMI>=25 && BMI<30 ){
        System.out.println("overweight");
    }
    else if(BMI>=30){
        System.out.println("obese");
    }
    }
}
