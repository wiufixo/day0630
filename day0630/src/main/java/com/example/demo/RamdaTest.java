package com.example.demo;

class MyThread1 extends Thread{
	
	@Override
	public void run() {
		for(int i = 0; i<=10; i++) {
			System.out.println("thread 동작!");
			try {
				Thread.sleep(100);
			}catch (Exception e) {
			}
		}
	}
}

class MyThread2 implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i<=10; i++) {
			System.out.println("작업 동작!");
			try {
				Thread.sleep(100);
			}catch (Exception e) {
			}
		}
	}
}

public class RamdaTest {

	public static void main(String[] args) {
		
//		MyThread1 t1 = new MyThread1();
//		t1.start();
//		
//		MyThread2 t2 = new MyThread2();
//		new Thread(t2).start();
		
//		new Thread(new Runnable() {
//			@Override
//			public void run() {
//				System.out.println("쓰레드 동작!");
//				try {
//					Thread.sleep(100);
//				}catch (Exception e) {
//				}
//			}
//		}).start();
		
		new Thread(()->{
			System.out.println("쓰레드 동작!");
			try {
				Thread.sleep(100);
			}catch (Exception e) {
			}
		}).start();
		
	}
}


