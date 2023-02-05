import java.util.Scanner;
public class fibonacci {
    static void fib(int a,int b,int n)
    { 
        int sum=0;
        if(n>0){
        sum=a+b;
        System.out.print(sum+" ");
        fib(b,sum,n-1);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fib(0,1,n);
        sc.close();
    }
}
