package CODEFORCES;
import java.util.Scanner;
public class translation {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        String r="";
        for(int i=s.length()-1;i>=0;i--){
            r+=s.charAt(i);
        }
        if(r.equals(t))
        System.out.println("YES");
        else
        System.out.println("NO");
    }
}
