package CODEFORCES;
import java.util.Scanner;
public class calcutaltingFunction {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long result=0;
        if(n%2==0)
        result=n/2;
        else
        result= -(n+1)/2;
        System.out.println(result);
    }
}