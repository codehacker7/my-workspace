import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	
	FileInputStream in = new FileInputStream("c:/1/data.dat");
	
	int x = in.read();
	
	while(x!=-1) {
		System.out.println(x);
		x=in.read();
	}
	in.close();
	// you will observe that 0-9 will be printed two times because of true function in the output stream
	
	
	
	}

}
