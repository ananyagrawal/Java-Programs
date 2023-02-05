package CODEFORCES;
import java.util.*;

public class antonDanik {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int a=0,d=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='A')
            a++;
            else 
            d++;
        }
        if(a>d)
        System.out.println("Anton");
        else if(a==d)
        System.out.println("Friendship");
        else 
        System.out.println("Danik");
    }
}
