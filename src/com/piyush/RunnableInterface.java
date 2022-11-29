package com.piyush;





class thello implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Hii lund");
			try {
				Thread.sleep(1200);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
}

public class RunnableInterface {
	public static void main(String[] args) {
		
		Runnable obj2 = ()->{
			     for(int i=0;i<5;i++) {
			    	 System.out.println("Hello lora");
			    	 try {
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
			     }
				}
			
		};
		
	
	
		
		Thread t1 = new Thread(obj2);
		
		t1.start();
		
		
	}

}
