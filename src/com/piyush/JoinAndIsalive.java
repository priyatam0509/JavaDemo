package com.piyush;

public class JoinAndIsalive  {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Thread t1 = new Thread(()->
		{
			for(int i=0;i<5;i++) {
				System.out.println("Hi lund");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		});
		Thread t2 = new Thread(()->
		{
			for(int i=0;i<6;i++) {
				System.out.println("Hello babau");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
		);
		
		t1.start();
		try {
			Thread.sleep(10);
		} catch (Exception e) {
			// TODO: handle exception
		}
		t2.start();
//		System.out.println(t1.isAlive());// it is method to check that your thread is alive or not
		t1.join();// it is method to join your thread with main method thread so after its completeion only the next line of code can execute
		t2.join();
		System.out.println(t1.isAlive());
		System.out.println("Bye baba");
	}

}
