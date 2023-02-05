package CODEFORCES;
import java.util.*;
public class buyShovel {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int r=sc.nextInt();
        for(int i=1;i<10;i++){
            int p=i*k;
            if(p%10==0 || (p-r)%10==0){
                System.out.println(i);
                break;
            }
        }
    }
}
