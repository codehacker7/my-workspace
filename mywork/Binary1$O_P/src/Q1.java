import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Q1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
//		FileInputStream in = new FileInputStream("/Users/kavyanshbansal/Desktop/kavyansh.txt");
//		
//		int x = in.read();
//		
//		
//		while(x!=-1) {
//			System.out.println(x);
//			in.read();
//		}
//		
//		while(in.available()>0) {
//			
//		}
//		
		
		
		
//		DataOutputStream out = new DataOutputStream(new FileOutputStream("/Users/kavyanshbansal/Desktop/temp2.dat"));
//		
//		
//		for(int i=0;i<11;i++) {
//			out.writeInt(i);
//		}
//		out.close();
//		System.out.println("Done");
//		
//	}
	
	DataInputStream in = new DataInputStream(new FileInputStream("/Users/kavyanshbansal/Desktop/temp.dat"));
	
	while(in.available()>0) {
		System.out.println(in.readInt());
	}
	
	
	
	
	}

}
