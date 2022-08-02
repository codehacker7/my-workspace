import java.util.Arrays;

public class Printrecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printRecord("ADAM",19,1,2,3,4,5,6,7);
		
		}



public static void printRecord(String name,int age,int... grades) {
	
		System.out.println("Name is "+name);
		System.out.println("Age: "+age);
		System.out.println("Grades: "+Arrays.toString(grades));
}



}
