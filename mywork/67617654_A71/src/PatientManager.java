import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PatientManager  {
static int y1 =1;
	
	
PriorityQueue<Patient> waitingList=new PriorityQueue<>(new Comp()); // made a priority queue named waiting list


Scanner in = new Scanner(System.in);

public void start() {
	
	System.out.println("----------");
	System.out.println("1)New patient");
	System.out.println("2)Next Patient");
	System.out.println("3)Waiting List");
	System.out.println("4)Exit");
	System.out.println("----------");
	
	
	int y =choose();
	boolean done = false;
	
	String name= "";
	int emer=0 ;
	
while(y!=4) {
	done = false;
	if(y==1) {
		in.nextLine();
		System.out.println("Enter patients name : ");
		 name = in.nextLine();
		
		 
		System.out.println("Enter emergency [1(low) to 5(life and death)]: ");

		while(!done) {
			try {
			emer = in.nextInt();
			
		
		while(emer<1 || emer>5) {
			System.out.println("(x)  Wrong value.Try again: ");
			emer = in.nextInt();
		}
	done = true;	
	}
	catch(InputMismatchException e) {
		System.out.println("(x)Wrong choice.Try again: ");
		in.nextLine();

	
	
	}
		

	
	}
		
		waitingList.offer(new Patient(y1++,name,emer));
		
		System.out.println("Patient added to waiting list.");
	} // if y ==1 closes here
	

	
	if(y==2) {
	
		if(waitingList.size()>0) {
		System.out.println(waitingList.poll().toString()+" is treated");
		}
		
		
	
		else {
			System.out.println("No more patients");
		}
	
	
	} // y==2 closes here
	
	
	
	if(y==3) {
		PriorityQueue<Patient> waitingList2=new PriorityQueue<>(waitingList);
	if(waitingList2.size()>0) {
		System.out.println("Witing List includes: ");
		while(!waitingList2.isEmpty()) {
			System.out.println(waitingList2.poll().toString());
		}
	
	}// nested if close here
	
	else {
		System.out.println("No more patients ");
	}
	in.nextLine();
	
	} // y==3 closes here
	
	
	y = choose();

if(y==4) {
		System.out.println("Program terminated. Good bye!!");
	}

	
}// main while loop closes here
	
}
public int choose() {
	int x=0;
	boolean done = false;
	while(!done) {
	try {
		System.out.println("Choose an item from the menu");
		x = in.nextInt();
		
		while(x<1 ||x>4) {
		System.out.println("(x)Wrong choice");
		System.out.println("Choose an item from the menu");
		x = in.nextInt();
		}
	done = true;

	}catch(InputMismatchException e) {
		System.out.println("(x)Wrong choice");
		in.nextLine();
		}
}
		return x;
	}



public static void main(String[] args) {
	PatientManager q = new PatientManager();
q.start();
}


}


	
	
	
	
	
	

	
	
	
	
	









