import java.io.File;
import java.util.Scanner;

public class Practisequestion {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long count = countInFolder(new File(""),"UBC");
		
	}

	private static long countInFolder(File f, String word) {
		// TODO Auto-generated method stub
		
		if(f.isFile()) {
			return countInFile(f,word);
		}
		else {
			long count =0;
			for(File item:f.listFiles())
				count+=countInFolder(item,word);
				return count;
		
		}
		
		
	}

public static int countInFile(File file,String word) {
	

int count =0;
try(Scanner in = new Scanner(file)){
	while(in.hasNext()) {
		
		if(in.next().contains(word))
		count++;
	}
	
	
}catch(Exception e) {
	
}

return count;



}

}
