package in.ineuron;

public class Account {
	public int balance=5000;
	public void deposite(int amount){
		balance+=amount;
		System.out.println(amount+" is deposited succesfully..!");
		System.out.println("balance = "+balance);
	}
	public void withdraw(int amount){
		if(amount<=balance) {
		balance-=amount;
		System.out.println(amount+" is withdraw succesfully...!");
		System.out.println("balance = "+balance);
		}
		else {
			System.out.println("Balance not available.");
		}
	}
	public void balance() {
		System.out.println("Balance amount is: "+balance);
	}
	

}
