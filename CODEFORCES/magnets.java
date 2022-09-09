package CODEFORCES;
import java.util.Scanner;
public class magnets {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String a=sc.next();
        int count=0;
        while(n>1){
            String b=sc.next();
            if(a.equals(b)==false){
                count++;
            }
            a=b;
            n--;
        }
        System.out.println(count+1);
    }
}
