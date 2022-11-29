/*
 * 1. normal - having more than one methods
 * 2. single abstract method - having single method only - functional interfaces - lambda exprssion
 * 3. marker interfaces - having no method
 */

interface Abc
{
	void show();
	
}
public class FunctionalInterfacesLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Abc c =()->System.out.println("Hii its lambda implementation");
       c.show();
	}

}
