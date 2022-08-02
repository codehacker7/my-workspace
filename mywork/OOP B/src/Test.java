
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	Farmer f = new Farmer("Mark",60.5,20,30);
	Farmer f2 = new Farmer("Jessa",50.5,10,20);
	
	//Farmer f3 = new Farmer();
	// this is an error as now you have created constructor 
	// default constructor is not present now 
	Farmer f3 = new Farmer();
	
	System.out.println(f.name);
	System.out.println(f.weight);
	System.out.println(f3.name);
	System.out.println(f3.weight);
	}

}
