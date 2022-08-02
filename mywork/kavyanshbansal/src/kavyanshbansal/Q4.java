package kavyanshbansal;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 Scanner input = new Scanner(System.in);

	        System.out.print("Enter the number of student: ");
	        int numberOfStudents = input.nextInt();

	        System.out.print("Enter the Students name and score: ");
	        String name1 = input.next();
	        int score1 = input.nextInt();

	        System.out.print("Enter the Students name and score: ");
	        String name2 = input.next();
	        int score2 = input.nextInt();

	        int controlScore = score1;
	        String controlName = name1;
	        if (score1 < score2) {
	            score1 = score2;
	            score2 = controlScore;
	            name1 = name2;
	            name2 = controlName;
	        }

	        int i = 0;
	        while (i < numberOfStudents - 2) {
	            System.out.print("Enter the Students name and score: ");
	            String name = input.next();
	            int score = input.nextInt();

	            if (score > score1) {
	                score2 = score1;
	                name2 = name1;
	                score1 = score;
	                name1 = name;

	            } else if (score > score2) {
	                score2 = score;
	                name2 = name;
	            }

	            i++;
	        }
	        System.out.println("Top student1 " + name1 + "'s score is " + score1);
	        System.out.println("Top student2 " + name2 + "'s score is " + score2);


	}

}
