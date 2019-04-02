package Mutithreaded;

import java.util.LinkedList;

public class ThreadPool {
	LinkedList<Runnable> tasks = new LinkedList<Runnable>();
	int poolSize;

	public ThreadPool() {
		poolSize = 10;
		synchronized (tasks) {
			for (int i = 0; i < poolSize; i++) {
				new ConsumerThread("task consumer" + i).start();
			}
		}
	}

	public void add(Runnable r) {
		synchronized (tasks) {
			tasks.add(r);
			try {
				tasks.notifyAll();
			} catch (Exception e) {
				e.printStackTrace();

			}
		}
	}

	class ConsumerThread extends Thread {
		Runnable runnable;

		public void run() {
			System.out.println("ready" + this.getName());
			while (true) {
				synchronized (tasks) {
					while (tasks.isEmpty()) {
						try {
							tasks.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					runnable = tasks.removeLast();
					tasks.notifyAll();
				}
				System.out.println(this.getName() + "catching a task");
				runnable.run();
			}
		}

		public ConsumerThread(String name) {
			super(name);
		}
	}
}
