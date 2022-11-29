class clac{
	int num1;
	int num2;
	int result;
	public clac(int x, int y) {
		num1=x;
		num2=y;
		
	}
	public void perform(){
		result = num1+num2;
	}
}
public class object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		clac obj = new clac(4,10);//constructor
		
		obj.perform();
		System.out.println(obj.result);
		

	}

}
