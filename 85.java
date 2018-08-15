/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		   Scanner sc=new Scanner(System.in);
	     String s1=sc.nextLine();
	     int len=s1.length();
	     String s2="";
	     String s3="";
	     for(int i=0;i<len;i++)
	     {
	     	if(i%2==0)
	     	{
	     		s2=s2+s1.charAt(i);
	     	}
	     	else
	     	{
	     		s3=s3+s1.charAt(i);
	     	}
	     }
	     System.out.println(s2+" "+s3);
	    // System.out.println(s3);
	}
}
