import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=2000; i<=2010;i++) {
				if(isLeapYear(i)==true) {
					System.out.println(i+" has 366 days ");
				}
				else {
					System.out.println(i+" has 365 days");
				}
			
		}
	
	
	}

		public static boolean isLeapYear(int year) {
			if(year%4==0  || year%400==0){
				return true;
			}
			else {
				return false;
			}
		}




























}
