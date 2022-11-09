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
        if(a.length==b.length){
            int flag=0;
            for(int i=0;i<a.length;i++){
                if(a[i]!=b[i]){
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            System.out.println("YES");
            else
            System.out.println("NO");
        }
        else
        System.out.println("NO");
        sc.close();
    }
}
