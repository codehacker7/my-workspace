import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	FileOutputStream out = new FileOutputStream("c:/1/data.dat",true);
	
	for(int i=0;i<10;i++) {
		out.write(i);
	}
	out.close();
	
	
	}

}
