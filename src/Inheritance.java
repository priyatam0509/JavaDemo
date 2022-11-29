// is-A - when we inherited the child class from parent class  and has a - dog has a small home  when we talk about function

class calcty{
	public int add(int i, int j) {//super parent
		return i+j;
		
	}
}
class calcAdvanced extends calcty{//sub child

	public int sub(int i,int j) {
		return i-j;
		
	}
}
class calcLora extends calcAdvanced{
	public int mul(int i,int j) {
		return i*j;
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calcty c = new calcty();
		int res = c.add(5, 6);
		System.out.println(res);
		calcAdvanced c1 = new calcAdvanced();
		int res1 = c1.add(6,5);
		int res2 = c1.sub(10, 5);
		System.out.println(res1 + " "+ res2);
		calcLora c2 = new calcLora();
		int res3 = c2.add(4,5);
		int res4 = c2.sub(6, 6);
		int res5 = c2.mul(10, 5);
		System.out.println(res3+" "+ res4+" "+res5);

	}

}
