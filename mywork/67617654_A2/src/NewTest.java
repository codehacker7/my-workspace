import java.util.Arrays;

public class NewTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Shape[] shapes1 = new Shape[5];

shapes1[0]=new Rectangle();
shapes1[1]=new Rectangle();
shapes1[2]=new Rectangle();
shapes1[3]=new Hexagon();
shapes1[4]=new Hexagon();
		
System.out.println("Total area of all the shapes in 'shape1' is  "+(shapes1[0].getArea()+shapes1[1].getArea()+shapes1[2].getArea()+shapes1[3].getArea()+shapes1[4].getArea()+"\n"));
		
		
Shape[] shapes2 = (Shape[])shapes1.clone();		
		
System.out.println("shapes1 has been cloned to shapes2");

Arrays.sort(shapes2);
System.out.println("shape2 has been reordered! \n");


System.out.println("Areas in shape1\n");
System.out.printf("%f\n%f\n%f\n%f\n%f",shapes1[0].getArea(),shapes1[1].getArea(),shapes1[2].getArea(),shapes1[3].getArea(),shapes1[4].getArea());
System.out.println();
System.out.println("Areas in shape2\n");
System.out.printf("%f\n%f\n%f\n%f\n%f",shapes2[0].getArea(),shapes2[1].getArea(),shapes2[2].getArea(),shapes2[3].getArea(),shapes2[4].getArea());


	}

}
