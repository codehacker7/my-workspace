
public class LeapyearMehod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println(leapyear(2020));
	
	
	}
	
		public static boolean leapyear(int n1) {
			if(n1%4==0 ||  n1%400==0) {
				return true;
				
			}
			else
				return false;
		
		
		
		}
		
		




}
