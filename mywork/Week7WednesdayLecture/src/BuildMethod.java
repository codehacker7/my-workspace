
public class BuildMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(areaofrectangle(-3,5));
		

	}

			public static double areaofrectangle(double width,double height) {
				
				
				if(width>=0 && height>=0) {
				double areaofrectangle = width*height;
				return areaofrectangle;
				}
				else
				{
					System.out.println("Invalid input");
				}
				return -1;
			
			
			
			
			}



}
