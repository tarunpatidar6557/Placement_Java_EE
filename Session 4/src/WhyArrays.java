
public class WhyArrays {

	public static void main(String[] args) {
		int usaTotalCases = 5678325;
		int usaNewCases = 6543;
		int usaNewRecovered = 8768;
		
		int indiaTotalCases = 578325;
		int indiaNewCases = 643;
		int indiaNewRecovered = 65768;
		
		//whenever we have a lot of data in homogeneous profile:)
		int[] usaCases = {5678325,6543,8768};
		int[] indiaCases = {578325,643,65768};
		
		//update the value in array
		indiaCases[1] = 34511;
		
		//read the array data
		for(int i=0; i<usaCases.length; i++){
			System.out.println(usaCases[i]+" ");
		}
		System.out.println();
		
		//delete happens automatically when we exit the main method
		//but for cleaning of heap memory we have a program which runs after a certain interval of time again and again
		//Garbage collector in JVM -> removes unused objects from the heap area.
		
		System.gc(); //explicit request to garbage collector
		

	}

}
