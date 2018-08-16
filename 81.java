/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int w,o,f;
		Scanner sc=new Scanner(System.in);
		w=sc.nextInt();
		o=sc.nextInt();
		if((w>=Math.pow(2,32))&&(o>=Math.pow(2,32)))
		{
			System.out.println("End of String");
		}
		else
		{
			f=o-w;
			System.out.println(f);
		}
	}
}
