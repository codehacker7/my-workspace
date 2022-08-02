import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// write strings
		
		
		DataOutputStream out = new DataOutputStream(new FileOutputStream("c:/1/f.dat",true));

	
			out.writeUTF("Abdallah Mohammed");// 18 bytes
		
			out.writeDouble(32.23);//8 bytes 
		out.writeInt(11);// 4 bytes
		
		
		// note char is always 2 bytes as it uses utf and utf is always 2 bytes 
		
		
		/*
		this whole out.write is represented as
		00001100011111 00110101  0100101001
		
		so how does java know where exactly to stop if we are reading the string
		
		so there are two ways one in which you can write 00000
		Second way is that the UTF method sets up a box which is of 2 bytes which counts
		number of charachters in the string so it records number of charachters and stops at the ending '
		charachter while we are reading strings but it do add size of 2 bytes to your program
		
		
		
		
		*/
		System.out.println("success");
out.close();
		
		DataInputStream in = new DataInputStream(new FileInputStream("c:/1/f.dat"));

		System.out.println(in.readUTF());
		System.out.println(in.readDouble());
		System.out.println(in.readInt());
in.close();
		System.out.println("success");
		
		
		
		
		
		
	}

}
