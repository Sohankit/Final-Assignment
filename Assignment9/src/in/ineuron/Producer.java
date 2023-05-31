package in.ineuron;

import java.util.Random;

public class Producer implements Runnable {

		private Utility utility;

		public Producer(Utility utility) {
			this.utility = utility;
			Thread thread = new Thread(this, "producer");
			thread.start();
		}

		@Override
		public void run() {

			try {
				while (utility.getQueue().size() <= utility.getQueueCapacity()) {
					int randomNumber = new Random().nextInt(10);
					System.out.println("In producer Random Number:: " +randomNumber );
					utility.set(randomNumber);
					try {
			            Thread.sleep(1000);
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			        }
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			 
		}

}
