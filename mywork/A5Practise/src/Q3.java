
	import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
      		// TODO Auto-generated method stub
				Scanner r = new Scanner(System.in);

				System.out.println("Enter three edges(length in double):   ");
				double x = r.nextDouble();
				double y = r.nextDouble();
				double z = r.nextDouble();

				if (x >= 0 & y>=0 & z>=0) {
					
							if(x+y>z & y+z>x  & x+z>y) {
								double perimeter =  x+y+z ;
								System.out.println("Perimeter is "+perimeter);
								
								}
							else {
								System.out.println("Input is invalid");
							}
				}
				else {
					System.out.println("Input is invalid");
				}
				
				int  num =99;
				if(num>=95)
					System.out.println("big");
				
					if(num==95)
						System.out.println("kav");
				else
					System.out.println("small");
			

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	

	
	
	
	
	
	
	
	
	
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	}

}
