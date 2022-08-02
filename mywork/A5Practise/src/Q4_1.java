import java.util.Scanner;

public class Q4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner r=new Scanner(System.in);
			
		System.out.println("Enter number of students: ");
		int numStudents =r.nextInt();
		
		String name;
		double score;
		double max=0;
		double secondMax=0;
		String highestscorer= null;
		String secondScorer = null;
		
		for(int i=1; i<=numStudents;i++) {
			r.nextLine();
			System.out.println("Enter the name of student: ");
		    name=r.nextLine();
		
		   System.out.println("Enter the score of student: ");
		   score=r.nextInt();
		 
		  if(score>max) {
			secondMax=max;
			secondScorer=highestscorer;
			max=score;
			highestscorer=name;
			
}      else if(score<max && score>secondMax) {
	      secondScorer =name;
	      secondMax=score;
}
	
	
	
	
	
	
	}
			System.out.println("Top 2 students: ");
			System.out.println(highestscorer + "'s score is "+max);
			System.out.println(secondScorer+"'s score is "+ secondMax);

	
	
	
	
	
	}}
