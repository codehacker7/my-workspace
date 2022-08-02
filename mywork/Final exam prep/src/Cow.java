
public class Cow {

	private double stomach;
	private String nickname;
	private boolean isFull;
	
	Cow(int stomach,String nickname){
		setstomach(stomach);
		setnickname(nickname);
		
	}
	private void setnickname(String nickname) {
		// TODO Auto-generated method stub
			this.nickname = nickname;
	
	}
	Cow(){
		
		this(50,"Anonymous");
		
	}
	
	public void setstomach(int stomach) {
		if(stomach>=100) {
			this.stomach = stomach;
			isFull = true;
		}
		
		else if(stomach<=0) {
			this.stomach = 0;
			isFull = false;
		}
		else {
			this.stomach = stomach;
			isFull = false;
		}
		
	}
	
	public void eat(int value) {
		
			if(value>0)
			stomach+=value;
		
			if(stomach>=100) {
				stomach = 100;
			}
	
	}
	
	public void say(String gh) {
	
		System.out.println(gh+" my name is "+nickname+" and my stomach is "+stomach +" %full");
	
		
	}
	
	
	
	
}
