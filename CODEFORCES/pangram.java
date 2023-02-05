package CODEFORCES;
import java.util.*;
public class pangram {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next().toLowerCase();
        int count=0;
        char character;
        if(n<26)
        System.out.println("NO");
        else{
            for(int i=97;i<=122;i++){
                character=(char)i;
                if(s.contains(String.valueOf(character)))
                count++;
            }
            if(count>=26)
            System.out.println("YES");
            else 
            System.out.println("NO");
        }
        sc.close();
    }
}
