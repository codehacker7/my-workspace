
public class MoreStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		for(int row=0;row<=4;row++) {
//			for(int spaces = 4-row;spaces>0;spaces--) {
//				System.out.print(" ");
//			}
//			for(int col=row+1;col>0;col--) {
//				System.out.print("*"+" ");
//			}
//			
//			System.out.println();
//		}
//		
//		
		for(int row=0;row<=4;row++) {
			for(int spaces = 4-row;spaces>0;spaces--) {
				System.out.print(" ");
			}
			for(int col=1;col<=row+1;col++) {
				System.out.print(col+"");
			}
			
			System.out.println();
		}
		
		
		
		
		
	}

}
