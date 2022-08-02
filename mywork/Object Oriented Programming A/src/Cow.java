
public class Cow {// attributes
	private String nickname;
	private int stomach;
	private boolean isFull;
	static int count;
	
	

	// constructors
	
	public	Cow(){
			stomach = 50;
			nickname = "Anonymous";
				isFull = false;
		}
	
	public Cow(String nickname, int stomach){
			
	setnickname(nickname);
	setstomach(stomach);
		
		
		}
	

		public void setnickname(String nickname) {
			
			int x = nickname.length();
			char ch = nickname.charAt(0);
			
			if(x>=4 && Character.isLetter(ch)) {
				this.nickname = nickname;
			}
		
		}
	
	
	public void setstomach(int stomach) {
		
		if(stomach>=0 && stomach<=100) {
			this.stomach = stomach;
			}
	
		else if(stomach>100) {
			this.stomach =100;
		//	this.isFull = true;
		}
	
	}
	
	public String getnickname() {
		
		//	System.out.println(nickname);
	
		return nickname;
	}
	
	public int getstomach() {
		//System.out.println(stomach);

		return stomach;
	}
	
	
	public boolean getFull() {
		
		if(this.stomach==100) {
			isFull = true;
			return true;
		}
	
		else {
		
			isFull = false;
			return false;
		
		}
	
	}
	
	
	
	
	
	
	
	
	
	void eat(int amount) {
			
			if(amount>0) {
			stomach+=amount;
			if(stomach>=100) {
				stomach =100;
				isFull =true;
			}
			else {
				isFull = false;
			}
			
			}else {
				System.out.println("Invalid food amount");
			}
		}
	
		void say(String msg) {
			System.out.println(nickname+" "+"says"+":"+msg);
		}


			void display() {
			System.out.println("Nickname: "+nickname);	
			System.out.println("Stomach: "+stomach);
			System.out.println("isFull?" +isFull);
			
			}





}
