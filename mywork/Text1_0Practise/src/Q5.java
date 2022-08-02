import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		URL c = new URL("https://ok.ubc.ca/");
		
		
		Scanner in = new Scanner(c.openStream());
		
		while(in.hasNext()) {
			System.out.println(in.nextLine());
		
		}
		
		in.close();
		
		
	}

}
