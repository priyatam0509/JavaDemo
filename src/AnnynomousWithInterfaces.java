// advantage it does not waste a lot of memory
interface abc{
	void show();
}
public class AnnynomousWithInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       abc a = new abc() {
		
	
		public void show() {
		
			System.out.println("Hii it is annyomous method with interfaces");
		}
		
		
	};
	a.show();
	}

}
