import java.util.Arrays;

public class Primenumber {
	public static void main(String[] args){
		
	int count =0;
	for(int i=1;i<=20;i++) {
		for(int j=1;j<=20;j++) {
		if(i%j==0) {
		count++;
	}
	 }
		
		 if(count>2) {
			System.out.println((int)(i)+ " is Not a prime number");
				count=0;
		 }
		else {
			System.out.println((int)i+ " is  a prime number");
				count=0;
		}
	
	}
	
	
	
	
	
	
			
	
	
	
	
}
}