import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

	String[][] provinces = {
			
			{"alberta","edmonton"},
			{"britishcolumbia","victoria"},
			{"manitoba","winnipeg"},
			{"new brunswick","fredericton"},
			{"newfoundland and labrador","st.john's"},
			{"nova scotia","halifax"},
			{"ontario","toronto"},
			{"prince edward island","charlottetown"},
			{"quebec","quebec city"},
			{"saskatchewan","regina"}
	};
	int count=0;
			for(int c=0;c<1;c++) {
				for(int r=0;r<provinces.length;r++) {
				
				System.out.println("Whatis the capital of "+provinces[r][c]+"?");
					String s=in.nextLine();
					s=s.toLowerCase();
					
					int v3=0;
					
					for(int c1=1;c1<2;c1++) {
						for(int r1=v3;r1<v3+1;r1++) {
						if(s.equals(provinces[r1][c1])) {    						// provinces[0][1]
								count++;
									}	
					
						}
	}					
					v3 = v3+1;
				
				
				}
		}
			System.out.println("You got "+count+" question(s) right");
	}

}
