import java.util.*;
class reverse1
{
	static int r=0;
	static int rev(int n)
	{
		if(n==0)
		{
			return r;
		}
		else
		{
			int d=n%10;
			r=r*10+d;
			rev(n/10);
		}
		return r;	
	}
	public static void main(String args[])
	{
		int n=567;
		int ans=rev(n);
		System.out.println(ans);
	}
}