import java.io.*;
import java.util.*;
class Numcount
{
public static void main(String args[])
	{
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the input");
	String a=input.nextLine();
	int count=0;
	for(int i=0;i<a.length();i++)
	{
	    if((a.charAt(i)>='0')&&(a.charAt(i)<='9'))
	    {
		count++;
	     }
	}
	System.out.println(count);
}}
