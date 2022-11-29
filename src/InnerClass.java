class outer{
	int a;
	public void show() {
		a=5;
		System.out.println(a);
		
	}
	class inner{                ///outer&inner.claass this class is called member class
		public void display() {
			System.out.println("in display");
		}
	}
	static class iner{                ///outer&inner.claass this class is called static class
		public void display() {
			System.out.println("static in display");
		}
	}
}
public class InnerClass {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer ob = new outer();
		ob.show();
		outer.inner ob1 = ob.new inner();
		ob1.display();
		
		// here in static calss we do not need to call the object of outer class
		outer.iner ob2 =new outer.iner();
		ob2.display();

	}

}
