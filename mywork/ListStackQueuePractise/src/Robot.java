
public class Robot implements Comparable<Robot> {

	public int weight;

	
	public Robot(int weight) {
		setWeight(weight);
	}
	
	
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public int compareTo(Robot o) {
		// TODO Auto-generated method stub
		return this.weight-o.weight;
	}
	
	
	
	
	
	
	
	
	
}