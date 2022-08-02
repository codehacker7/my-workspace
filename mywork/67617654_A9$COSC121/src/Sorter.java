import java.util.*;
public class Sorter  {

	
	public static void bubbleSort(ArrayList<Patient> list) {
		
		
		for(int i=0;i<list.size();i++) {
			for(int j=0;j<list.size()-1;j++) {
				if(list.get(j).compareTo(list.get(j+1))>0){ 
					Collections.swap(list, j+1, j);
	
				}
			}
		}
		
	}

public static void bubbleSort(ArrayList<Patient> list,Comparator<Patient> comparator) {
	
	
	for(int i=0;i<list.size();i++) {
		for(int j=0;j<list.size()-1;j++) {
			if(comparator.compare(list.get(j), list.get(j+1))>0) { 

				Collections.swap(list, j+1, j);
				
			}
}
	
}
	
	
}

//public static void selectionSort(ArrayList<Patient> list) {
//	
//for(int i=0;i<list.size();i++) {
//	Patient temp = list.get(i);
//	int index =i;
//	for(int j=i+1;j<list.size();j++) {
//		if(temp.compareTo(list.get(j))>0) { 
//		temp = list.get(j);
//		index = j;
//	}
//			
//	}
//	Collections.swap(list, i, index);
//	}
//	
//	
//	
//}





public static void insertionSort(ArrayList<Patient> list) {
	
	for(int i=1;i<list.size();i++) {
		int pos;
		Patient copy = list.get(i);
		for(pos =i;pos>0;pos--) {
	if(list.get(pos-1).compareTo(copy)>0) { 
		list.set(pos, list.get(pos-1));
		}else
			break;
			}
		list.set(pos, copy);
		}
	}





public static void selectionSort(ArrayList<Patient> list) {
	

	
	for(int i=0;i<list.size();i++) {
		Patient min = list.get(i);
		int index = i;
		for(int j=i+1;j<list.size();j++){
			if(min.compareTo(list.get(j))>0) {
				min = list.get(j);			
					index = j;
			}
			
		}
		Patient temp = list.get(i);
		list.set(i,min);
		list.set(index,temp);

		
		
	}
	









}

}



































































	

	
	
	
	
	






























	

	
	
	






















