import java.util.ArrayList;
import java.util.Comparator;

public class Sorter {
	public static void bubbleSort(ArrayList<Patient> list) {
		//boolean sorted = false;
		for(int phase =0;phase < list.size();phase++) {
			//sorted=true;
			for(int i=0;i<list.size()-1-phase ;i++) {
				if(list.get(i).compareTo(list.get(i+1))>0) {
					Patient temp = list.get(i+1);
					list.set(i+1, list.get(i));
					list.set(i, temp);
					//sorted=false;
				}
//				if(sorted) {
//					break;
//				}
			}
		}
	}
	public static void bubbleSort(ArrayList<Patient> list, Comparator<Patient> comparator) {
		//boolean sorted = false;
		for(int phase =0;phase < list.size();phase++) {
			//sorted=true;
			for(int i=0;i<list.size()-1-phase ;i++) {
				if(comparator.compare(list.get(i), list.get(i+1))>0) {
					Patient temp = list.get(i+1);
					list.set(i+1, list.get(i));
					list.set(i, temp);
					//sorted=false;
				}
//				if(sorted) {
//					break;
//				}
			}
		}
	}
	public static void selectionSort(ArrayList<Patient> list) {
		for(int i=0;i<list.size();i++) {
			Patient min = list.get(i);
			int minIdx = i;
			for(int j=i+1;j<list.size();j++) {
				if(list.get(j).compareTo(min)<0 ) {
					min=list.get(j);
					minIdx=j;
				}
				
			}
			list.set(minIdx, list.get(i));
			list.set(i,min);
		}
	}
	public static void insertionSort(ArrayList<Patient> list) {
		for(int i=1;i<list.size();i++) {
			Patient e = list.get(i);
			int pos ;
			for(pos=i;pos>0;pos--) {
				if(list.get(pos-1).compareTo(e)>0) {
					list.set(pos, list.get(pos-1));
				}else {
					break;
				}
			}
			list.set(pos, e);
		}
	}
	
	
