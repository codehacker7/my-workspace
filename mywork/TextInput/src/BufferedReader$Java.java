import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReader$Java{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		

	System.out.println("What is your name?? ");
	String name = in.readLine();
	
	System.out.println(name);
	
	
	in.close();
	
	
	}

}
