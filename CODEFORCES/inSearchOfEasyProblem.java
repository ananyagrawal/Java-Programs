package CODEFORCES;
import java.util.Scanner;
public class inSearchOfEasyProblem{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        while(n>0){
            int a=sc.nextInt();
            if(a==1){
                c++;
                break;
            }
            n--;
        }
        if(c==1)
        System.out.println("HARD");
        else
        System.out.println("EASY");
    }
}