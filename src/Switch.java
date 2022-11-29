
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =3;
		switch (n) {
		case 1: {
			
			System.out.println(n);
			break;
		}
		case 2:{
			System.out.println(n);
			break;
			
		}
		case 3:{
			System.out.println(n);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + n);
		}

	}

}
