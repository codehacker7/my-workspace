import java.util.Arrays;
import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner  r= new Scanner(System.in);
		
		System.out.println("Enter the number of rows n<100 : ");
int x = r.nextInt();




int[][] y = new int[x][x];

System.out.println("Enter the elements of a,row by row");
	
	for(int i=0;i<y.length;i++) {
		for(int j=0;j<y[i].length;j++) {
				y[i][j]= r.nextInt();
		}
	}
	
	int sum =0;
	int count =0;
	
	for(int i=0;i<y.length;i++) {
		sum+=y[count][count];
	count++;
	
	}
	
	System.out.println("The sum is : "+sum);
	
	
	
	

}
}