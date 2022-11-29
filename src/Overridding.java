// here we overrride the method of class a

class a{
	public void show() {
		System.out.println("in A");
	}
}
class b extends a{
	@Override// instead of giving logical error you will get a compile time error
	public void show() {
		super.show();// supper is a keyword that is used to acess parent class functionality and variable
		System.out.println("In B");
	}
}
public class Overridding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b b1 = new B();
		b1.show();

	}

}
