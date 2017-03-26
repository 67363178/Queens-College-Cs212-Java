public class Lab3{
public static void main (String [] arg){
float fahreheit= 98.6F, centigrade;
centigrade =(fahreheit-32)/1.8F;

System.out.println("The fahreheit is "+fahreheit+" and the centigrade is "+ centigrade);

double g=0;

for(int i =0; i<9; i++){

	if(i==8){
	System.out.print(g);
	break;
	}

		System.out.print(g+",");
		g=g+5;

}

System.out.println();

g=0;
while(g<=40){

if (g==40){
System.out.print(g);
break;

}
		System.out.print(g+",");
		g=g+5;
}


}
}