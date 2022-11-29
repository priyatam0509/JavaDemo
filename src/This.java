class calc{
	int n1;
	int n2;
	int r;
	public calc(int n1, int n2) {
		n1=this.n1;// reference to current object or instance
		n2= this.n2;
	}
	public void perform(int n1, int n2) {
		r =n1+n2;
		
	}
}
public class This {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calc p = new calc(5, 6);
        p.perform(5,6);
		System.out.println(p.r);
	}

}
