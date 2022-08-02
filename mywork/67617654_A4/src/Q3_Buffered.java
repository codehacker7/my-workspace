import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Q3_Buffered {

public static void main(String[] args) throws IOException {

long start = System.currentTimeMillis();
backup("/Users/kavyanshbansal/Downloads/A4 2/COSC121.pdf",0.25);
 restore("/Users/kavyanshbansal/Downloads/A4 2/COSC121.pdf",3);
long end = System.currentTimeMillis();
System.out.println("By the use of Buffered completed in "+(end-start));

}

public static int backup(String filename,double partSize) {
	try {
	File m = new File(filename);
	
	long n = m.length();
	System.out.println(n);	
	
	
	FileInputStream in = new FileInputStream(filename);
	
	
	int q =1;
	
	

	
	int r =(int)Math.ceil(n/(partSize*1000000));
	System.out.println(r);


	
	
	while(q<=r) {
	
		
BufferedOutputStream iu = new BufferedOutputStream(new FileOutputStream("/Users/kavyanshbansal/Downloads/A4 2/filename"+q+".txt") );



		for(int i = 0; i<partSize*1000000; i++) { //this loop ensures that the loop runs upto the specified filesize
		iu.write(in.read());
	}
		iu.close();
		q=q+1;
	}
	in.close();
		return (int)r;
	
	}catch(IOException e) {
		System.out.println("IO Exception occured");
	return -1;
	}
	
	
	
		}
public static int restore(String filename, int numberOfPieces)  {
	try {
	System.out.println("Restore started");
	File m = new File(filename);
	BufferedOutputStream iu = new BufferedOutputStream(new FileOutputStream(filename));
	for(int i=1;i<=numberOfPieces;i++) {
		
		FileInputStream in = new FileInputStream(("/Users/kavyanshbansal/Downloads/A4 2/filename"+i+".txt"));
	
	int x = in.read();
	
	
	
while(x!=-1) {
	iu.write(x);
	x = in.read();



}
		}
	
	
	
	
	return (int)m.length();
	}catch(IOException e) {
		System.out.println("IO Exception ocuured ");
		return -1;
	}
}
	
	



}