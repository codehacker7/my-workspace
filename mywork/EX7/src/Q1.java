import java.util.Scanner;



public class Q1{
	
	public static void main(String[] args) {
		
		Scanner r =new Scanner(System.in);
	
		double[] scores = new double[100];
		
			System.out.println("Enter a new score(-1 to end): ");
			double x =r.nextDouble();
			
			double sum=0;
			int countabove =0;
			
			
			int count =0;
			
			while(x>0) {
				
				scores[count]=x;
				sum+=x;
				count++;
				System.out.println("Enter a new score(-1 to end): ");
				x =r.nextDouble();
				}
	
			double average = (sum/count);
			
			
			for(int i=0;i<scores.length;i++) {
				if(scores[i]>average) {
					countabove++;
				}
			}
			
			if(average>0) {
			
			System.out.println("The average is "+average);
			}
			System.out.println("total number of scores: "+count);
			System.out.println("Number of scores above the average are "+countabove);
			System.out.println("Number of scores below the average are  "+(count-countabove));
	
	
	
	
	
	
	}
	
	
	
	
}