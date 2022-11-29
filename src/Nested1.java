
public class Nested1 {
	/*
1 2 3 
1 2 3 4 
1 2 3 4 5 
1 2 3 4 5 6 
	 */
	public static void main(String args[]) {
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j + " ");
				
			}
			System.out.println();
		}
		/*
		 * 
A 
A B 
A B C 

		 */
		
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)(65+j -1) + " ");
				
			}
			System.out.println();
		}
		
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				if(i==2&&i==3) {
					if(j==1&&j==4)
						System.out.print('$' + " ");
				}
				System.out.print('$' + " ");
				
			}
			System.out.println();
		}
		
	}

}
