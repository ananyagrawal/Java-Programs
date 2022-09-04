package CODEFORCES;
import java.util.Scanner;
public class elephant{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if(x<=5)
        System.out.println(1);
        else{
            int d=x/5;
            int r=x%5;
            if(r==0)
            System.out.println(d);
            else
            System.out.println(d+1);
        }
    }
}