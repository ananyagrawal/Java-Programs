package CODECHEF;
import java.util.*;
public class easyPronunciation {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            String s=sc.next();
            int count=0;
            for(int i=0;i<n;i++){
                char ch=s.charAt(i);
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                count=0;
                else
                count++;
                if(count>=4)
                break;
            }
            if(count>=4)
            System.out.println("NO");
            else
            System.out.println("YES");
            t--;
        }
    }
}
