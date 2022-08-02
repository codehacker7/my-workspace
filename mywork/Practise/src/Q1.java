import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	Scanner r = new Scanner(System.in);
	
	
	System.out.println("Enter the number of subjects: ");
	int x = r.nextInt();
	
	int y=1;
double sum =0;
	System.out.println("Enter your marks: ");
	while(y<=4) {
	int marks = r.nextInt();
	sum+=marks;
	y++;
		
	}
	
	double average = sum/x;
	
	System.out.println(average);
	if(average>=60 && average<70) {
		System.out.println("You are in the first divison");
	}
	
	else if(average>=70 && average<80) {
		System.out.println("You are in the second division");
	}
	
	else if(average>=80 && average<90) {
		System.out.println("You are above average student");
	}
	else {
		System.out.println("You are the topper");
	}
	
	
	
	}
	

}
