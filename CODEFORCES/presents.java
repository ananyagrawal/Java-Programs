package CODEFORCES;
import java.util.Scanner;
public class presents {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int c=0;
        while(n>0){
            c++;
            int b=sc.nextInt();
            a[b-1]=c;
            n--;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
