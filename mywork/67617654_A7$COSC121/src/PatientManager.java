import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PatientManager  {
static int y =1;
	
	
PriorityQueue<Patient> waitingList=new PriorityQueue<>(new Comp()); // made a priority queue named waiting list




public  void start() {

	
	Scanner in = new Scanner(System.in);
	
	
	
	
	System.out.println("---------------");
	System.out.println("(1): New Patient.");
	System.out.println("(2): Next Patient.");
	System.out.println("(3)Waiting List.");
	System.out.println("(4)Exit.");
	System.out.println("---------------");
	
	
	int x =0;
	boolean done = false;
	
	// Here I am taking user input and checking if the input is valid and handling all the exceptions
	
	while(!done) {
	try {
	
	System.out.println("Enter an choice: ");
				
		x = in.nextInt();
		
		while(x>=5 || x<1) {
			in.nextLine();
			System.out.println("Wrong choice");
			System.out.println();
			System.out.println("Enter an choice: ");
			x = in.nextInt();
			
		
		}
		done = true;
	}
	
	catch(Exception e) {
		
		System.out.println("wrong choice: ");
		in.nextLine();
	}
	
	}
	
	
	// If user enters 4 than it is exit so running a for loop till x!=4

 while(x!=4) {
		in.nextLine();
		
		
		int emergency =0;
		String name=" ";
		
		if(x==1) {
		
		System.out.println("Enter patient's name: "); // Getting the name of the patient and handling all the exceptions
		 name =in.nextLine();
		boolean try2 = false;
		boolean try3 = false;
		
		if(!try3) {
			System.out.println("Enter emergency[1 (low) to 5(life and death)]: ");
			while(!try2) {
		
		try {
			 emergency = in.nextInt();
		 try2 = true;
		 try3 = true;
		} 
		catch(InputMismatchException e) {
			in.nextLine();
			System.out.println("Wrong value.Try again");
		}
	}
		}
		if(emergency>=1 && emergency<=5) {  // if the input is correct than add patient to the waiting list
		waitingList.offer(new Patient(y,name,emergency));
		y++;
		System.out.println("Patient added to the waiting list");
		
		}
		
		
		
		else {
			boolean done4 = false;
		while(!done4) {
			try {
				
				System.out.println("Wrong value.Try again: "); // else if the input is wrong than handle it using try catch
				emergency = in.nextInt();
			while(emergency>5 || emergency<1) {
				System.out.println("Wrong value.Try again: ");
				emergency = in.nextInt();
				in.nextLine();
			}
		
			waitingList.offer(new Patient(y,name,emergency));
			y++;
		System.out.println(" Patient added to the waiting list");
		done4 = true;
			}catch(Exception e) {
	
		
			in.nextLine();
			}
		
		}
		}
		
		}
	

		 if(x==2) { // if user enters 2 than treating patients according to their order
			if(!waitingList.isEmpty())
			System.out.println(waitingList.remove().toString()+" is treated");
			else {
				System.out.println("No more patients ");
			}
		}	
 
 

			else if(x==3) { 
				if(waitingList.isEmpty()) {
					System.out.println("No patients in the list");
				}
				else {
				
					// Here I am cloning the priority queue and remove element one by one from cloned queue to print the waiting list
					
					System.out.println("Waiting list includes: ");
					//PriorityQueue<Patient> waitingList2= (PriorityQueue<Patient>) (waitingList).clone();
			
					Iterator<Patient> c = waitingList.iterator();
					
					PriorityQueue<Patient> waitinglist2=new PriorityQueue<>(new Comp());
					
					while(c.hasNext()) {
						waitinglist2.offer(c.next());
						}
				
				
				while(!waitinglist2.isEmpty()) {
					System.out.println(waitinglist2.remove().toString());
				}
				
				}
			
			}
			
		
		 
		  done = false;
			
			while(!done) {
			try {
				System.out.println("Enter an choice: ");
						
				x = in.nextInt();
				
				while(x>=5 || x<1) {
					System.out.println("Wrong choice");
					x = in.nextInt();
				}
				done = true;
			}
			
			catch(Exception e) {
				
				System.out.println("wrong choice: ");
				in.nextLine();
			}
		 
		 
			}

 
 if(x==4) {
		
		System.out.println("Program terminated! Good bye");
 }
 
 
 }		


 }

	






public static void main(String[] args) {
	
PatientManager c = new PatientManager();


c.start();
}


}


	
	
	
	
	
	


	
	
	
	
	









