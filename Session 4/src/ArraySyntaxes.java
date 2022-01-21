
public class ArraySyntaxes {

	public static void main(String[] args) {
		//Implicit Syntaxes
		//Syntax1
		int array1[] = {1,2,3,4,5};
		//Syntax2
		int[]array2 = {1,2,3,4,5};
		System.out.println("array1 "+array1+"array2 "+array2); //both have different hashcodes even the data is same
		
		//Explicit syntaxes
		//Syntax 3
		int array3[] = new int[]{1,2,3,5}; //int[] means array of integers
		
		//Syntax4
		int[] array4 = new int[]{1,2,3,4,5};
		
		//Syntax 5
		int array5[] = new int[5];
		//Syntax 6
		int[] array6 = new int[5];
		
		System.out.println("array1 "+array1+"array2 "+array2+"array3 "+array3+"array4 "+array4+"array5 "+array5+"array6 "+array6);
		
		int a1[], a2; //a1 is array and a2 is primitive integer
		int[] a3, a4; //a3 and a4 both are arrays:)
	}

}
