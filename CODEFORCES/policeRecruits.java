package CODEFORCES;
import java.util.*;
public class policeRecruits {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int count=0;
        while(n>0){
            int b=sc.nextInt();
            if(b>0)
            a+=b;
            else{
                if(a>0)
                a--;
                else
                count++;
            }
            n--;
        }
        System.out.println(count);
        sc.close();
    }
}
