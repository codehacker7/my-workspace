import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Q1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
int count =0 ;
File f = new File("count.dat");
if(f.exists() ) {
DataInputStream in = new DataInputStream(new FileInputStream("count.dat"));
	count = in.read();
DataOutputStream  out =  new DataOutputStream(new FileOutputStream("count.dat")) ;
		out.write(++count);
		out.close();
		in.close();
}
else {
	DataOutputStream  out =  new DataOutputStream(new FileOutputStream("count.dat")) ;
	out.write(1);
	out.close();
}
	
System.out.println("The program has been executed "+count+" times");
	

	
		
	}
}

	

