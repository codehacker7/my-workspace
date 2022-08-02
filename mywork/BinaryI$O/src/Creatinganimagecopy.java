import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Creatinganimagecopy {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
try {
		
		FileInputStream in = new FileInputStream("c:/1/frozen.jpg");
		FileOutputStream out = new FileOutputStream("c:1/frozen2.jpg");
		
		int b = in.read();
		while(b!=-1) {
			out.write(b);
			b=in.read();
		}
		in.close();
		out.close();
		System.out.println("Done copying ");
	
	}catch(Exception e) {
		System.out.println("Abhe chutiye ");
	}
}
}
