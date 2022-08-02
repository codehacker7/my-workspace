import java.io.File;

public class PathCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	
	public static String filefinder(String folder,File f) { 	
		
		String s ="";
		
		if(f.isFile()) {
			if(f.getPath().equals(folder)) {
				s+=f.getPath()+"\n";
			}
		}
		else {
			for(File item:f.listFiles()) {
			s+=filefinder(folder,item);
			}
		}
		
	
		return s;
		
		
		
}
		
	}


