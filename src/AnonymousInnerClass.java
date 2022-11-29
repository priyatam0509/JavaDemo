// Annynomous class are those class whose intention is used to use only once so we donot need to extends the class  we can directly achieve it by declaring the class
// at the same place where we have declared it

class A{
	public void show() {
		System.out.println("In A Show");
	}
}
public class AnonymousInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A obj = new A()
				{
			public void show() {
				System.out.println("Hii i am annyonomus class");
			}
				};
			obj.show();
		

	}

}
