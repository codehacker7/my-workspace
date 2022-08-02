import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner r=new Scanner(System.in);
			
			System.out.println("Enter the temp in celsius: ");
				int x=r.nextInt();
				
				System.out.println(toFahrenheit(x));
				
				while(x!=0) {
			
					x=r.nextInt();
					System.out.println(toFahrenheit(x));
				}
				
	
	
	
	
	}

		public static double toFahrenheit(double celsius) {
			
		double fahrenheit = (9.0/5)*celsius+32;
		
		return fahrenheit;
			
		
		}






}
