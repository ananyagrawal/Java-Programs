package CHEFAPPS;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class solution
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0){
		    int s=sc.nextInt();
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int z=sc.nextInt();
		    int remaining=s-(x+y);
		    if(z>remaining){
		        if((remaining+x)>=z || (remaining+y)>=z)
		        System.out.println(1);
		        else
		        System.out.println(2);
		    }
		    else
		    System.out.println(0);
		    t--;
		}
	}
}
