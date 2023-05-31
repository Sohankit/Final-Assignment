package in.ineuron;
import java.util.*;
public class Utility {

	private Queue<Integer> queue = new LinkedList<Integer>();
	private final int queueCapacity = 5;
	private boolean cond = false;

	public synchronized void set(int i) throws Exception {

		while (cond) {
			wait();
		}
		queue.add(i);
		cond = true;
		notify();
	}

	public synchronized Integer get() throws Exception {

		while (!cond) {
			wait();
		}
		cond = false;
		notify();
		return queue.poll();
	}

	public Queue<Integer> getQueue() {
		return queue;
	}

	public void setQueue(Queue<Integer> queue) {
		this.queue = queue;
	}

	public int getQueueCapacity() {
		return queueCapacity;
	}
}
