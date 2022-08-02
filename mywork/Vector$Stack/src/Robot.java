
public class Robot implements Comparable<Robot> {

private int weight,year;

public Robot(int weight,int year) {
	setWeight(weight);
	setYear(year);
}
	
	


	public int getWeight() {
	return weight;
}




public void setWeight(int weight) {
	this.weight = weight;
}




public int getYear() {
	return year;
}



public void setYear(int year) {
	this.year = year;
}

public int compareTo(Robot o) {
		// TODO Auto-generated method stub
	return this.weight-o.weight;
	}

public String toString() {
	return "Robot [weight: "+weight+ " ,Year: "+year+"]";
}

	
	
	
	
}
