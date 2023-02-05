package CODEFORCES;
import java.util.*;
public class games {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int h_color[]=new int[n];
        int g_color[]=new int[n];
        for(int i=0;i<n;i++){
            h_color[i]=sc.nextInt();
            g_color[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(h_color[i]==g_color[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
