import javax.swing.JOptionPane;
import java.io.*;
import java.util.Scanner;
public class Lab6{
public static void main(String arg[]) throws IOException
{
Scanner kb= new Scanner(System.in);

int [] arrayy0=new int [100];
int sum1, size=0, i=0;

double ave;
String filename;

System.out.println("Enter file name: ");
filename=kb.nextLine();

//open file
File file=new File(filename);
Scanner inputfile = new Scanner(file);

//read
while(inputfile.hasNext())
{
	int line=inputfile.nextInt();

arrayy0[i]=line;
i++;
	size++;
	

}

	//Close file
	inputfile.close();

int [] arrayy= new int[size];
for( i=0; i<size; i++){

arrayy[i]=arrayy0[i];
System.out.println(arrayy[i]);
}

sum1=sum(arrayy,size);
ave=average(arrayy, size);

JOptionPane.showMessageDialog(null, "The sum is "+sum1);
JOptionPane.showMessageDialog(null, "The average is "+ave);
}


//-------------------------Method----------------------------------------
public static int sum (int [] myArray, int myArraySize){
int sum0=0;

for(int i=0; i<myArraySize; i++){
sum0= myArray[i]+sum0;

}

return sum0;
}

public static int average (int [] myArray, int myArraySize){
double ave=0;
int sum0=0;

for(int i=0; i<myArraySize; i++){
sum0= myArray[i]+sum0;

}

return sum0/myArraySize;



}

}