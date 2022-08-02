import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class EX1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		DataOutputStream out = new DataOutputStream(new FileOutputStream("c:/1/f.dat"));

	out.writeInt(345);
	out.close();
	System.out.println("success");
	
	
/*
 * we need to call the file ouput stream as for example say we wrote 4 as int to the dataoutputstram 
*  first it is converted to the binary than 
 * it is actually the fileoutput stream which breaks the 4 i nto 4 segments and send to the file using the write() method
	 byte by byte
 */
	
// now let me talk about DataInputStream if we need to read something datainputstream actually asks fileinputstreamm to send the data to it from the file
	
DataInputStream in = new DataInputStream(new FileInputStream("c:/1/f.dat"));

	
	
	System.out.println(in.readInt());
	in.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
