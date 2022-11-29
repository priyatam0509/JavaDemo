/*
 * here multiple method with same name but different parameter is called method overloading
 */
class casio{
	public void add(int i,int j) {
		System.out.println(i+j);
	}
	public void add(int i,int j, int k) {
		System.out.println(i+j+k);
	}
	public void add(float i,float j) {
		System.out.println(i+j);
	}
}

public class MethodOverloadingandFunctionOverlaoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		casio obj = new casio();
		obj.add(5, 6 ,7);

	}

}
