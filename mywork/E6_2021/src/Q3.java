import java.io.File;
import java.util.Arrays;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] list = {2,4,5};

		sort(list,0,list.length-1);
		System.out.println(Arrays.toString(list));
}

public static void sort(int[] list,int low,int high){
	

	
	if(low<high) {
		int idxmin =low;	
		int min = list[low];

		for(int i=low;i<=high;i++) {
			if(list[i]<min) {
				min = list[i];
				idxmin = i;
			}	
	}
	
// swap min with elem@low

		
	list[idxmin] =  list[low] ;
	list[low]=min;

// recursively sort the remaining list
	sort(list,low+1,high);
	}







}
	









}
	
	
	
	
