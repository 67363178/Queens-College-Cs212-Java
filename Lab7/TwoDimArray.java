public class TwoDimArray {

	public static int[][] myArray = {{1,2,3},{4,5,6},{7,8,9}};
	
	public static void main(String[] args) {
		String myFile="twodimesion.txt";
		printArray(myArray);
		System.out.println();
		printArrayEven(myArray);
		System.out.println();
		printArray(fillArray(myFile)); //I cheated here.
	
	//for(int i=0;i<4;i++){
	//	for(int c=0;c<5;c++){
	//System.out.println(fillArray(myFile));

	//	}
		//Why won't it work?

	//}
		
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

		for(int i=0; i<theArray.length; i++){
			for(int c=0; c<theArray.length; c++){
				if(theArray[i][c]%2!=0){
					
					System.out.print("* ");
					
				}
				else System.out.print(theArray[i][c]+" ");		
					
			}
		System.out.println();;
		}
	
	}

	public static int [][] fillArray(String filename){
		int l=0;
		String text="";
		TextFileInput in= new TextFileInput(filename);
		String line = in.readLine();
		while( l<2 && line != null ){
			 text=text+line;
			 line=in.readLine();
		l++;
		}
		

		//Find the size of the array
		//System.out.println(text);
		int num=Integer.parseInt(text);
		int c=num%10; //col
		int r=num/10; //row
		//System.out.print(num+" "+r+" "+" "+c);
		int [][]fArray=new int[r][c];

		//
		while(line!=null){	
	
				for(int i=0; i<r; i++){
					for(int j=0; j<c; j++){
						int check =Integer.parseInt(line);
						fArray[i][j]=check;
						line=in.readLine();
					}
				}
			
		}
		

	in.close();
	//for(int i=0;i<r;i++){
	//	for(int j=0;j<c;j++){
	//System.out.println(fArray[i][j]);
//
//		}
//	}
		
	return fArray;
	}
	

}