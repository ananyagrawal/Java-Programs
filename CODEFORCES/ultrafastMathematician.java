package CODEFORCES;
import java.util.Scanner;
public class ultrafastMathematician{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c="";
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)==b.charAt(i)){
                c+="0";
            }
            else
            c+="1";
        }
        System.out.println(c);
    }
}