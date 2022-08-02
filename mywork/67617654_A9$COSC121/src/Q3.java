
import java.util.ArrayList;
	public class Q3 {
			
	public static void main(String[] args) {
		System.out.printf("%5s %10s %10s %10s \n","N","Bubble","Selection","Insertion");
		for(int i=5000;i<=50000;i+=5000) {
		ArrayList<Patient> x = new ArrayList<>(i);
			for(int j=0;j<i;j++) {
					x.add(randompatient(i));
			}
			ArrayList<Patient> x1 = (ArrayList<Patient>)x.clone();
			ArrayList<Patient> x2 = (ArrayList<Patient>)x.clone();
					
			long start = System.currentTimeMillis();
			Sorter.bubbleSort(x);
			long end = System.currentTimeMillis();
			double time= (end-start)/1000.0;
			
					
					
			start = System.currentTimeMillis();
			Sorter.selectionSort(x1);
			end = System.currentTimeMillis();
			double time1=  (end-start)/1000.0;
					
					
			start = System.currentTimeMillis();
		   Sorter.insertionSort(x2);
			end = System.currentTimeMillis();
			double time2= (end-start)/1000.0;
					
					
			System.out.printf("%5d %10.3f %10.3f %10.3f \n",i,time,time1,time2);
					
				}

	}
			
public static Patient randompatient(int n) {
			int c = (int)Math.random()*2;
			return new Patient((int)(Math.random()*n),"anonmyus",(c==0)?true:false);
	}

			
	}
