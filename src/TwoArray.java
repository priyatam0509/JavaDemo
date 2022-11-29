
public class TwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int d[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(d[i][j] + " ");
			}
			System.out.println();
		}
		
		// here we cr
		
		for(int b[]:d) {
			for(int l:b) {
				System.out.print(l + " ");
			}
			System.out.println();
		}

	}

}
