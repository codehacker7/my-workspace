import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Scannerkeyb {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		//Scanner in = new Scanner(new File("Macintosh HD/Users/kavyanshbansal/Desktop/Emily.docx"));

		File source = new File("/Users/kavyanshbansal/Desktop/interview resume.docx");
		
		//open stream
		Scanner in = new Scanner(source);
		//read/write

//		while(in.hasNextLine()) { this code here has a problem it would be an infinite loop as NextLine() reads even empty string so infinite
//
//		while(in.hasNext()) {		 //this code is correct because hasNext() always looks for a token -
//		//	System.out.println(in.nextLine());
//	if(in.hasNext())	System.out.println("Name: "+in.next());
//	if(in.hasNextInt())	System.out.println("Age: "+in.nextInt());
//	if(in.hasNext())	System.out.println("Country "+in.next());
//		
	
//3)CLOSE the stream		

		
		
		
		System.out.println(in.nextLine());
		in.close();

	
	
	}



}
