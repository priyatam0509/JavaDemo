package com.piyush;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int i = 9/0;
			System.out.println("result");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Error");
		}
		finally {// even you have exception or not this finally block going to be executed
			System.out.println("Hello exception hai bhaii");
		}
		

	}

}
