import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File source = new File("/Users/kavyanshbansal/Desktop/Emily.docx");
		Scanner in = new Scanner(source);
		try{
		while(in.hasNextLine()) {
		System.out.println(in.next());
		System.out.println(in.nextInt());
		System.out.println(in.nextInt());
		}
		} catch(NoSuchElementException e) {
	System.out.println("No such element");
		}
	
	//System.out.println(r.next());
//	System.out.println(r.next().charAt(0));
	
	in.close();
	
	
	}

}
