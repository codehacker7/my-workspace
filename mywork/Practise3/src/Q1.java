
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
System.out.println(indexOf("kavyansh",'h'));
System.out.println(indexOf("okanagan",'a',4));
	
	
	}




public static int indexOf(String s, char ch) {
		int index =0;
	for(int i=0;i<s.length();i++) {
	char ch1 = s.charAt(i);
	if(ch1==ch) {
		index =i;
		}
	}
return index;

}

public static int indexOf(String s,char ch,int n) {
	
	int count =0;
	for(int i=0;i<s.length();i++) {
	char ch1 = s.charAt(i);
	if(ch1==ch) {
	
		count++;
	
		if(count==n) {
			return i;
		}
}

}


	return -1;


}
}
