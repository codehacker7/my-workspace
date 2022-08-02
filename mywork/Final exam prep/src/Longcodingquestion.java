
public class Longcodingquestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "4536007499016806";
		
		int[] ch1 = new int[s.length()];
		
		for(int i=0;i<s.length();i+=2) {
			char ch = s.charAt(i);
				ch1[i]= (ch-'0')*2;
				//	System.out.println(ch1[i]);
		}
		
		int[] sum = new int[s.length()];
		
		for(int i=0;i<16;i+=2) {
			if(ch1[i]/10>=1) {
				int digit1 = ch1[i]/10;
				int digit2 = ch1[i]%10;
				sum[i]+= digit1 + digit2;
			//System.out.println(sum[i]);
			
			}
		}
		int[] sum1 = new int[s.length()];
		for(int i=0;i<s.length();i+=2) {
			if(ch1[i]/10<1) {
				sum1[i]=ch1[i];
				//	System.out.println(sum1[i]);
			}
		}
		
	int sum2 =0;
		
	for(int i=0;i<s.length();i+=2) {
		sum2= sum2+(sum[i]+sum1[i]);
	}
	System.out.println(sum2);
	
	
	
	
	
	}

}
