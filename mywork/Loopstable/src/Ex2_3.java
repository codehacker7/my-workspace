import java.util.Scanner;

public class Ex2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner r=new Scanner(System.in);
		
		String reverse =" ";
		
		System.out.println("Enter a string: ");
		String s=r.nextLine();
		
		for(int i=s.length()-1;i>=0;i--) {
			reverse = reverse +  s.charAt(i);
		}
		System.out.println(reverse);
		

	}

}
