package kavyanshbansal;

import java.util.Scanner;

public class LO5PRACTISE {
     public static void main(String[] args) {
    	 Scanner r=new Scanner(System.in);
    	 
    	 System.out.println("Enter the tree sides of traingle");
    	 double a=r.nextDouble();
    	 double b=r.nextDouble();
    	 double c=r.nextDouble();
     
     
     double angleA = Math.acos((a*a-b*b-c*c)/(-2.0*b*c));
     double angleB = Math.acos((b*b-a*a-c*c)/(-2.0*a*c));
     double angleC = Math.acos((c*c-b*b-a*a)/(-2.0*a*b));
     
    angleA=Math.toDegrees(angleA);
    angleB=Math.toDegrees(angleB);
    angleC=Math.toDegrees(angleC);
     
     
     System.out.println(angleA);
     System.out.println(angleB);
     System.out.println(angleC);
     }
}
