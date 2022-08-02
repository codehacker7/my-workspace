
public class BankAccount {


private int id;
private double balance;
private double annualIntrestRate;
static int count=0;

BankAccount(double annualIntrestRate,double balance){
	setannualIntrestRate(annualIntrestRate);
		setBalance(balance);
		count++;
		id = count;
}




	BankAccount(){
		this(0,0);
	}

	
	public void setannualIntrestRate(double annualIntrestRate) {
		this.annualIntrestRate = annualIntrestRate;
	
			}
public void setBalance(double balance) {
	if(balance>0)
	this.balance = balance;
		
	}
	
	public double getBalance() {
		return this.balance;
		
	}
	
	public double getannualIntrestRate() {
		
		return this.annualIntrestRate;
		
	}
	
	public int getid() {
		return this.id;
	}
	
	public double getMonthlyIntrest() {
		
	double monthlyintrest = (this.balance*this.annualIntrestRate)/12;
	
	monthlyintrest = monthlyintrest/100;
	
	
		return monthlyintrest;
	
	}
	
	public double getMonthlyIntrestRate() {
		
		double monthlyintrestrate = this.annualIntrestRate/12;
		
		return monthlyintrestrate;
	
	
	
	}
	
	public void withdraw(double amount) {
		
		if(this.balance>=amount)
		this.balance = this.balance - amount;
	
	}
	
	public void deposit(int amount) {
		
		if(amount>0) {
			this.balance = this.balance +amount;
		}
	
		
	}
	
	public void displayInfo() {
		
		System.out.println("Account id: "+getid());
		System.out.println("Current balance: "+"$"+getBalance());
		System.out.println("Annual intrest rate: "+getannualIntrestRate()+" %");
		System.out.println("Monthly intrest rate: "+getMonthlyIntrestRate()+" %");
		System.out.println("Monthly intrest: "+"$"+ getMonthlyIntrest());
	
	
	}
	
	


}
