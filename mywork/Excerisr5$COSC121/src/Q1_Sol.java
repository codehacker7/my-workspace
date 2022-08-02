
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Q1_Sol {
	public static void main(String[] args) throws Exception {
		//(a) write 10 random integers in integers.dat
		writeRandomIntegers("/Users/kavyanshbansal/Desktop/untitled folder/kavyansh.dat");
		
		//(b) open the file in a text viewer/editor
		// the file contains unreadable data:    D   B   	   5      a   A   Z   D   T
		
		//(c) print the max in integers.dat
		System.out.println("Max is: " + getMax("/Users/kavyanshbansal/Desktop/untitled folder/kavyansh.dat"));
		
		
	}

	public static void writeRandomIntegers(String filename) throws Exception{
		DataOutputStream out = new DataOutputStream(new FileOutputStream(filename));
		for (int i = 0; i <= 100; i++) 
			out.writeInt(i);
		out.close();
	}


	private static int getMax(String filename) throws Exception {
		//create an input stream object
		DataInputStream in = new DataInputStream(new FileInputStream(filename));
		//find the max
		int max = in.readInt();
		while(in.available()>3){
			int num = in.readInt();
			if(max < num) max = num;
		}
		//close the stream and return max
		in.close();
		return max;
	}

}
