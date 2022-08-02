import java.util.Arrays;
import java.util.Scanner;

public class Arrey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			Scanner r=new Scanner(System.in);
//			
//				  System.out.println("Enter the no of students: ");
//				    int students =r.nextInt();
//				
//				   int[] students1 = new int[students];
//				   
//
//				    		int largestnumber =0;
//				    		int secondlargest=0;
//				    		
//				    		for(int i=0;i<students1.length;i++) {
//				    			
//				    		   System.out.println("Enter the value: ");
//				 		        students1[i]=r.nextInt();	
//				    			
//				    				if(students1[i]>largestnumber) {
//				    					secondlargest =largestnumber;
//				    					largestnumber =students1[i];
//				    				}
//				    				else if(students1[i]>secondlargest) {
//				    					secondlargest = students1[i];
//				    				}
//				    		
//				    		
//				    		}
//	
//
//	
//				    			System.out.println("The highest score is "+largestnumber);
//				    			System.out.println("The secondhighest score is "+secondlargest);
	
	
	
//	
//	int[][] x4 = {
//			{1,2,3},
//			{4,5,6},
//			{4,8,9}
//			
//			
//	};
//	

	
	int[] d = {1,2,3,4,5};
	//         0 1 2 3 4
	
	// reverse 5 4 3 2 1
	//         0 1 2 3 4
	
	reversearray(d);
		
		
	}
public static void reversearray(int[] a) {
	int x =0;
	int temp =0;
for(int i= a.length-1;i>=0;i--) {
	temp = a[4-i];
	a[4-i]=a[x];
	a[x]=temp;
	x++;
	System.out.println(x);
}
	System.out.println(Arrays.toString(a));
	
	
	
	
	
	
}
}
