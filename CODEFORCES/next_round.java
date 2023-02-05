package CODEFORCES;
import java.util.Scanner;
public class next_round {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int count=0;
        int kscore=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(i==(k-1))
            kscore=arr[i];
        }
        for(int i=0;i<n;i++){
            if(arr[i]>=kscore && arr[i]>0)
                count++;
        }
        System.out.println(count);
    }
}
