import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ScannerWeb {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		URL url = new URL("http://ok.ubc.ca");
		
		Scanner in = new Scanner(url.openStream());
		
		while(in.hasNextLine()) {
			System.out.println(in.nextLine());
		}
		
		in.close();
		
		
		
	}

}
