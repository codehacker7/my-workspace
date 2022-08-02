import java.util.Scanner;

public class Ans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner r=new Scanner(System.in);

			System.out.println("Enter the number of students: ");
	       	int number =r.nextInt();
		
	       	int[] array =new int[number]; 
	       	String[] array1=new String[number];
	       	
	       	int largest =0; 
	       	int secondlargest =0;
	       	
	       	for(int i=0; i<array.length;i++) {
	       		
	       	   System.out.println("Enter the value: ");
	       		array[i]=r.nextInt();
	       		
	       		System.out.println("Enter the name: ");
	       		array1[i]=r.nextLine();
	       		
	       		r.nextLine();
	       		
	       		if(array[i]>largest) {
	       			secondlargest =largest;
	       			largest = array[i];
	       			
	       		
	       		}
	       		
	       		
	       		
	       		else if(array[i]>secondlargest) {
	       			secondlargest = array[i];
	       			 
	       		}
	       	
	       	}
	
	       	System.out.println("The largest number is: "+largest);
	       	System.out.println("The 2ndlargest number is: "+secondlargest);
	
	
	
	
	
	
	
	
		}

}
