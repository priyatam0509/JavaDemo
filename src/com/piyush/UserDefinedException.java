package com.piyush;

public class UserDefinedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kk,j;
		kk=8;
		j=2;
		try {
			if(kk/j==4)
				throw new Exception();
			System.out.println(kk/j);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Error");
		}
		

	}

}
