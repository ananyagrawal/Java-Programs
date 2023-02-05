package CODEFORCES;
import java.util.*;
public class meetingFriends{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=0;
        if(a==b && a==c)
        d=0;
        else if(a>b && a>c){
            if(b>c)
            d=(a-b)+(b-c);
            else
            d=(a-c)+(c-b);
        }
        else if(b>a && b>c){
            if(c>a)
            d=(b-c)+(c-a);
            else
            d=(b-a)+(a-c);
        }
        else if(c>a && c>b){
            if(a>b)
            d=(c-a)+(a-b);
            else
            d=(c-b)+(b-a);
        }
        else{
            if(a==b)
            d=Math.abs(a-c);
            else if(a==c)
            d=Math.abs(a-b);
            else 
            d=Math.abs(b-a);
        }
        System.out.println(d);
    }
}