import java.util.Arrays;

public class Excerise {

	public static void main(String[] args)
	{
		
		int[] a = {5,4,3,2,1};
		//System.out.println(binarySearch(a,7,0,4));
			sort(a,0,4);
	
			System.out.println(Arrays.toString(a));
	
	
	
	
	
	}
	
	public static int binarySearch(int[] a,int key , int low,int high) {
		
		Arrays.sort(a);
		
		int midindex = (low+high)/2;
		int midelem = a[midindex];
		
		if(low>=high) {
			return -1;
		}
		
		
		if(key==midelem) {
			return midindex;
		}
		
		else if(key<midelem) {
			return binarySearch(a,key,low-1,high);
		}
		
		else if(key>midelem) {
			return binarySearch(a,key,low+1,high);
		}
		
	
		
		return -1;
		
	}
	
	public static void sort(int[] a,int low,int high) {
		
		
				
		if(low<=high) {	
			for(int i=low;i<i+1;i++) {
				int elem = a[low];
				int index = low;

				for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					index = j;
					elem = a[j];
				}
}

			int temp = a[low];
			a[low]=elem;
			a[index]= temp;
			
		
			
			}
			
			
			sort(a,low+1,high);
			
			int[] x, y = {4,6,16,18}, z = {20,29};
			
		
	}
	
	
		

	
	
	}
	
	
	
	
	
}
