
interface demo{
	void abc();
	 int d =7;
	static void show() {
		System.out.println("hii");
	}
}

class demofinal implements demo{
	public void abc() {
		d=9;// it is showing error because by default in interface the variable is decleared final
	}
}
public class Staticmethod {
	public static void main(String[] args) {
		demo.show();
		
		
	}

}
