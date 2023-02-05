package CODEFORCES;
import java.util.*;
public class divisibilityProblem{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int n=0;
            if(a%b==0)
            n=0;
            else if(a<b)
            n=b-a;
            else
            n=b-(a%b);
            System.out.println(n);
            t--;
        }
    }
}