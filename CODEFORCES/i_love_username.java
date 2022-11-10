package CODEFORCES;
import java.util.*;
public class i_love_username{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int max=sc.nextInt();
        int min=max;
        int count=0;
        for(int i=0;i<n-1;i++){
            a[i]=sc.nextInt();
            if(a[i]>max){
                max=a[i];
                count++;
            }
            else if(a[i]<min){
                min=a[i];
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}