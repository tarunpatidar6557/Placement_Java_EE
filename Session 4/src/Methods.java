
public class Methods {
	int printArray1(int[] array){
		int max=array[0];
		for(int element: array){
			if(element>max){
				max=element;
			}
		}
		return max;
	}
	static int printArray2(int[] array){
		int max=array[0];
		for(int element: array){
			if(element>max){
				max=element;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] productPrices = {343, 555, 232, 656, 756};
		int[] covidCases = {543232, 54454, 765344, 65455,89764};
		int[] scores = {12,34,46,76,43,86,90,32,43,67,71};
		
		//method -> return type, name, arguments
		
		//to execute not static methods we need reference to the object
		Methods ref = new Methods();
		
		//only class name can be used to access the static methods
		System.out.println(ref.printArray1(covidCases));
		
		System.out.println(Methods.printArray2(productPrices));
		//non static methods->belongs to objects
		//needs reference of object to execute them
		
	}

}
