import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class RobotTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

	
	ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("c:/1/robot.dat"));
	
	
	Robot r = new Robot();
	out.writeObject(r);
	out.close();
	

	
	ObjectInputStream in = new ObjectInputStream(new FileInputStream("c:/1/robot.dat"));
	Robot r2 = (Robot)in.readObject();
	System.out.println(r2.toString());
	in.close();
System.out.println("succes");
	
	
	}

}
