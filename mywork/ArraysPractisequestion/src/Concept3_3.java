import java.util.Scanner;

public class Concept3_3 {

		public static void main(String[] args) {
			
				Scanner r=new Scanner(System.in);
		
				System.out.println("Enter the total numbers u want to enter: ");
				int y=r.nextInt();
				
				double[] nums = new double[y];
				
				double sum =0;
			
				for(int i=0; i<y; i++) {
					System.out.println("Enter the value: ");
					nums[i]=r.nextInt();
						sum+=nums[i];
				}
		
				double avg=(sum/y);
				System.out.println(avg);
				int count =0;
				
				for(int i=0; i<y;i++) {
					if(nums[i]>avg)
						count++;
				}
					
		
					System.out.println("The number of items above avgerage is "+count);
		
		
		
		}


}
