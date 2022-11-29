/*
 * if you don't want any variable to be object specific than make into static it will go into class full 
 * Memory
 * for accessing static value we can directly use class name
 */

class Emp{
	int eid;
	int salary;
	static String ceo;
	public void show() {
		System.out.println(eid + ":" + salary + ":" + ceo );
		
	}
	
	static {
		ceo="piyush";/// static block executed when we load an object
		
	}
	public Emp() {
		eid=1;
		salary =3000;
	}
}
public class StaticDemo {
	static int i =0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp navin = new Emp();
		navin.eid=i;// here we can able to access static value because it is initialized as static
		navin.salary = 10000;
	
		
		Emp radh = new Emp();
		
		radh.eid=2;
		radh.salary=1555;
		
		navin.show();
		radh.show();

	}

}
