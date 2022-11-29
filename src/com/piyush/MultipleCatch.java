package com.piyush;

public class MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[] = new int[6];
			a[6]=8;
			
			int i =7;
			int j =2;
			j=0;
			int k = i/j;
			System.out.println(k);
			
		}
		/*
		 * catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Error ");
		}
		 */
		catch (ArithmeticException  e) {
			System.out.println("Error ");
		}
		 catch ( ArrayIndexOutOfBoundsException e) {
				System.out.println("lora ka Error ");
			}
		catch (Exception e) {
			System.out.println("Sabka error handle karega tera ladka");
		}
		finally {
			System.out.println("Bye");
		}
		

	}

}
