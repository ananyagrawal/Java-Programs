package LEETCODE;
import java.util.*;
public class substringsOfSizeThreeWithDistinct {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int nextIndex[]=new int[128];
        int r=0, l=0;
        int count=0;
        int res=0;
        int n=s.length();
        for(r=0;r<n;r++){
            l=Math.max(nextIndex[s.charAt(r)],l);
            count=r-l+1;
            nextIndex[s.charAt(r)]=r+1;
            if(count>=3){
                res++;
                count=0;
            }
        }
        System.out.println(res);
    }
}
