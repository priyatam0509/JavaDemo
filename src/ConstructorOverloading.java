/*
 * here we are creating constructor with same number but different parameter passed it is called  constructor 
 * overloading.
 */
class casio{
	int num1,num2;
	public casio() {
		num1 =0;
		num2 =0;
	}
	public casio(int i) {
		num1 =i;
		num2 =0;
	}
	
}
public class ConstructorOverloading {
	
	public static void main(String[] args) {
		casio c = new casio();
		System.out.println(c.num1);
		
	}
	

}
