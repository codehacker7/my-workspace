
public class Practisequestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int v = daysinMonth(13,2020);
			if(v>0)
				System.out.println("Valid");
			else
				System.out.println("Invalid bale tere shava tere");
			
			
	
	}
	
		public static int daysinMonth(int n,int y) {
		
			if( n==1 || n==3 || n==5 || n==7 || n==8 || n==10 ||n==12 ) 
				return 31;
			
			else if(n==4 || n==6 || n==9 || n==11)
				return 30;
			else if(n==2) {
				if(leapyear(y)==true)
					return 29;
				else
					return 28;
			
			}
			
			else
				return -1;
				
			
			
			
		}
		
		public static boolean leapyear(int r) {
					if(r% 4 == 0 || r% 400 == 0)
						return true;
					else
						return false;
		}


}
