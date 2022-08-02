import java.util.Scanner;

public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner r=new Scanner(System.in);

		int x; int count=0;int positive=0; int negative=0;int odd=0;double sum=0;int count1=0;
		do {
		System.out.println("Enter the first integer(0 to terminate): ");
		 x=r.nextInt();
		 sum+=x;
			
			count1++;
			
			}while(x!=0);
		
		if(x%2==0) {
		count++;
		System.out.println("The number of even integers is: "+count);
		
		}
		else {
			System.out.println("The number of evens is 0");
		}
		
		if(x>0) {
			positive++;
			System.out.println("The number of positives is "+positive);
		}
		else {
			System.out.println("The number of positives is 0");
		}
		if(x<0) {
			negative++;
			System.out.println("The number of negatives is "+negative);
		}
		
		else {
			System.out.println("The number of negatives is 0 ");
		}
		if(x%2!=0) {
			odd++;
			System.out.println("The number of odd integers are "+odd);
		}
		else {
			System.out.println("The number of odds is 0");
		}
		
		
		System.out.println(sum);
		System.out.println(sum/count1);
		
		
	}

}
