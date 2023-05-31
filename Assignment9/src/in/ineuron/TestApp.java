package in.ineuron;

public class TestApp {
	public static void main(String[] args) throws Exception {

		Utility util = new Utility();
		Producer producer = new Producer(util);
		Consumer consumer = new Consumer(util);

	}
}
