package kavyanshbansal;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int day = 2;
		String dayType=switch(day) { 
		
			       case 1:
			           	yield "Weekday";
			       case 2,7:
			    	   yield "Sunday";
			       default:
			    	   yield "Chutiye";
				};
		System.out.println(dayType);
		
		
		
		
		
	
	
	
	
	
	}}