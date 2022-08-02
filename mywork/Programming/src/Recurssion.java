import java.util.Arrays;

public class Recurssion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//print(3);

System.out.println(countchar("kavyansh",'i',0,"kavyansh".length()-1));
	

int[] x = {1,2,3,4};

System.out.println(binarySearch(x,5,0,x.length-1));

	
	}
	
	public static void print(int n) {
		
		if(n>0) {
			System.out.println(n+" ");
				print(n-1);
				System.out.println("HI THIS IS KAVYANSH'S CLASSES");
		}
		
		
	}
	
	public static int countchar(String str,char a,int low,int high) {
		
		
	if(low<=high) {
		
		
		
		if(str.charAt(low)==a) {
			return 1+countchar(str,a,low+1,high);
		}
		else {
			return countchar(str,a,low+1,high);
		}
		
		
		
		
	}
	return 0;
		
		
		
		
		
		
	}
	
	public static void sort(int[] list,int low,int high) {
		
		if(low<high) {
		int index = low;
		int minelement =list[low];
	
			for(int j=low;j<list.length;j++) {
				if(minelement>list[j]) {
					minelement = list[j];
					index =j;
				}
			
		}
		
		
		// swap the elements 
		int temp = list[low];
		list[low]=minelement;
		list[index]=temp;
		
		
		sort(list,low+1,high);		
		
	}
	}
	
	
	
	
	
	public static int binarySearch(int[] list,int key,int low,int high) {
		
Arrays.sort(list);
		
if(low>high) {
	return -1;
}


	int middle = (low+high)/2;
		int element = list[middle];
		
		if(key==element) {
			return middle;
		}
		
		else if(key>middle) {
			
			return binarySearch(list,key,middle+1,high);
		}
		
		
		else {
			return binarySearch(list,key,low,middle-1);
		}
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	}
	
	
	
	
	
	

}
