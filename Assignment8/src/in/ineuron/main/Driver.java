package in.ineuron.main;
import in.ineuron.*;
public class Driver {
	public static void main(String[] args) {
		Mythread1 mt1= new Mythread1();
		Mythread2 mt2=new Mythread2();
		
		Thread t1= new Thread(mt1);
		t1.start();
		
		Thread t2= new Thread(mt2);
		t2.start();
	}
}
