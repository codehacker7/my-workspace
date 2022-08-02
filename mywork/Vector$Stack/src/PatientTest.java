import java.util.PriorityQueue;

public class PatientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	PriorityQueue<Patient> waitlist = new PriorityQueue<>(new Comp());
	
	waitlist.offer(new Patient(1,"p1",false));
	
	waitlist.offer(new Patient(2,"p2",false));
	
	waitlist.offer(new Patient(3,"p3",true));
	
	waitlist.offer(new Patient(4,"p4",true));
	
	waitlist.offer(new Patient(5,"p5",false));
	
	while(!waitlist.isEmpty()) {
		System.out.println(waitlist.poll());
	}
	
	
	}
	
	

}
