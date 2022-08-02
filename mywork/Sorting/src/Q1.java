import java.util.Arrays;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int[] a  = {2,1,4,3,5};		
		
selectionsort(a);




}

public static void random(int[] a) {
		
		for(int i=0;i<a.length;i++) {
	a[i] = 25+ (int)Math.random()*100;
	}
		}

public static void selectionsort(int[] a) {
	
	
	
	int index =0;
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			int min = a[i];
			if(min>a[j]) {
				int temp = a[j];
				index = j;
				min = a[j];
				a[index]=a[i];
				a[i] = temp;
			}
		}
	}
	System.out.println(Arrays.toString(a));
	
	
}

public static void bubblesort(int[] a) {
	
	boolean sorted = false;
	for(int i=0;i<a.length &&!sorted ;i++) {
		sorted = true;
		for(int j=0;j<a.length-1-i;j++) {
			if(a[j]>a[j+1]) {
			int temp = a[j];
				a[j]=a [j+1];
				a[j+1]= temp;
				sorted = false;
			}
			
		}
	}





}

public static void inserationsort(int[] list) {
	
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










}
