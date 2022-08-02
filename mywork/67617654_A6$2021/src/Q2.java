import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

public class Q2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

	printShuffled("/Users/kavyanshbansal/Downloads/A6/story.txt");
	
	
	
	
	
	}

	
public static void 	printShuffled(String filename) throws FileNotFoundException {
	
	
	
	File m = new File(filename);
	
	Scanner in = new Scanner(m); // Reading the file through Scanner
	
	
	
	long filelength = m.length();// Got the length of the file
	
	int numsentences = (int)filelength/50; // Got approximate number of sentences
	
	
	ArrayList<String> x = new ArrayList<>(numsentences);//declared an ArrayList with size equal to numsentences
	while(in.hasNext()) {
		in.useDelimiter("[.:!?]"); // Just Iterating over the file and used use Delimeter method to change the implementation
				String s =in.next();// of next method so that it stops when it observes a [.:!?]
		x.add(s);	// Adding the sentences to the arrayList
		
	}
	
	Collections.shuffle(x); // shuffling the ArraList using Collections interface
	
	
	for(int i=0;i<x.size();i++) {
		System.out.print(x.get(i)+".");  // printing the ArrayList with . at the end
	}
	
	in.close();
	
}
	

	
	
	
	
	
}
