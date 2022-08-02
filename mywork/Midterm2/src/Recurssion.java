import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Recurssion {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
//		long x = System.currentTimeMillis();
//print(2);
//System.out.println(factorial(5));factorial(5);
//	
//	System.out.println(printseries(2));
//	int x = count("kavyansh",'m',0,"kavyansh".length()-1);
//	System.out.println(x);
//	
	
	int[] x = {1,2,3,4,5};
	//System.out.println(Arrays.toString(x));
	
	Arrays.sort(x);
	System.out.println(binarySearch(x,4,0,2));
	
//	long y = System.currentTimeMillis();
//	
//	System.out.println("The time taken by the program is "+(y-x));
//	
	}
public static void print(int n) {
	
	if(n<=5) {
		System.out.println(n);
		print(n+1);
	}
	
	
	
	
}



public static int factorial(int n) {
	
	
	if(n==1) {
		return 1;
	}
	else {
		return n*factorial(n-1);
	}
}

public static int fibonacci(int i) {
	if(i==0) {
		return 0;
		
	}
	if(i==1) {
		return 1;
					
	}
	else {
		return fibonacci(i-1)+fibonacci(i-2);
	}
	
	
}


public static void printmessage(String msg,int n) {
	if(n>=1) {
		System.out.println(msg);
		printmessage(msg,n-1);
	}
}



public static boolean palindrome(String s) {
	
	if(s.length()<=1) {
		return true;
	}
	
	else if(s.charAt(0)!=s.charAt(s.length()-1)) {
		return false;
	}
	else
	return	palindrome(s.substring(1, s.length()-1));
	
	
}

public static double printseries(int i) {

if(i==1) {
	return 1.0/2;
}
	
else {
	return (double)i/(i+1) + printseries(i-1);
}


}


public static int count(String str,char a,int low,int high) {
	
	if(low<high) {
		
		if(str.charAt(low)==a) {
			return 1+count(str,a,low+1,high);
		}
		else {
			return count(str,a,low+1,high);
		}
	}
	
	

	return 0;
	
}

public static void sort(int [] arr,int low,int high) {
	
	
	if(low<high) {
	int minelement = arr[low];
	int index = low;
	
	
	for(int i=low;i<arr.length;i++) {
		if(arr[i]<minelement) {
			minelement = arr[i];
			index = i;
		}

	
	}
	
	
	int temp = arr[low];
	arr[low]= arr[index];
	arr[index]= temp;
	
	
	
	 sort(arr,low+1,high);
	}




}




public static int binarySearch(int[] arr,int key,int low,int high) {
	
	
	
	int mid = (low+high)/2;
	
if(key==arr[mid]) {
	return mid;
}
	
else if(key>arr[mid]) {
		return binarySearch(arr,key,low+1,high);
	}
	
else if(key<arr[mid]) {
	return binarySearch(arr,key,low,high-1);
}
else {
	return -1;
}
	
}


public static long countInFolder(File f,String word) throws FileNotFoundException {
	
	long count =0;
	Scanner in = new Scanner(f);	

while(in.hasNext()) {
	
	
	if(in.next().equals(word)) {
		count++;
	}
}


return count;


}








}
