import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner r=new Scanner(System.in);
			
		
		System.out.println("Enter the number of students (1-30): ");
		int x=r.nextInt();
		
		
		int GPA;int Maxgpa=0;
		
		
		while(x<1 || x>30) {
			System.out.println("Invalid number. Try again");
			x=r.nextInt();
		}   
		
		for(int i=1; i<=x;i++) {
			System.out.println("Enter the GPA of the student "+i+" :");
			GPA=r.nextInt();
			
		
			while(GPA<0 || GPA>4) {
				System.out.println("Invalid please rewrite the GPA: ");
				GPA=r.nextInt();
			}
			if(GPA>Maxgpa) {
				Maxgpa=GPA;
			}
		    
		     
		}
		 System.out.println("Top GPA is "+Maxgpa);
		
		
		
			
			

	
	
	}

}
