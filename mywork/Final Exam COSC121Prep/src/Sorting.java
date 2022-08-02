import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr = {2,4,3,1,5,8,7,9};
		

		inserationSort(arr);
		System.out.println(Arrays.toString(arr));
		
	}

	public static void bubblesort(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
				int temp =arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				
				}
	}
}
		}
	
	
	public static void selectionnsort(int[] arr) {
		
	   for(int i=0;i<arr.length;i++) {
		int index =i;
		int element = arr[i];
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				index =j;
				element = arr[j];
			}
		}
		
		int temp = arr[i];
		arr[index]= arr[i];
		arr[i]= element;
		
	}
}
	
public static void inserationSort(int[] list) {
		
	for(int i=1;i<list.length;i++) {
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










}