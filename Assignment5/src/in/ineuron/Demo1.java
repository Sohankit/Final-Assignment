package in.ineuron;
//Abstract/ Adaptor class is a simple java class. 
//Using Abstract keyword we make class as abstract class.
//Abstract class/ adaptor class is class which give dummy implemention for all abstract methods.
//If we extends abstract class we can only give body to those method which we are intrested in.
//Abstract class is not a100% interface.


//Abstract class
public abstract class Demo1 implements Inteface1 {
		public void m1() {};
		public void m2() {};
		public void m3() {};
}

class Demo2 extends Demo1{
	public void m1() {
		System.out.println("Hello..!");
	}
}
