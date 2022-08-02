
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
												int counting=0;
				for(int y=100; y<=200;y++) {
					if(y%5==0 ^ y%6==0) {
						System.out.print(y+" ");
						counting++;
						
						if(counting==10) {
							counting=0;
							System.out.println();
							}}  
					
				}}}