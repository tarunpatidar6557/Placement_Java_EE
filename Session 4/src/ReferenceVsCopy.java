
public class ReferenceVsCopy {

	public static void main(String[] args) {
		int a = 10;
		int b=a; //value copy operation
		
		int[]a1 = {1,2,3,4,5};
		int a2[] = a1; //reference copy operation
		
		System.out.println(a+" "+b+" "+a1+" "+a2);
		
		//update operation
		b=20;
		a2[2] = 71;
		System.out.println(a+" "+b+" "+a1[2]+" "+a2[2]);
		
	}

}
