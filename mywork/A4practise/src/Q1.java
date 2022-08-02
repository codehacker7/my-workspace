import java.io.*;
public class Q1 {

	public static void main(String[] args) {

		viewHex("/Users/kavyanshbansal/Downloads/A4 2/data.dat"); //calls the method
	}

	private static void viewHex(String filename) {

		File f = new File(filename); //Creates a new fileobject based on the filename
		boolean operable = true; //this boolan checks all condition to ensure that the code is protected
		String all = ""; //a blank string that stores the hexadecimal lines

		if(!f.exists()) { //ensures that the file to be read exists and if it doesn't it terminates the program
			System.out.println("Cannot find the file to read");
			operable = false;
		}

		if(operable) {
			try(DataInputStream in = new DataInputStream(new FileInputStream(f))){

				boolean EOF = false;

				while(!EOF) { //this loop runs until the it reaches the end of the file 
					try {
                        
						all += Integer.toHexString(in.readInt()).toUpperCase();

					}catch(Exception e) {
						EOF = true;
					}
				}
			}catch(Exception e) {
				System.out.println("Unknown exception occured");
			}
		}
		
		
		boolean done = false;
		int j = 0;
		int pairnum = 0;
		int line = 0;
		
		while(!done) { //loop runs until it reaches the end of the string line; this loop is only for formatting the string
			try {
				
			System.out.printf(" %s"+"%s ", all.charAt(j) , all.charAt(j+1));
			j+=2;
			pairnum++;
			
			if(pairnum == 8) {
				if(line == 1) {
					System.out.println();
					line = 0;
					pairnum = 0;
					continue;
				}
				pairnum = 0;
				System.out.print(" | ");
				line++;
			}
			
			
			}catch(Exception e){
				done = true;
			}
		}

	}

}