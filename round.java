import java.util.*;
public class round {
    public static void main(String args[])
    {
        System.out.println("Name: Anany Agrawal SAP ID: 1000014386");
        float x,y;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two numbers");
        x=sc.nextFloat();
        y=sc.nextFloat();
        float a,b;
        a=Math.round(x*10000);
        b=Math.round(y*10000);
        a=a/10000;
        b=b/10000;
        if(a==b)
        System.out.println("Same");
        else
        System.out.println("Not Same");
        sc.close();
    }
}
