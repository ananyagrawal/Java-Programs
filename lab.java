import java.util.*;

public class lab {

    void factorial()
    {
        Scanner in=new Scanner(System.in);
        int n,fact=1,i;
        System.out.println("Enter the number");
        n=in.nextInt();
        for(i=n;i>=1;i--)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of the number : "+fact);

    }

    int factorial(int n)
    {
        int fact=1,i;
        for(i=n;i>=1;i--)
        {
            fact=fact*i;
        }
        return fact;
    }


    public static void main(String []args)
    {
       Scanner in=new Scanner(System.in);
       int n;
       System.out.println("Enter 1 to find factorial of a number without passing a number");
       System.out.println("Enter 2 to find factorial of a number by passing a number");
       System.out.println("Enter your choice");
       n=in.nextInt();
       lab obj=new lab();
       switch(n)
       {

           case 1:
               obj.factorial();
               break;

           case 2:
               int no,ans;
               System.out.println("Enter the number whose factorial you want to find");
               no=in.nextInt();
               ans=obj.factorial(no);
               System.out.println("Factorial of "+no+" is "+ans);
               break;

           default:
               System.out.println("Enter either 1 or 2 !!");


       }

    }

}