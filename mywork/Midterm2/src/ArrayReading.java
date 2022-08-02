
public class ArrayReading {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
int[] arr = {1,2,3};

printelement(arr,3);
		
		
		
	}
public static void printelement(int[] arr,int i) {
	
	try {
	System.out.println(arr[i]);

	
	}catch(IndexOutOfBoundsException e) {
		//e.printStackTrace();
		System.out.println(e.getMessage());
		System.out.println(e.toString());
		//System.out.println("Index out of bound exception");
	}
	
	}
}
