// interface have all the method but default abstract where as in abstract class the method might be the abstract method or normal methods

interface writer {
	void write();
}
class pen implements writer{
	public void write() {
		System.out.println("I am pen");
	}
}

class pencil implements writer{
	public void write() {
		System.out.println("I am Pencil");
	}
}

class kit{
	public void dosi(writer p) {
		p.write();
	}
}


public class interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		writer w = new pencil();// we can not create object of interfence but we can create reference of it
       kit k = new kit();
       k.dosi(w);
	}

}
