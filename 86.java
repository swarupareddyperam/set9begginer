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
		String str=sc.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<str.length();j++)
			{
			if((i!=j)&&(str.charAt(i)==str.charAt(j)))
			{
				count++;
			}
		
		}
		}
		if(count==0)
		{
			System.out.println("yes");
		}
	
	else
	{
		System.out.println("no");
	}
}
}
