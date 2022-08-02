import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class EX2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

DataInputStream in = new DataInputStream(new FileInputStream("c:/1/file.dat"));
	System.out.println(in.readByte());
	System.out.println(in.readByte());
	System.out.println(in.readByte());
	System.out.println(in.readByte());
	in.close();
	
	
	/*
	 
	 When we run this code we dont see 345 on the screen we in fat see 0 0 1 89 as output
	 because 345 is stored in binary in the computer so binary represention is shown here
	 
	
	 
	 
	 
	 
	 
	 */
	
	
	
	
	
	
	
	}

}
