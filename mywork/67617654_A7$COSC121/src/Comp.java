import java.util.Comparator;

public class Comp implements Comparator<Patient> {

	
	@Override
	
	
	public int compare(Patient o1, Patient o2) {
		// TODO Auto-generated method stub

		if(o1.getEmergency()>o2.getEmergency()) {
			return -1;
		}
		if(o1.getEmergency()<o2.getEmergency()) {
			return 1;
		}
		else {
			return o1.getOrder()-o2.getOrder();
		}
	}

}


