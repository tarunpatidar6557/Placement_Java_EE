
public class BreakAndContinue {

	public static void main(String[] args) {
		int myFloor=5;
		for(int floor =1; floor<=10; floor++){
			System.out.println("Lift at floor #"+floor);
			if(floor==myFloor){
				System.out.println("My floor arrived");
				break; //to terminate the loop
			}
		}
		System.out.println();
		
		for(int roll=1; roll<=10; roll++){
			if(roll<=5){
				continue;
			}
			System.out.println("Lets take viva of "+roll);
			System.out.println("viva started");
			System.out.println("viva finished");
		}

	}

}
