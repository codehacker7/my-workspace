import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner r=new Scanner(System.in);
		
		int GPA;
		int maxGPA=0; int name=0;
		System.out.println("Enter the number of students(1-30): ");
		int x=r.nextInt();
		
		while(x<0 || x>30) {
			System.out.println("Invalid please try again: ");
			x=r.nextInt();
			}

			for(int i=1; i<=x;i++) {
				System.out.println("Enter the GPA of student "+i);
				  GPA=r.nextInt();
			
			
				  while(GPA<0 || GPA>4) {
					  System.out.println("Invalid GPA. Please try again: ");
					  GPA=r.nextInt();
				  }
				  if(GPA>maxGPA) {
					  maxGPA=GPA;
					  name=i;
				  }
			
			
			}
					System.out.println("Top GPA is "+maxGPA+" of student "+name);
	
	
	}

}
