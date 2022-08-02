import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		
		DataOutputStream out = new DataOutputStream(new FileOutputStream("c:/1/f.dat",true));

		for(int i=0;i<10;i++)
			out.writeDouble(Math.random()*10000);
		out.close();
		System.out.println("success");
		
// as we have appended the program by writing a true i the arguments so each time we run the program we will actually rewrite same output 
		// so size of file becomes double
		// now abdallah ran the program twice so size o f file is 8*10*2=160 bytes
		
		
		DataInputStream in = new DataInputStream(new FileInputStream("c:/1/f.dat"));
for(int i=0;i<20;i++)
		in.readDouble();
		
//if we write in.readInt() we will see 40 outputs as for int 1 output is of 4 bytes so 160/4=40
// while(in.available()>0){
// in.readDouble();
		in.close();
	System.out.println("success");
		
		
		
		
		
		
	}

}
