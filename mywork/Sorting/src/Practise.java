import java.util.Arrays;

public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a = {3,2,5,4,1};
		selectionsort(a);
 	System.out.println(Arrays.toString(a));
		
	}
	public static void selectionsort(int[] a) {
		
		for(int i=0;i<a.length;i++) {
			int min = a[i];	
			int index = i;
			for(int j=i;j<a.length;j++) {
				if(min>a[j]) {
					min = a[j];
					index = j;
				}
					}
	
					int temp = a[i];
					a[i]=min;
					a[index]= temp;
		}
		
		
		
		
	}
	
	

	
	public static void inserationSort(int[] list) {
		
	
		
		for(int i=1;i<list.length;i++)
		{
			// keep a copy of e
			int e = list[i];
			int phs;
			for(phs = i;phs>0;phs--) {
				if(list[phs-1]>e) {
					list[phs] = list[phs-1];
				}
				else
					break;
			}
			list[phs]=e;

		}
		
		
		
	
		
		
		
		
		
	}
	
	
	
	public static boolean sort(int[] a , int low,int high) {
		
		
		if(low==high) {
																					// consider if we have 12345 here low can be max 4 and high can be max 4  System.out.println("If condition became true");
			return true;
		}
		else {
		
		for(int i=low;i<i+1;i++) {  // consider if i =3 
	       int min = a[low];
			int index = low;
			for(int j=i+1;j<a.length;j++) {
		  
				if(min>a[j]) {
					min = a[j];
					index = j;
					}
				
				
			}
		
		
		
		
		
		// swap the elements
			
			int temp = a[low];
			a[low]= min;
			a[index] = temp;
		
		
	
		
		
		}
	
		return sort(a,low+1,high);	
		
	
		
		}
	
	
	
		
	
	
	
	
	
	
	
	
	

}
}
