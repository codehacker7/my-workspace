import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex1 {
public static void main(String[] args) throws IOException {
	
// open the stream
	
	FileOutputStream out = new FileOutputStream("c:/1/data.dat");

for(int i=0;i<10;i++) {
	out.write(i);
}

// 3 close
out.close();

System.out.println("Writing Done!");


//Reading
FileInputStream in = new FileInputStream("c:/1/data.dat");

for(int i=0;i<10;i++) {
int x = in.read();

// for(int i=0;i<20;i++){
// if i try to read 20 elements in a file which just has 10 elements it will return bunch of -1

//}
	
	System.out.println(x);
}
in.close();




}
}
