import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class Circle extends Shape {

	public Circle() {
		// TODO Auto-generated constructor stub
		super();
	}
public 	String toString() {
	return "Circle, Color: "+getcolor()+"Filled: "+getfilled();
}


public static void main(String[] args) throws IOException {
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	String name = in.readLine();
}





}
