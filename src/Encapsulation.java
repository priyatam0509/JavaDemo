// Encapsulation ->> binding data with method 

class studentr{
	private int roll;
	private String name;
	public void setRoll(int r) {
		roll = r;
	}
	public  int getRoll() {
		return roll;
	}
	public void setName(String n) {
		name = n;
	}
	public String getname() {
		return name;
	}
}


public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		studentr s1 = new studentr();
		s1.setRoll(10);
		System.out.println(s1.getRoll());
		//name ="piyush";// we can not acess the name because it is made priivate to acess it we haev to acess through its method 
		s1.setName("piyush");
		System.out.println(s1.getname());

	}

}
