//trying to print the chess board
public class Loops {

	public static void main(String[] args) {
		char whiteSquare = '\u25A1';
		char blackSquare = '\u25A0';
		//System.out.print(whiteSquare);
		//System.out.print(blackSquare);
		
		//int idx = 1;
		/*while(idx<=4){
			System.out.print(whiteSquare+" ");
			System.out.print(blackSquare+" ");
			System.out.print(idx);
			idx++;
		}*/
		/*do{
			System.out.print(whiteSquare+" ");
			System.out.print(blackSquare+" ");
			idx++;
		}while(idx<=4);*/
		
		for(int idx=1; idx<=4; idx++){
			System.out.print(whiteSquare+" "+blackSquare+" ");
		}

	}

}
