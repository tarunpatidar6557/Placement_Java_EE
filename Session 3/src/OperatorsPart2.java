
//1. Operators + conditionals + 

public class OperatorsPart2 {

	public static void main(String[] args) {
		//5 Bitwise Operators
		//&, |, ^
		int num1 = 8; //1000
		int num2 = 10; //1010
		
		int result1 = num1&num2;  //1000 -> 8
		int result2 = num1|num2;  //1010 -> 10
		int result3 = num1^num2;  //0010 -> 2
		System.out.println(result1+" "+result2+" "+result3 );
		
		//6 Shift Operators
		// >>, <<, >>>
		int x = 8;
		int y = 3;
		int z = x>>y; // x/(2power y)
		System.out.println("z right shift is:"+z);
		z=x<<y; //x*(2power y)
		System.out.println("z left shift is:"+z);
		
		//7. ternary operator
		String name = "John Watson";
		int ewallet = 300;
		int cabFare = 100;
		String msg = (ewallet>cabFare)?"Cab Booked":"Please recharge ewallet";
	}

}
