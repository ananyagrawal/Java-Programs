package CODEFORCES;
import java.util.*;
public class vasyaHipster {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int b=sc.nextInt();
        int n=0;
        int d=0;
        if(r>b){
            n=b;
            d=(r-b)/2;
        }
        else if(r<b){
            n=r;
            d=(b-r)/2;
        }
        else 
        n=r;
        System.out.println(n+" "+d);
        sc.close();
    }
}
