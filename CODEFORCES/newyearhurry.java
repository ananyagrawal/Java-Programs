package CODEFORCES;
import java.util.*;
public class newyearhurry {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=240-sc.nextInt();
        int ans=0;
        for(int i=1;i<=n;i++){
            if(t>=5*i){
                t-=5*i;
                ans++;
            }
            else
            break;
        }
        System.out.println(ans);
        sc.close();
    }
}
