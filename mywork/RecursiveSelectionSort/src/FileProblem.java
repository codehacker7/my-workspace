import java.io.File;

public class FileProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long size = getSize(new File(""));
		
	}

	private static long getSize(File f) {
		// TODO Auto-generated method stub
//if f is a file , then return f.length
		if(f.isFile()) {
			return f.length();
		}
		// else find sum of all items under f(the folder)
		else {
			long sum =0;
			
			for(File item :f.listFiles())
				sum+=getSize(item);
				
			return sum;
		}
		
	}

}
