package in.ineuron.main;
import in.ineuron.*;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Account a= new Account();
		System.out.println("Enter option");

		System.out.println("1: Check your balance...!!");
		System.out.println("2: Deposit...!!");
		System.out.println("3: Withdraw...!!");
		
		char option='\0';
		System.out.println("Enter option...");
		Scanner sc=new Scanner(System.in);
	
		
		
			option=sc.next().charAt(0);
			System.out.println("\n");
			
			switch(option) {
			case '1':System.out.print("Balance=");
					a.balance();
			break;
			
			case '2':System.out.println("Enter an amount to deposit!!");
				int amount=sc.nextInt();
				a.deposite(amount);
			break;
			
			case '3':System.out.println("Enter an amount to withdraw!!");
			int amount1=sc.nextInt();
			a.withdraw(amount1);
			break;
}
 }
}
