package CODEFORCES;
import java.util.*;
public class amusingJoke {
        public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String gname=sc.next();
        String hname=sc.next();
        String pile=sc.next();
        String s=gname+hname;
        char a[]=s.toCharArray();
        char b[]=pile.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        String x= new String(a);
        String y= new String(b);
        if(x.equals(y))
        System.out.println("YES");
        else
        System.out.println("NO");
        sc.close();
    }
}
