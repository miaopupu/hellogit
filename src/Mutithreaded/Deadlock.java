package Mutithreaded;

import TestInterface.Hero;

public class Deadlock {
	public static void main(String[] args) {
		final Hero ahri = new Hero("九尾妖狐");
		final Hero anni = new Hero("安妮");
		final Hero zed = new Hero("劫");
		Thread t1 = new Thread() {
			public void run() {
				synchronized (ahri) {
					System.out.println("t1已经占有阿狸");

					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("t1 试图占有安妮");
					System.out.println("t1 等待中 。。。。");
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
					System.out.println("t2 已占有安妮");
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("t2试图占有劫");
					System.out.println("t2 等待中 。。。。");
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
					System.out.println("t3 已占有劫");
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("t3试图占有阿狸");
					System.out.println("t3等待中");
					synchronized (ahri) {
						System.out.println("nasty shit");
					}
				}
			}
		};
		t3.start();
	}
}
