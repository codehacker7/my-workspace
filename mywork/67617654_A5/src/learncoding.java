import java.util.Scanner;

public class learncoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n1 =input.nextInt();
		int n2 = input.nextInt();
		input.close();
	
	
			int sum=0;
			for(int i=n1;i<=n2;i++) {
				if(i%2!=0) {
					sum+=i;
				}
			}
			System.out.println(sum);
	
	
	
	
	}

}
