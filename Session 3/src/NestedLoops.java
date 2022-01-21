
public class NestedLoops {

	public static void main(String[] args) {
		for(int i=1; i<=3; i++){
			System.out.println(">> i is: "+i);
			for(int j=1; j<=5; j++){
				System.out.println(j+" ");
			}
			System.out.println();
		}
		
		//print entire chessboard
		
		char whiteSquare = '\u25A1';
		char blackSquare = '\u25A0';
		
//		for(int i=0; i<8; i++){
//			for(int j=0 j<8; j++){
//				if(i%2==0){
//					System.out.println((j+1)%2+" ");
//				}else{
//					System.out.println(j%2+" ");
//				}
//			}
//		}
		
		for(int i=0; i<8; i++){
			for(int j=0; j<8; j++){
				if(i%2==0){
					char square = ((j+1)%2==0)?blackSquare:whiteSquare;
					System.out.println(square+" ");
				}else{
					char square = (j%2==0)?blackSquare:whiteSquare;
					System.out.println(square+" ");
				}
			}
			System.out.println();
		}

	}

}
