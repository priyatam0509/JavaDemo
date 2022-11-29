package com.piyush;

class counter{
	int count;
	public synchronized void increment() { // it makes one thread execution at a time
		count++;
	}
}


public class synchroizedKeyword {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		counter c = new counter();
		Thread t1 = new Thread(()->{
			for(int i=1;i<=1000;i++) {
				c.increment();
			}
		});
		Thread t2 = new Thread(()->{
			for(int i=1;i<=1000;i++) {
				c.increment();
			}
		});
		t1.run();
		t2.run();
		t1.join();
		t2.join();
		System.out.println("count" + c.count);
		

	}

}
