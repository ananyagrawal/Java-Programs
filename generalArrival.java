import java.util.*;
public class generalArrival{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int max=a[0];
        int min=a[0];
        int max_index=0,min_index=0;
        for(int i=0;i<n;i++){
            if(a[i]>max){
                max=a[i];
                max_index=i;
            }
            if(a[i]<=min){
                min=a[i];
                min_index=i;
            }
        }
        int result=(n-min_index-1)+max_index;
        if(max_index>min_index)
        System.out.println(result-1);
        else if(max_index<min_index)
        System.out.println(result);
        else
        System.out.println(0);
        sc.close();
    }
}