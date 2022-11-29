 class chu{
	public int add(int ... i) {// variable length argument
		int sum =0;
		for(int n:i) {
			sum+=n;
			
		}
		return sum;
	}
}
public class Varargs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  chu c = new chu();
	  System.out.println(c.add(9,8,7,6,5));

	}

}
