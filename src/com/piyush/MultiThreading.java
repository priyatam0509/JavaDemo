package com.piyush;
class hatered extends Thread{
	public void show() {
		for(int i=0;i<5;i++) {
			System.out.println("hii");
			try {
				Thread.sleep(600);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}

class hello extends Thread{
	public void show() {
		for(int i=0;i<5;i++) {
			System.out.println("hello");
		}
	}
}


public class MultiThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hatered h1 = new hatered();
		hello h2 = new hello();
		h1.show();
		h2.show();

	}

}
