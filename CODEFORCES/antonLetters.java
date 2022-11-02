package CODEFORCES;
import java.util.*;
public class antonLetters {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Set<Character> charset=new HashSet<Character>();
        for(int i=0;i<s.length()-1;i++){
            char ch=s.charAt(i+1);
            if(ch==',' || ch=='}'){
                char c=s.charAt(i);
                charset.add(c);
            }
        }
        int n=s.length();
        if(n>2)
        System.out.println(charset.size());
        else
        System.out.println(0);
        sc.close();
    }
}
