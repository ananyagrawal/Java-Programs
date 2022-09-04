package CODEFORCES;
import java.util.Scanner;
public class word {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int u=0,l=0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c>=65 && c<=90)
            u++;
            else
            l++;
        }
        if(u>l)
        System.out.println(s.toUpperCase());
        else
        System.out.println(s.toLowerCase());
    }
}
