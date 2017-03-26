import java.util.StringTokenizer;

public class TwoDimArray {

	public static int[][] myArray = {{1,2,3},{4,5,6},{7,8,9}};
	
	public static void main(String[] args) {
		String myFile="twodimension8.txt";
		fillArray(myFile);
		myArray = fillArray("twodimension8.txt");	
		printArray(myArray);
	}
	
	private static void printArray (int[][] theArray) {
		for (int i=0; i<theArray.length; i++) {
			for (int j=0; j<theArray[i].length;j++)
				display(theArray[i][j]);
			System.out.println();
		}
	}
	
	private static void display (int num){
		System.out.print(num+" ");
	}
	
	private static void printArrayEven(int[][] theArray){
		for (int r=0; r<theArray.length; r++){
			for (int c=0; c<theArray[r].length; c++) {
				if (theArray[r][c]%2 == 0)
					System.out.print(theArray[r][c] + " ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
	}
	

	public static int[][] fillArray(String myFile) {
		TextFileInput reader = new TextFileInput(myFile); 
		String line = reader.readLine(); 
		StringTokenizer tokenizer = new StringTokenizer(line, ","); 
		String token = tokenizer.nextToken(); 
		int numRows = Integer.parseInt(token); 
		
		token = tokenizer.nextToken(); 
		int numCols = Integer.parseInt(token); 
		
		int[][] array = new int[numRows][numCols]; 
		
		for (int i = 0; i < numRows; ++i) { 
			line = reader.readLine(); 
			tokenizer = new StringTokenizer(line, ","); 
			for (int j = 0; j < numCols; ++j) { 
				token = tokenizer.nextToken(); 
				array[i][j] = Integer.parseInt(token); 
			}
		}
		
		reader.close();
		return array; 
	}
}
