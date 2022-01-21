
public class Arrays {

	public static void main(String[] args) {
		int confirmedCases = 123456;
		int activeCases = 43225;
		int recoveredCases = 765456;
		int vaccinated = 44341;
		
		int[] cases = {123456,43225,765456,44341};
		
		System.out.println("confirmed cases "+confirmedCases); //value will be printed
		System.out.println("cases "+cases); //Hashcode will be printed
		
		for(int element: cases){
			System.out.println(element);
		}
	}

}
