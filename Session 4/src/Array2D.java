
public class Array2D {

	public static void main(String[] args) {
		int[][] worldCovidCases = {{5678325,6543,8768},{578325,643,65768},{453441,5435,9055},{233245,90445,6748}};
		System.out.println(worldCovidCases);
		System.out.println(worldCovidCases.length);
		System.out.println(worldCovidCases[0]);
		System.out.println(worldCovidCases[0].length);
		
		//System.out.println(worldCovidCases[0][2]);
		
		for(int i=0; i<worldCovidCases.length; i++){
			for(int j=0; j<worldCovidCases[i].length;j++){
				System.out.print(worldCovidCases[i][j]+" ");
			}
			System.out.println();
		}
		
		//enhanced for loop in 2d;
		for(int[]array:worldCovidCases){
			for(int element:array){
				System.out.print(element+" ");
			}
			System.out.println();
		}
		
		//n-d array is collection of n-1 d arrays
		
		int[][] array = new int[5][3]; //5 rows and 3 columns
		
		int[][] arr = new int[5][1]; // 5 rows but columns not decided yet,, a jagged array
		arr[0] = new int[3];
		arr[1] = new int[4];
		arr[2] = new int[5];
		arr[3] = new int[2];
		arr[4] = new int[6];
		for(int[]arrr:arr){
			for(int element:arrr){
				System.out.print(element+" ");
			}
			System.out.println();
		}
		
		

	}

}
