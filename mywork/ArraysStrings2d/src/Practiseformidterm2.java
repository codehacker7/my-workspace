import java.util.Arrays;
import java.util.Scanner;
import java.util.Scanner;

public class Practiseformidterm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner r = new Scanner(System.in);
		
		int[] arr = {1,2,3,4,5,0};
		for(int i:arr) {
			arr[i]=i;
		}
		
		
	}
	
	public static int indexOf(String s, char ch) {
		
		//int index =0;
		
		for(int i=0;i<s.length();i++) {
			char ch1 = s.charAt(i);
			
				if(ch1==ch) {
					return i;
				}
			
		}
	
		return -1;
	
	}
	
public static int indexOf(int n,char ch,String s) {
	int index =0;
	int count =0;
	for(int i=0;i<s.length();i++) {
		char ch1 = s.charAt(i);
			if(ch1==ch) {
				count++;
				index =i;
			}
		
			if(count ==n) {
				return index;
			}
	}

	return -1;




}






}

















