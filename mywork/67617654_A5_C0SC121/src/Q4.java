import java.io.File;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		listAllFiles(new File("/Users/kavyanshbansal/Desktop/airline files"));


	}
	
	
	public static void listAllFiles(File dir) {
		listAllFiles(dir," ");
	}
	
	

	public static void listAllFiles(File dir,String spaces) {
	
/* So here the logic that I used was dir is a file then just print its name else if it is a  folder
 
	print the name of folder than with the help of a for each loop i am extract each and every file from folder
	
	and call method again and again till the for each loop continues and i am increamenting spaces by a random amount 
	
	each time

	
	
*/
		if(dir.isFile()) {
			
		System.out.println(" "+dir.getName());
		}
		else {
		spaces = spaces+" ";
			if(dir.isDirectory()) {
				
			System.out.println("["+dir.getName().toUpperCase()+"]");
			
			for(File item:dir.listFiles()) {
				
				listAllFiles(item,spaces);
			
					}
		}
		}
		
	
		
	}
	
	
	
	
	
	
	
}
