import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	
		FileInputStream in = new FileInputStream("c:/1/data.dat");
		

		
		while(in.available()>0) {
			System.out.println(in.read());
		
		
		}
		// but the problem is available() method is less efficient 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
