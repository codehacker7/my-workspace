
public class ForEachArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] x= {1,1,1} , y = {1,1,1};
		
		// this will not increment the array this just increments the temporary variable called item
		//disadvantage of for each loop
		for(int item:x) {
			item++;
		}

		// this loop increments the array because directly each element of y is incremented
	
		for(int i=0;i<y.length;i++) {
			y[i]++;
			
		}
		for(int i=0;i<y.length;i++) {
			System.out.println(y[i]);
		}
	
	
	
	}

}
