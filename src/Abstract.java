// if we make a class abstract we can not create object of it if we want to declare abstract method we need to put abstract if not it will throw error
// if we have abstract method then class should be abstract also

//abstract class human{
//	public abstract void wash();
//	public void eat() {
//		
//	}
//	public void sleep() {
//		
//	}
//}
//
//class men extends human{
//public void eat() {
//		
//	}
//}


// we use abstract class so that we not need to call the function again again for different data types

///example

class printer{
	public void show(Number i) {// here float double int all are extended from parent class hence number support all that
		System.out.println(i);
		
	}
}
public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      human h1 = new men();
		printer h1 = new printer();
	    h1.show(5.5);
	}

}
