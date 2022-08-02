import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	int x = countText("http://ok.ubc.ca/welcome.html","</a>");
	System.out.println(x);
	
	}

public static int countText(String webaddress,String txt) throws IOException {
	URL url = new URL(webaddress);

int count =0;
	
	Scanner in = new Scanner(url.openStream());

	String s ;
	
while(in.hasNext()) {
	 s = in.next();

	 if(s.contains(txt)) {
		 count++;
	 }



}
in.close();
return count;








}
}













