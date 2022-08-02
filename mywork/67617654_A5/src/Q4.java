import java.util.Scanner;

public class Q4 {

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

r.close();

	  	
	      	System.out.println("The highest score is "+m1+" scored by "+highestscorer);
	      	System.out.println("The second highest score is "+m2+" scored by "+secondscorer);
	
	}}