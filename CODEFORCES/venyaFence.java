package CODEFORCES;
import java.util.Scanner;
public class venyaFence {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int h=sc.nextInt();
        int w=0;
        while(n>0){
            int a=sc.nextInt();
            if(a>h){
                w+=2;
            }
            else
            w++;
            n--;
        }
        System.out.println(w);
    }
}
