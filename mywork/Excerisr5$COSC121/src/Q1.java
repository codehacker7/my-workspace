import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Q1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//
//	DataOutputStream out = new DataOutputStream(new FileOutputStream("/Users/kavyanshbansal/Desktop/untitled folder/rename1.dat"));
//	
//	
//	for(int i=0;i<=100;i++) {
//		out.writeInt(i);
//	}
//	
//	out.close();
//	
//	
	
		
		values("/Users/kavyanshbansal/Desktop/untitled folder/rename1.dat");
		
		
	//FileInputStream in = new FileInputStream("/Users/kavyanshbansal/Desktop/untitled folder/rename.dat");
	}
public static void values(String file) throws IOException {
DataInputStream in = new DataInputStream(new FileInputStream(file));


int maximum=in.readInt();

while(in.available()>3) {
 
	int x = in.readInt();	
	
	if(x>maximum) {
		maximum = x;
	}
	
	
	
}


System.out.println("The maximum number that I found is "+maximum);

in.close();


}








}
