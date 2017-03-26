import javax.swing.JOptionPane;
import java.io.*;
import java.util.Scanner;
public class Lab5
{
	public static void main(String [] arg) throws IOException
	{
String x, y="STOP", filename;
filename=getFilename();
			
	for(;;){
	x=JOptionPane.showInputDialog("Enter a word in lowercase: ");
	
		if(x.equals(y)){
			System.exit(0);
		}

	
		
		if(wordIsThere(x, filename)==true){
		JOptionPane.showMessageDialog(null, "You enter "+x+" and it is in a wordArray.");
		}
		else
		JOptionPane.showMessageDialog(null, "You enter "+x+" and it is not in a  wordArray.");

	
	}



	public static String getFilename()
		{
		String file;

		file=JOptionPane.showInputDialog("File name: ");
	

	
		return file;
		}


public static boolean wordIsThere(String word, String filename) {

//open a file
 	File myFile=new File(filename);
	Scanner inputFile= new Scanner(myFile);

//read
	while(inputFile.hasNext()){
	if(word.equals(inputFile.nextString())){
	return true;
	}
	}

//close
	inputFile.close();
	return false;

	


}

		


}