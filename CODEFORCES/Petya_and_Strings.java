package CODEFORCES;
import java.util.*;
public class Petya_and_Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        if(a.equalsIgnoreCase(b))
        System.out.println(0);
        else if(a.compareToIgnoreCase(b)>0)
        System.out.println(1);
        else
        System.out.println(-1);
    }
}
