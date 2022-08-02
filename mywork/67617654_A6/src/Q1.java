import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner r=new Scanner(System.in);

				
		System.out.println("Enter the time in seconds: ");
			int s = r.nextInt();
	
				System.out.println(convertTime(s));
	
	}


		public static String convertTime(int totalSeconds) {
			
		
			int minutes = (totalSeconds%3600)/60;
			int hour = totalSeconds/3600;
			int leftseconds = (totalSeconds%3600)%60;
			
			
			String finaloutput = ""+hour + ":"+minutes+":"+leftseconds;
			
					return finaloutput;
		
		
		}


}


