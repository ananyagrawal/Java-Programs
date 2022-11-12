package CODEFORCES;
import java.util.*;
public class restoringThreeNumbers {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[4];
        for(int i=0;i<4;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int x=a[3]-a[0];
        int y=a[3]-a[1];
        int z=a[3]-a[2];
        System.out.println(x+" "+y+" "+z);
    }
}
