import java.util.*;
import java.lang.*;
import java.io.*;
class Hexadecimal
{
	public static void convert(int j){
	 if(j<1)
	 	return;
	 convert(j/16);
	 if(j%16==10)
	 	System.out.print("A");
	 else if(j%16==11)
	 	System.out.print("B");
	 else if(j%16==12)
	 	System.out.print("C");
	 else if(j%16==13)
	 	System.out.print("D");
	 else if(j%16==14)
	 	System.out.print("E");
	 else if(j%16==15)
	 	System.out.print("F");
	 else if (j%16<10)
	 System.out.print(j%16);
     
	}
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        convert(n);
		}}
