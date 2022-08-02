import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Fileexistsfunction {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

	File f = new File("c:/1/test4.txt");
	if(f.exists()) {
		
		
		
		Scanner in = new Scanner(f);
		
		
		while(in.hasNext()) {
			if(in.hasNext())  System.out.println("Name: "+in.next());
		}
		
		
		in.close();
		
		
	}
		
			
			
			
			
	}

}
