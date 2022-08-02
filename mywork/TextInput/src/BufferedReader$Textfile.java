import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader$Textfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		BufferedReader in = new BufferedReader(new FileReader("this is path of the file"));
		
		
		
//		System.out.println(in.readLine());
		
			
		String s;
		while((s=in.readLine())!=null) {
			System.out.println(s);
		}
		
		in.close();
	}

}
