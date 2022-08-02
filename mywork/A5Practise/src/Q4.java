import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner r = new Scanner(System.in);

		System.out.println("Enter the number of students: ");
		int z1 = r.nextInt();

		int score;
		int Maxscore = 0;
		String name;
		String nameofhighestscorer = null;

		for (int i = 1; i <= z1; i++) {

			r.nextLine();

			System.out.println("Enter name of student:  ");
			name = r.nextLine();

			System.out.println("Enter score of student: ");
			score = r.nextInt();

			if (score > Maxscore) {
				Maxscore = score;
				nameofhighestscorer = name;
			}
		}

		System.out.println("The highest score is " + Maxscore + " " + "scored by " + nameofhighestscorer);

	}
}