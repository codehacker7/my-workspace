import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class IsItFile {
public static void main(String[] args) throws FileNotFoundException {
	
File f = new File("c:/1/");


if(f.exists() && f.isFile()) {
	Scanner in = new Scanner(f);

while(in.hasNext()) {
	System.out.println(in.nextLine());
} 

try(PrintWriter out = new PrintWriter(new File("jcb"))){
	
out.println("abc");

	
}catch(Exception e) {
	
System.out.println("Error!");

}




}

}
}
