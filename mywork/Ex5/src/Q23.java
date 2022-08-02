import java.util.Scanner;

public class Q23 {
		public static void main(String[] args) {
		
			Scanner r=new Scanner(System.in);
			
			System.out.println("Enter the email ");
			String email=r.nextLine();
			
			if(email.contains("@")) {
				System.out.print("Correct");
			}
			else {
				System.out.println("Wrong");
			}
		}
		
		
}
