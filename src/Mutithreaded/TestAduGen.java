package Mutithreaded;

public class TestAduGen extends Thread {
	public void run() {
		while (true) {
			for (int i = 0; i < 3; i++) {
				System.out.printf("第 %d次波动拳", i + 1);
				System.out.println();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("现在开始充能");
			try {
				Thread.sleep(5000);
			}catch(InterruptedException e2) {
				e2.printStackTrace();
			}
			System.out.println("充能完毕");
		}

	}
	public static void main(String[] args) {
		Thread t = new TestAduGen();
		t.start();
	}
}
