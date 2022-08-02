
public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] list = {1,5,6,8,9,11,20};
		
		int key = 9;
		
		int idx = binarySearch(list,key);//list must be sorted
		
		System.out.println(idx);
		
		}

	private static int binarySearch(int[] list, int key) {
		// TODO Auto-generated method stub
		return binarySearch(list,key,0,list.length-1);
	}

	private static int binarySearch(int[] list, int key, int low, int high) {
		// TODO Auto-generated method stub
		
		int mid = (low+high)/2;
		//if key is found at mid return the key
		if(key==list[mid]) {
			return mid;
		}
		
		else if(low>high) {
			return -1;
		}
		// if no key can be found return -1
		// if key<middle elem then search left half
		
		if(key<list[mid]) {
			return binarySearch(list,key,low,mid-1);
		}
		// if key>middle elem then search right half
		if(key>list[mid]) {
			return binarySearch(list,key,mid+1,high);
		}

		return 0;
	
	}
		
		
		
	}


