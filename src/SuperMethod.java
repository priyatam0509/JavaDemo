// Note : - if we have two constructor in parent class the default constructor is called because child does not call the parameterized constructor
// for solving this issue the super keyword comes into pace every child class has predefind super() when we want to initialized particular parameterized class then we just put that in argument of super i.e super(i)
class A{
	public A() {
		System.out.println("in a");
		
	}
	public A(int i) {
		System.out.println("in A in i");
	}
	
}
class B extends A{
  public B(){
	  super(4);
	  System.out.println("in b");
  }
  public B(int i) {
	  super(i);
	  System.out.println("in b in i");
  }
	
}
public class SuperMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          B b1 = new B();
          
	}

}
