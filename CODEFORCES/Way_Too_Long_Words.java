package CODEFORCES;
import java.util.*;
public class Way_Too_Long_Words{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            String s=sc.next();
            int l=s.length();
            if(l>10){
                System.out.println(""+s.charAt(0)+(l-2)+s.charAt(l-1));
            }
            else
            System.out.println(s);
            n--;
        }
    }
}