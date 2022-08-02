import java.util.Arrays;

public class Q1 {

public static void main(String[] args) {
	
	
	
	
	int[] arr = {1,2,3,4,5};
	
int x=	binarySearch(arr,7,0,4);
	
	System.out.println(x);
	
}

public static int binarySearch(int[] arr,int key,int low,int high) {
	Arrays.sort(arr);
	
	int indexmid = (low+high)/2;
	
	int middlelement = arr[indexmid];

	
	if(low>high) {
		return -1;
	}
	
		if(key==middlelement) {
			return indexmid;
		}
		
		
		else if(key>middlelement) {
			return binarySearch(arr,key,indexmid+1,high);
		}
		else if(key<middlelement){
			return binarySearch(arr,key,low,indexmid-1);
		}

	return 0;
	
}



}

