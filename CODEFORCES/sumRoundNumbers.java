package CODEFORCES;
import java.util.*;
public class sumRoundNumbers {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=0;
            int i=0;
            int arr[]=new int[5];
            while(n>0){
                int d=n%10;
                k++;
                if(d!=0){
                    arr[i]=(int)(d*Math.pow(10,k-1));
                    i++;
                }
                n=n/10;
            }
            System.out.println(i);
            for(int j=0;j<i;j++){
                if(j!=i-1)
                System.out.print(arr[j]+" ");
                else
                System.out.println(arr[j]);
            }
        }
        sc.close();
    }
}
