import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	DataOutputStream out = new 	DataOutputStream (new FileOutputStream("c:/1/nums.dat"));
	
	
	for(int i=0;i<10;i++) {
		out.writeDouble(Math.random()*100000);
		out.writeInt(2342);
		out.close();
	}
	
	DataInputStream in = new DataInputStream(new FileInputStream("c:/1/nums.dat"));
	
	
	boolean EOF = false;
	while(!EOF) {
		try {
			System.out.println(in.readDouble());
		}catch(Exception e) {
			EOF = true;
		}
	}
	
	in.close();
	
	
	
	
	
	
	
	
	
	
	}

}
