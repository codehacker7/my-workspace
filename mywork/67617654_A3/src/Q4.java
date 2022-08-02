import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Q4 {
public static void main(String[] args) throws FileNotFoundException {
	 String censoredWord[] = {"ABC", "XYZ"};
     //add code (1)

File source = new File("/Users/kavyanshbansal/Downloads/A3/source.txt");


PrintWriter out = new PrintWriter("/Users/kavyanshbansal/Downloads/A3/destination.txt");



Scanner r = new Scanner(source);
	
while(r.hasNext()) {
		
		String x = r.nextLine();
	
	
		String s =replaceCensoredWords(x,censoredWord);
	
	
		s=s.toUpperCase();
		out.write(s+"\n");
}
	 

out.close();
 r.close();
	 
		}
private static String replaceCensoredWords(String line, String[] censoredWords){
     //add code (2)

Scanner r = new Scanner(line);

String op="";

while(r.hasNext()) {
		String x = r.next();
		if(x.equalsIgnoreCase(censoredWords[0]) | x.equalsIgnoreCase(censoredWords[1])) {
			op=op+"...";
		}
		else {
			op=op+x+" ";
		}
	
	}
r.close();
return op;
	
	
	
}



}


