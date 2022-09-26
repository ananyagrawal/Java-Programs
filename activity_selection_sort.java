import java.util.*;
class activity_selection_sort
{
	public static void printMaxActivities(int s[], int f[], int n)
	{
	int i, j;
	System.out.print("Following activities are selected : \n");
	i = 0;
	System.out.print(i+" ");
	for (j = 1; j < n; j++)
	{
		if (s[j]  >= f[i])
		{
			System.out.print(j+" ");
			i = j;
		}
	}
	}
	public static void main(String[] args)
	{
        System.out.println("Anany Agrawal\n1000014386");
        int s[] =  {1, 4, 3, 5, 8, 5};
        int f[] =  {2, 4, 6, 7, 9, 9};
        int n=6;
	printMaxActivities(s, f, n);
	}
	
}
