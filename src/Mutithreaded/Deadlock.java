package Mutithreaded;

import TestInterface.Hero;

public class Deadlock {
	public static void main(String[] args) {
		final Hero ahri = new Hero("��β����");
		final Hero anni = new Hero("����");
		final Hero zed = new Hero("��");
		Thread t1 = new Thread() {
			public void run() {
				synchronized (ahri) {
					System.out.println("t1�Ѿ�ռ�а���");

					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("t1 ��ͼռ�а���");
					System.out.println("t1 �ȴ��� ��������");
					synchronized (anni) {
						System.out.println("nasty shit");
					}
				}
			}
		};
		t1.start();
		Thread t2 = new Thread() {
			public void run() {
				synchronized (anni) {
					System.out.println("t2 ��ռ�а���");
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("t2��ͼռ�н�");
					System.out.println("t2 �ȴ��� ��������");
					synchronized (zed) {
						System.out.println("nasty shit");
					}
				}
			}
		};
		t2.start();
		Thread t3 = new Thread() {
			public void run() {
				synchronized (zed) {
					System.out.println("t3 ��ռ�н�");
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("t3��ͼռ�а���");
					System.out.println("t3�ȴ���");
					synchronized (ahri) {
						System.out.println("nasty shit");
					}
				}
			}
		};
		t3.start();
	}
}
