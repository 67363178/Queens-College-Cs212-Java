
import java.awt.GridLayout;
import javax.swing.*;        

public class Lab11 {
    
   public static void main(String[] args) {
        //createAndShowGUI();
	   JFrame frame1 =new JFrame();
	   JTextArea textArea1=new JTextArea(10,50);
	   JLabel Label1 = new JLabel();
        readAndDisplayMatrix(frame1, textArea1, Label1 );
   }
   
   private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize( 100,100);//width, height);
        frame.setLocation(200,200);//x, y);
        frame.setLayout(new GridLayout(2,1));

        JTextArea textArea = new JTextArea(5, 20);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.getContentPane().add(scrollPane);
        JLabel label = new JLabel("The sum of the numbers in the matrix is: ");
        frame.getContentPane().add(label);

        textArea.setText("The matrix should print here");
        
        //Display the window.
        frame.pack();
        frame.setVisible(true);
        
        readAndDisplayMatrix(frame, textArea, label);
    }
   
   private static void readAndDisplayMatrix(JFrame myFrame, JTextArea myText,
                                            JLabel myLabel) {
   /*
    * Fill in this method.   
    * It should fill the text area with the matrix (as you did to a
    * message dialog in a previous lab, calculate the sum (code from
    * a previous lab) and set the text of the label to show the sum.
    * Re-display the JFrame using the setVisible(true) method. The
    * matrix is given here.
    */
   
   int[][] myMatrix = {{1,2,3,4},{4,5,6,7},{7,8,9,10}};
   int sum=0;
   		for(int i=0; i<3; i++){
   			for(int c=0; c<4; c++){
   				//System.out.println(myMatrix[i][c]);
   				sum=sum+myMatrix[i][c];
   			}
   		}
   
   myFrame.setTitle("Title");
   myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   myFrame.setSize(500,500);//width, height);
   myFrame.setLocation(200,200);//x, y);
   myFrame.setLayout(new GridLayout(2,1));
   
   //myFrame.pack();
   myFrame.setVisible(true);
   JScrollPane scrollPane = new JScrollPane(myText);
   myFrame.getContentPane().add(scrollPane);
   myLabel =new JLabel("The sum is"+sum);
   myFrame.getContentPane().add(myLabel);
   String x="";
   int num;
   for(int r=0; r<3; r++){
	   for(int c=0; c<4; c++){
		  
		   num =myMatrix[r][c];
		   x=x+Integer.toString(num);
		     myText.setText(x);
	   }
   }
 
   		
   		
   }

        
}