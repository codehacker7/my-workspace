
public class CowTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cow c1 = new Cow() ;
		
		Cow c2 = new Cow();
		
		Cow[] c = new Cow[7];
		for(int i=0;i<8;i++) {
			c[i]=new Cow();
		}
	
	
		/*c1.nickname = "Bob";
		c1.stomach = 90;
		c1.isFull = false;
		
		
		c1.eat(20);
		c1.say("Yummmy");
		
	
	System.out.println(c1.nickname+"is"+c1.stomach+"%full");
	System.out.println("Stomach is "+(c1.isFull?"Full":"Not Full"));
	System.out.println(c1.nickname);*/
		
		
		c1.count = 4;
		c2.count = 6;
		
		
		System.out.println(5);
	
	
		
		int[][] x   = {
				{1,2,3},
				
				{4,5,6}
		};
		
		int sum =0;
		
		for(int r=0;r<x.length;r++) {
			for(int c=0;c<x[r].length;c++) {
				sum+=x[r][c];
			}
		
		System.out.println(sum);
		
		
		}
		
		
		
		
	}
	
	
	public static int sum(int[] x) {
		
	int[] sums = new int[x.length];
	
int sum =0;
	
	for(int r=0;r<x.length;r++) {
		sums[r]=0;
		for(int c=0;c<x[r].length;c++) {
			
			sums[r] = sums[r]+ x[r][c] ;
			
		}
	
	
	}
	
	
	}

}
