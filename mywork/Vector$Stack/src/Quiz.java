import java.util.ArrayList;
import java.util.List;

public class Quiz {

	public static void main(String[] args) {
	ArrayList<Integer> x = new ArrayList<>(List.of(6, 3, 0));

	 x.remove(Integer.valueOf(6));

	 System.out.print(x);

	 x.remove(0);

	 System.out.print(x);
}
}