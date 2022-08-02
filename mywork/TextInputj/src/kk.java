import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class kk {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		Scanner r = new Scanner(System.in);
		
	boolean done = false;
	while(!done) {
		try {
			System.out.println("Enter your age: ");
			int x = r.nextInt();
			done = true;
		}
		catch(Exception e ) {
			System.out.println("Age must be an integer");
				r.nextLine();
		
		}
			
	}
		
		
		
		
	}

}
