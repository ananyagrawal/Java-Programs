package LEETCODE;
import java.util.*;
public class longestSubstringWithoutRepeating {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int r=0,l=0;
        int[] nextIndex=new int[128];
        int n=s.length();
        int longest=0;
        for(r=0;r<n;r++){
            l=Math.max(nextIndex[s.charAt(r)],l);
            longest=Math.max(longest,r-l+1);
            nextIndex[s.charAt(r)]=r+1;
        }
        System.out.println(longest);
    }
}
