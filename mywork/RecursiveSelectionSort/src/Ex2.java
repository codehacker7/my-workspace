import java.util.Arrays;

public class Ex2 {
public static void main(String[] args) {
	
	int[] list = {3,4,7,2,9,1};
	sort(list);
	System.out.println(Arrays.toString(list));
	
	
}

private static void sort(int[] list) {
	// TODO Auto-generated method stub
	sort(list,0,list.length-1);
}

private static void sort(int[] list, int low, int high) {
	// TODO Auto-generated method stub
	// find min element between low and high
	int idxMin = low;
	int min = list[low];
	for(int i=low;i<=high;i++) {
		if(list[i]<min) {
			min = list[i];
			idxMin = i;
		}
	}
	// swap min with element @low
	list[idxMin]=list[low];
	list[low]=min;
	// recresuviely sort remaining list
	sort(list,low+1,high);
	
}
}
