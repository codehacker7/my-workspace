import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Q2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		viewHex("/Users/kavyanshbansal/Downloads/A4 2/data.dat");
		
	
	}
	private static void viewHex(String filename) {
		try {
	int count =0;
		FileInputStream in = new FileInputStream(filename);
	
		String s = "";
		
		int x = in.read();
		
		while(x!=-1) {
			String m = Integer.toHexString(x);
			
			
			if(m.length()==1) {
				s=s+"0"+m+" ";
				
			}else {
				s=s+m+" ";
			}
		
		
			s=s.toUpperCase();
		count++;
		
		


		x = in.read();
		if(x==-1) {
		 System.out.print(s);
		}
	

			if(count==8) {
				System.out.print(s+"| ");
				s="";
				
			}
	
			else if(count==16) {
				System.out.print(s);
			System.out.println();
			count =0;
			s="";
		}		
			}
		in.close();
		System.out.println();
		}catch(IOException e) {
			System.out.println("IO Exception Error");
		}
	
	}













}



