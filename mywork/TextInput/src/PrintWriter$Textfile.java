import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriter$Textfile {

	public static void main(String[] args) throws FileNotFoundException  {
		// TODO Auto-generated method stub

		File source = new File("here you should put the path of the file");
		
		PrintWriter out = new PrintWriter(source);
		
		
		out.println("abc");
		out.println("xyz");
		
		out.close();
		
		
		
		
		
		
		
	}

}
