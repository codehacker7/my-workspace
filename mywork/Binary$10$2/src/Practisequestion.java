import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Practisequestion {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
	DataOutputStream out = new DataOutputStream(new FileOutputStream("c:/1/data.dt"));
	
		out.writeUTF("John");//6
	out.writeDouble(85.5);//8
	out.writeUTF("Jim");//5
	out.writeDouble(185.5);//8
		out.close();
		
	DataInputStream in = new DataInputStream(new FileInputStream("c:/1/data.dt"));
	
	in.readUTF();
in.readDouble();
in.readUTF();
in.readDouble();
	in.close();
		
		
	}

}
