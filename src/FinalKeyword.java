// final variable - once a variable declared final we can not change it.

//class alpha{
//	final int i=0;
//	public alpha() {
//		i=10;
//	}
//}

// final class - no child class can extends parent class if it is declared as final

//final class alpha{
//	public void show() {
//		System.out.println("In alpha");
//	}
//}
//class beta extends alpha{
//	
//}

// final method: - your method would become constant no one can over write your method
//class alpha{
//	final public void show() {
//		System.out.println("In alpha");
//	}
//}
//class beta extends alpha{
//	public void show() {
//		System.out.println("In Beta");
//	}
//	
//}
public class FinalKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		beta obj = new beta();
		obj.show();

	}

}
