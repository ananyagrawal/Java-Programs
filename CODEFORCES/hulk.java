package CODEFORCES;
import java.util.Scanner;
public class hulk {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s= "I hate";
        for(int i=2;i<=n;i++){
            if(i%2==0)
            s+=" that I love";
            else
            s+=" that I hate";
        }
        System.out.println(s+" it");
    }
}
