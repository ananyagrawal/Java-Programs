package CODEFORCES;
import java.util.Scanner;
public class drinks {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double result=0;
        int i=n;
        while(i>0){
            result+=sc.nextInt();
            i--;
        }
        result=result/n;
        System.out.println(result);
    }
}
