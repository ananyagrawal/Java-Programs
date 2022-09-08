package CODEFORCES;
import java.util.Scanner;
public class george_accommodation{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        while(n>0){
            int p=sc.nextInt();
            int q=sc.nextInt();
            if((q-p)>=2)
            count++;
            n--;
        }
        System.out.println(count);
    }
}