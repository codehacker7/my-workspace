import java.util.Scanner;

public class Q1$Defensive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner r = new Scanner(System.in);

int[] array = new int[50];
for(int i=0;i<50;i++) {
	array[i]= (int)(45+Math.random()*100);
}

System.out.println("Enter an index: ");
		
		
		boolean done = false;
		while(!done) {
			int x = r.nextInt();
			if(x>=0 && x<50) {
			System.out.println("The element is "+array[x]);
			done = true;
		}
		else {
			System.out.println("Out of bound. Try again: ");
		
		}
		
		}
		
	}

}
