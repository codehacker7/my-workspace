import java.util.Comparator;

public class Comp implements Comparator<Patient> {

	@Override
	public int compare(Patient p1, Patient p2) {
		// TODO Auto-generated method stub
	if(p1.isEmergencyCase() && !p2.isEmergencyCase()) {
		return -1;
	}
	
	
	else if(!p1.isEmergencyCase() && p2.isEmergencyCase()) {
		return 1;
	}
	
	else
return 		p1.getOrder()-p2.getOrder();
	
	
	}

}
