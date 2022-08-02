
public class PassbyValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 =2;
		int num2 =5;
		
		System.out.println("Before invoking num1 was "+num1 +" num2 was "+num2);
	     swap(num1,num2);
		System.out.printf("After invoking num1 is %d and num2 is %d ",num1,num2);

	}
		public static void swap(int n1,int n2) {
			
			int temp=n1;
			n1=n2;
			n2=temp;
			System.out.print(n1);
			System.out.print(" "+n2);
			System.out.println();
			
		
		}
		
		
		



}
