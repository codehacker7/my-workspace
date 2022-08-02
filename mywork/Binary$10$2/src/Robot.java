import java.io.Serializable;
import java.util.Arrays;

public class Robot implements Serializable{

	int x =1;
	int y =2;
	int[] nums = {1,2,3};
	transient String location = "Canada";
	
	transient Battery b = new Battery();
	
	
		public String toString() {
			
			return "Robot [x= "+x +", "+"y= "+y+"location = "+location+"nums: "+Arrays.toString(nums)+"Battery: "+b;
		}

}

class Battery{
	int charge = 100;
}
