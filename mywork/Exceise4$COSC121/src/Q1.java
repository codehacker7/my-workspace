import java.io.*;
public class Q1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


	
	copy("/Users/kavyanshbansal/Desktop/untitled folder/source.txt","/Users/kavyanshbansal/Desktop/untitled folder/destination.txt");
	
	}
	
	
	public static void copy(String source,String dest) throws IOException {
	
		FileReader m = new FileReader(source);	
		File v = new File(dest);
		
		File r = new File(source);
		
		
		BufferedReader in=new BufferedReader(m);
		PrintWriter x=  new PrintWriter(dest);;
		try {
			
			
	
		
		
		int y = in.read();
	
	while(y!=-1) {
		x.write(y+",");
		y = in.read();
	}
	
		}catch(FileNotFoundException e ) {
			System.out.println("Cant read as the file is not found");
		}
		if(!r.exists()) {
			System.out.println("Error file not found");
		}
		if(v.exists()) {
			System.out.println("Warning, destination already exists and will be overwritten");
		}
		
		
		in.close();
		x.close();
		
		
		
	}
	
}




//import java.io.File;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.Scanner;
//
//public class Q1 {
//	public static void main(String[] args) {
//		copy("source.txt", "destination.csv");
//	}
//	public static void copy(String sourcefile, String destFile) {
//		File source = new File(sourcefile);
//		File dest = new File(destFile);
//		boolean canCopy = true;
//		if (!source.exists()) {
//			System.out.println("Cannot find the source file.");
//			canCopy = false;
//		}
//		if (dest.exists()) {
//			System.out.println("Do you want to overwrite " + dest.getName() + " (Y/N)?");
//			Scanner in = new Scanner(System.in);
//			char ans = in.next().trim().charAt(0);
//			if (ans != 'Y' && ans != 'y') {
//				System.out.println("Destination will not be overwritten. Operation cancelled!");
//				canCopy = false;
//			}
//		}
//		if (canCopy) {
//			try (Scanner in = new Scanner(source); PrintWriter out = new PrintWriter(dest);) { // try
//				while (in.hasNext()) {
//					// read and write last name
//					in.next();
//					in.next(); // get rid of "Last" and "Name:"
//					out.print(in.next() + ","); // read last name and print it to destination file
//					// read and write first name
//					in.next();
//					in.next(); // get rid of "Last" and "Name:"
//					out.print(in.next() + ","); // read last name and print it to destination file
//					// read and write age
//					in.next(); // get rid of "Age:"
//					out.print(in.next() + ","); // can also use in.nextInt() but we don't have to read age as integer
//					// read and write ID
//					in.next(); // get rid of "ID:"
//					out.println(in.next()); // read ID from source.txt and put it into destination.txt followed by a new line
//				}
//				System.out.println("Copy finished.");
//			} catch (IOException e) {
//				System.out.println("Uknown I/O error.");
//			}
//		}
//	}
//}
//
