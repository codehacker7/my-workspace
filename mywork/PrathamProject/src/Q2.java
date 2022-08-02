import java.util.Arrays;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {8,1,3,4,2,7};
		sort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
		
		
		
	}


public static int[] sort(int[] arr,int low,int high) {
	

int smallestelement = arr[low];
int indexsmall = low;

if(low<high) {
for(int i=low;i<arr.length;i++) {
	if(arr[i]<smallestelement) {
		smallestelement = arr[i];
		indexsmall = i;
	}
}


int temp = arr[indexsmall];
arr[indexsmall] = arr[low];
arr[low] =temp; 


sort(arr,low+1,high);

}

return arr;







}







}


