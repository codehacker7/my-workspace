import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner r = new Scanner(System.in);
			
			System.out.println("How many numbers are there in the list? ");
			int x =r .nextInt();
			
			double[] d = new double[x];
			
			System.out.print("Enter the list: ");
			
			for(int i=0;i<d.length;i++) {
				d[i]=r.nextInt();
				}
				if(isSorted(d)) {
					System.out.println("The list is already sorted");
		}
				
				else {
					System.out.println("The list is not sorted");
	}
}



	public static boolean isSorted(double[] list) {
		
		for(int i=0;i<=list.length-1;i++) {
				if(list[i]>list[i+1]) {
					return false;
	}
}
		return true;
	}
}