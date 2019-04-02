package Mutithreaded;

public class TestThreadPool {
	public static void main(String[] args) {
		ThreadPool test = new ThreadPool();
		for(int i=0;i<5;i++) {
			Runnable runnable =new Runnable() {
				public void run() {
				System.out.println("running");
				}
			};
			test.add(runnable);
			try {
				Thread.sleep(1000);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
