
public class Staff {


StaffMember[] list = new StaffMember[6];

//list[0]=new Employee();
Staff() {
	
	list[0]=new Employee();
	list[1]=new Employee();
	list[2]=new Hourly();
	list[3]=new Hourly();
	list[4]=new Hourly();
	list[5]=new Volunteer();





}

}

class StaffMember{
	
}
class Volunteer extends StaffMember{
	
}
class Employee extends StaffMember{
	
}
class Executive extends Employee{
	
}
class Hourly extends Employee{
	
}
