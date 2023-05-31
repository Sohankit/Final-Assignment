package in.ineuron;

public class Mythread2 implements Runnable{
	@Override
	public void run() {
	for(int i=0;i<=10;i++) {
		//for even number
		if(i%2!=0) {
			System.out.println(i);
		}
	}
	}
}
