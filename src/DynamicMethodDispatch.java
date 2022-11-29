class ar{
	public void show() {
		System.out.println("In A");
	}
}
class br extends ar{
	public void show() {
		System.out.println("In B");
	}
}
class c extends ar{
	public void show() {
		System.out.println("IN C");
	}
}
public class DynamicMethodDispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ar a1 = new br();// runtime polymorphism
		a1.show();
		a1 = new c();//dynamic method dispatch
		a1.show();

	}

}
