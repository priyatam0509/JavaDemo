package com.piyush;

public class ThreadPriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t3 = new Thread(()->{
			for(int i=0;i<5;i++) {
				System.out.println("Hii its our thread we should give priority of this " + Thread.currentThread().getPriority());
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		},"piyush thread");
		Thread t4 = new Thread(()->{
			for(int i=0;i<5;i++) {
				System.out.println("Hii its our thread4 we should give priority of this");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		},"Priya Thread");
		System.out.println(t3.getName());
		t3.setPriority(1);
		t4.setPriority(10);
		System.out.println(t3.getPriority());
		System.out.println(t4.getPriority());
		
		t3.start();
		t4.start();

	}

}
