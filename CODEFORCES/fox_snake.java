package CODEFORCES;
import java.util.*;
public class fox_snake {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i%4==0 && j==1)
                    System.out.print("#");
                else if(i%2==0 && j==m && i%4!=0)
                    System.out.print("#");
                else if(i%2==0)
                    System.out.print(".");
                else 
                    System.out.print("#");
            }
            System.out.println();
        }
        sc.close();
    }
}
