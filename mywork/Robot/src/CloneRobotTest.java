
public class CloneRobotTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

	
	Robot robot1 = new Robot(1,1,new Battery(50));
	Robot robot2 = (Robot)robot1.clone();
	
	robot1.x =5;
	robot1.charge();
	
	
	
	System.out.println(robot1);
	
	System.out.println(robot2);
	
	
	
	
	}

}
