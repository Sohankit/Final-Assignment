package in.ineuron;
import java.util.Scanner;
//Exception handling is one of the mechanism which handles runtime errors and prevent  program from abrupt stop.  
//Here we taken integer as an input from the user and checking whether the number is negative or positive
//if the number is negative then using throw keyword we throws exception and because of catch block we can handle this exception and show massage.


public class Demo {
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			int num1=sc.nextInt();
			
			try {
				if(num1<0)
					throw new Exception("Number can't be negative");
			}catch (Exception e) {
				e.printStackTrace();
				System.out.println("Enter valid number.");
			}
			
		}
}
