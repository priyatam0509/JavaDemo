class stude{
	int roll;
	String name;
    public stude(int x, String sname) {
    	roll =x;
    	name = sname;
    }
	
}
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int nums[] = new int[5];
//	
//		nums[2] =4;
//		System.out.println(nums[2]);
		stude s1 = new stude(1,"aaya");
		stude s2 = new stude(2,"gaya");
		stude s3 = new stude(3,"raja");
		stude s4 = new stude(4,"rani");
		
		stude s[] = {s1,s2,s3,s4};
		
		System.out.println(s[0].name);
		
		
		

	}

}
