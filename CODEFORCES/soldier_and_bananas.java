package CODEFORCES;
import java.util.Scanner;
public class soldier_and_bananas{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        int w=sc.nextInt();
        int cost=k;
        for(int i=2;i<=w;i++)
        cost=cost+(i*k);
        if(cost>n)
        System.out.println(cost-n);
        else
        System.out.println(0);
    }
}