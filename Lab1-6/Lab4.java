import javax.swing.JOptionPane;
public class Lab4{
public static void main(String [] arg){
String x, y="STOP";
String[] wordArray = { "hello", "goodbye", "cat", "dog", "red", "green", "sun", "moon" };
			
	for(;;){
	x=JOptionPane.showInputDialog("Enter a word in lowercase: ");
	
		if(x.equals(y)){
			System.exit(0);
		}

	
		
		if(wordIsThere(x, wordArray)==true){
		JOptionPane.showMessageDialog(null, "You enter "+x+" and it is in a wordArray.");
		}
		else
		JOptionPane.showMessageDialog(null, "You enter "+x+" and it is not in a  wordArray.");

	
	}

}

public static boolean wordIsThere(String findMe, String[] theList) {

	for(int i=0; i<8; i++){

		if(findMe.equals(theList[i])){
			return true;
			}
			

		}
	return false;

	}



}



