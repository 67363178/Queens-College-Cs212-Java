import java.util.Scanner;
import java.io.*;

public class Lab
{
	public static void main(String[] args) throws IOException
	{
	Scanner kb = new Scanner(System.in);
	String filename, word, y="STOP";

	System.out.println("Enter file name: ");
	filename=kb.nextLine(); //Get the filename

for(;;){
	boolean x=false;
	System.out.println("Enter a word, <STOP> to exit ");	
	word=kb.nextLine();

	
	if(word.equals(y))
	{
		System.exit(0);
	}

		

	//open file
	File file = new File(filename);
	Scanner inputfile=new Scanner(file);

	//Read

	while(inputfile.hasNext())
	{
		String line =inputfile.nextLine();
		if(line.equalsIgnoreCase(word))
		{
		x=true;	
		}
		
		
	}
			
		if(x==true)
		{
 			System.out.println("You enter "+word+" and it is in a wordArray.");
		}	
		else System.out.println("You enter "+word+" and it is not in a wordArray.");

	//Close file
	inputfile.close();

	}


}

}